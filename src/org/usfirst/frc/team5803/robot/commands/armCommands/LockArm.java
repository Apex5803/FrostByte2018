package org.usfirst.frc.team5803.robot.commands.armCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class LockArm {
public LockArm() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kArm.secure();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kArm.end();
	}
	
	protected void interrupted() {
	
	}
}
