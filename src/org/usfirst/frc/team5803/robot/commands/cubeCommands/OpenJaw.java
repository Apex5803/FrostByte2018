package org.usfirst.frc.team5803.robot.commands.cubeCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class OpenJaw {
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kCubeEater.jawExtend();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kCubeEater.jawRetract();
	}
	
	protected void interrupted() {
	
	}
	
	
	
}


