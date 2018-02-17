package org.usfirst.frc.team5803.robot.commands.armCommands;

import org.usfirst.frc.team5803.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ReleaseArm extends Command{

public ReleaseArm() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.arm.unsecure();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.arm.endSecurer();
	}
	
	protected void interrupted() {
	
	}
}
