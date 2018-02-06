package org.usfirst.frc.team5803.robot.commands.cubeCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class PunchCube {

	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kCubeEater.punchCube();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kCubeEater.retractPuncher();
	}
	
	protected void interrupted() {
	
	}
	
	
	
}


