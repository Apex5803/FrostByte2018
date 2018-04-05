package org.usfirst.frc.team5803.robot.commands.armCommands;

import org.usfirst.frc.team5803.robot.Robot;
import org.usfirst.frc.team5803.robot.RobotMap;
import org.usfirst.frc.team5803.robot.subsystems.Arm;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class HoldExtenderPosition extends Command {

	public HoldExtenderPosition() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.arm);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		System.out.println("Holding Extender position");
		// double angle = RobotMap.Arm1.getClosedLoopTarget(0);
		double Extension = RobotMap.Extender1.getSelectedSensorPosition(0);
		Robot.arm.extend(ControlMode.MotionMagic, Extension);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}