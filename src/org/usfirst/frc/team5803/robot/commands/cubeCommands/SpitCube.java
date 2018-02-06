package org.usfirst.frc.team5803.robot.commands.cubeCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class SpitCube {
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kCubeEater.spitCube();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kCubeEater.endRoller(); 
	}
	
	protected void interrupted() {
	
	}
	
	
	
}


