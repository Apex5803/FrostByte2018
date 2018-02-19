package org.usfirst.frc.team5803.robot.commands.cubeCommands;

import org.usfirst.frc.team5803.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpitCubeStandard extends Command {
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kCubeEater.spitCubeStandard();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kCubeEater.endRoller(); 
	}
	
	protected void interrupted() {
		end();
	}

	
	
}


