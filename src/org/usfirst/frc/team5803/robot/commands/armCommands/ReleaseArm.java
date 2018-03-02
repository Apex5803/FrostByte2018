package org.usfirst.frc.team5803.robot.commands.armCommands;

import org.usfirst.frc.team5803.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ReleaseArm extends Command{

public ReleaseArm() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		if (Robot.arm.IsSecured == true) {
			Robot.arm.unsecure();
			Robot.arm.IsSecured = false;
		}
		else {
			end();
		}
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
//		Robot.arm.endSecurer();
	}
	
	protected void interrupted() {
	 end();
	}
}
