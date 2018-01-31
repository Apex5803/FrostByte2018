/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5803.robot;
import org.usfirst.frc.team5803.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;

import org.usfirst.frc.team5803.robot.commands.*;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	
	//Drive Base speed controllers
	public static WPI_TalonSRX L1;
	public static WPI_VictorSPX L2;
	public static WPI_VictorSPX L3;
	public static WPI_TalonSRX R1;
	public static WPI_VictorSPX R2;
	public static WPI_VictorSPX R3;
	
	//Arm stuff
	public static WPI_TalonSRX Arm1;
	public static WPI_VictorSPX Arm2;
	public static DoubleSolenoid Extender;
	public static DoubleSolenoid ArmBrake;
	
	//Cube Eater stuff
	public static WPI_TalonSRX RollerT1;
	public static WPI_VictorSPX RollerT2;
	public static WPI_TalonSRX RollerB1;
	public static WPI_VictorSPX RollerB2;
	public static DoubleSolenoid Puncher;
	public static DoubleSolenoid Jaw;
	
	//Climber stuff
	public static WPI_TalonSRX Climber;
	public static DigitalInput ClimbMin;
	public static DigitalInput ClimbMax;
	
	//Wheelie bar stuff
	public static DoubleSolenoid WheelieBar;
	
	public static void init() {
		L1 = new WPI_TalonSRX(PortMap.DRIVE_BASE_LEFT_1);
		L1.setInverted(true);
		
		L2 = new WPI_VictorSPX(PortMap.DRIVE_BASE_LEFT_2);
		L2.follow(L1);
		L2.setInverted(true);
		
		L3 = new WPI_VictorSPX(PortMap.DRIVE_BASE_LEFT_3);
		L3.follow(L1);
		L3.setInverted(true);
		
		R1 = new WPI_TalonSRX(PortMap.DRIVE_BASE_RIGHT_1);
		
		R2 = new WPI_VictorSPX(PortMap.DRIVE_BASE_RIGHT_2);
		R2.follow(R1);
		
		R3 = new WPI_VictorSPX(PortMap.DRIVE_BASE_RIGHT_3);
		R3.follow(R1);
		
		Arm1 = new WPI_TalonSRX(PortMap.ARM_LEAD);
		Arm2 = new WPI_VictorSPX(PortMap.ARM_FOLLOWER);
		
		Extender = new DoubleSolenoid(PortMap.ARM_EXTENDER_FORWARD_CHANNEL, PortMap.ARM_EXTENDER_REVERSE_CHANNEL);
		
		ArmBrake = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
		RollerT1 = new WPI_TalonSRX(PortMap.TOP_ROLLER_LEAD);
		RollerT2 = new WPI_VictorSPX(PortMap.TOP_ROLLER_FOLLOWER);
		
		RollerB1 = new WPI_TalonSRX(PortMap.BOTTOM_ROLLER_LEAD);
		RollerB2 = new WPI_VictorSPX(PortMap.BOTTOM_ROLLER_FOLLOWER);
		
		Puncher = new DoubleSolenoid(PortMap.PUNCHER_FORWARD_CHANNEL, PortMap.PUNCHER_REVERSE_CHANNEL);
		
		Jaw = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
		Climber = new WPI_TalonSRX(PortMap.CLIMBER);
		ClimbMin = new DigitalInput(PortMap.CLIMBER_MIN);
		ClimbMax = new DigitalInput(PortMap.CLIMBER_MAX);
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
