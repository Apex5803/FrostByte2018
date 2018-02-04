package org.usfirst.frc.team5803.robot.commands.armCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class ExtendArm {
public ExtendArm() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kArm.extend();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kArm.endExtender();
	}
	
	protected void interrupted() {
	
	}
}
