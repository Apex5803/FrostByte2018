package org.usfirst.frc.team5803.robot.commands.armCommands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5803.robot.subsystems.Arm;
import org.usfirst.frc.team5803.robot.OI;
import org.usfirst.frc.team5803.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class RotateArmManual extends Command {
	public RotateArmManual() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.arm);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
//		System.out.println("Executing Manual Arm Rotation");
		
//		if(OI.xbox1.getTriggerAxis(Hand.kLeft) > 0.75) {
//			System.out.println("running full manual test");
			if(OI.xbox2.getY(Hand.kLeft) >= 0.2 || OI.xbox2.getY(Hand.kLeft) < -0.2) {
			Robot.arm.move(0.3 * OI.xbox2.getY(Hand.kLeft)); 		
//			System.out.println("if statement achieved");
			}
			else Robot.arm.move(0);
		}		
//		else Robot.arm.move(0);
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
 