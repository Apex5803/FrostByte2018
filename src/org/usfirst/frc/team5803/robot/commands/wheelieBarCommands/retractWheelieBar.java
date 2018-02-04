package org.usfirst.frc.team5803.robot.commands.wheelieBarCommands;

import org.usfirst.frc.team5803.robot.Robot;

public class retractWheelieBar {
public retractWheelieBar() {
		
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.kWheelieBar.retract();
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		Robot.kWheelieBar.end();
	}
	
	protected void interrupted() {
	
	}
}
