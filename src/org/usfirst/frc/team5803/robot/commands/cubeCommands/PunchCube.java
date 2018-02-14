package org.usfirst.frc.team5803.robot.commands.cubeCommands;

import org.usfirst.frc.team5803.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PunchCube extends Command{

	
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


