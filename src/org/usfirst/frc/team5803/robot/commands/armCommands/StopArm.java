package org.usfirst.frc.team5803.robot.commands.armCommands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5803.robot.Robot;

/**
 * An example command. You can replace me with your own command.
 */
public class StopArm extends Command {
	public StopArm() {
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

		// System.out.println("Stopping Arm");
		// Robot.arm.move(0);
	}

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
