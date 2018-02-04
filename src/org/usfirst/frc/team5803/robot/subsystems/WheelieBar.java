package org.usfirst.frc.team5803.robot.subsystems;

import org.usfirst.frc.team5803.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class WheelieBar extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	 
	public DoubleSolenoid WheelieBar = RobotMap.WheelieBar;
	
	public void extend() {
		WheelieBar.set(Value.kForward);
	}
	
	public void retract() {
		WheelieBar.set(Value.kReverse);
	}
	
	public void end() {
		WheelieBar.set(Value.kOff);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}