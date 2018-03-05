package org.usfirst.frc.team5803.robot.commands.armCommands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5803.robot.OI;
import org.usfirst.frc.team5803.robot.Robot;
import org.usfirst.frc.team5803.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * An example command.  You can replace me with your own command.
 */
public class ExtendArm extends Command {
	public ExtendArm() {
		// Use requires() here to declare subsystem dependencies
		//requires(Robot.kArm);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {

		
//		if(OI.xbox2.getTriggerAxis(Hand.kRight) > 0.75) {
//			System.out.println("running full manual test");
			if(OI.xbox2.getY(Hand.kRight) >= 0.2 || OI.xbox2.getY(Hand.kRight) <= -0.2) {
				Robot.arm.extend(ControlMode.PercentOutput, -1.0 * OI.xbox2.getY(Hand.kRight)); 						
				System.out.println("running extension in manual");
			}
			else {
			double Extension = RobotMap.Extender1.getSelectedSensorPosition(0);
	    	Robot.arm.extend(ControlMode.MotionMagic, Extension);
	    	System.out.println("in manual extension with no controller input, holding position");
			}
			}		
//		else Robot.arm.extend(0);
//	}
	
	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
 