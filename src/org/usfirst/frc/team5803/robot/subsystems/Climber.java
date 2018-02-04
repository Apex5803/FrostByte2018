package org.usfirst.frc.team5803.robot.subsystems;

import org.usfirst.frc.team5803.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Climber extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public DigitalInput ClimbMin = RobotMap.ClimbMin;
	public DigitalInput ClimbMax = RobotMap.ClimbMax;
	public WPI_TalonSRX Climber = RobotMap.Climber;
	public float ClimbSpeed;
	
	
	
	public void climb() {
		Climber.set(ClimbSpeed);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}