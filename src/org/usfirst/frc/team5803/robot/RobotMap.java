/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5803.robot;
//import org.usfirst.frc.team5803.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//import org.usfirst.frc.team5803.robot.commands.*;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static DifferentialDrive joystickControl;
	//Drive Base speed controllers
	public static TalonSRX L1;
	public static VictorSPX L2;
	public static VictorSPX L3;
	public static TalonSRX R1;
	public static VictorSPX R2;
	public static VictorSPX R3;
	
	//Arm stuff
	public static TalonSRX Arm1;
	public static VictorSPX Arm2;
	public static TalonSRX Extender1;
	public static TalonSRX Extender2;
	//public static DoubleSolenoid ArmBrake;
	
	//Cube Eater stuff
	public static TalonSRX RollerT1;
	public static VictorSPX RollerT2;
	public static TalonSRX RollerB1;
	public static VictorSPX RollerB2;
	//public static DoubleSolenoid Puncher;
	//public static DoubleSolenoid Jaw;
	
	//Climber stuff
	public static DigitalInput ClimbMin;
	public static DigitalInput ClimbMax;
	
	//Wheelie bar stuff
	//public static DoubleSolenoid WheelieBar;
	
	public static void init() {
		System.out.println("INITIALIZING ROBOT SPEED CONTROLLERS11!!!!!1@1!!1");

		L1 = new TalonSRX(PortMap.DRIVE_BASE_LEFT_1);
		L1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		L1.setInverted(true);
		
		L2 = new VictorSPX(PortMap.DRIVE_BASE_LEFT_2);
		L2.follow(L1);
		L2.setInverted(true);
		
		L3 = new VictorSPX(PortMap.DRIVE_BASE_LEFT_3);
		L3.follow(L1);
		L3.setInverted(true);
		
		R1 = new TalonSRX(PortMap.DRIVE_BASE_RIGHT_1);
		R1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		
		R2 = new VictorSPX(PortMap.DRIVE_BASE_RIGHT_2);
		R2.follow(R1);
		
		R3 = new VictorSPX(PortMap.DRIVE_BASE_RIGHT_3);
		R3.follow(R1);
		
		
		Arm1 = new TalonSRX(PortMap.ARM_LEAD);
		Arm1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 0);
		Arm1.setInverted(true);
		Arm1.setSensorPhase(true);
		Arm1.configForwardSoftLimitEnable(false, 0);		
		//Arm1.configForwardSoftLimitEnable(true, 0);
		//Arm1.configForwardSoftLimitThreshold(120*4096/360,0);
		Arm1.configReverseSoftLimitEnable(false, 0);		
		//Arm1.configReverseSoftLimitEnable(true, 0);
		//Arm1.configReverseSoftLimitThreshold(0*4096,0);
		//ARM2 RUNS THE SAME DIRECTION AS ARM1
		Arm2 = new VictorSPX(PortMap.ARM_FOLLOWER);
		Arm2.follow(Arm1);
		Arm2.setInverted(true);
		
		
		Extender1 = new TalonSRX(PortMap.ARM_EXTENDER_LEAD);
		Extender1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		Extender1.setInverted(true);
		Extender1.setSensorPhase(true);
		Extender1.configForwardSoftLimitEnable(false, 0);		
		//Extender1.configForwardSoftLimitEnable(true, 0);
		//Extender1.configForwardSoftLimitThreshold(120*4096/360,0);
		Extender1.configReverseSoftLimitEnable(false, 0);	
		//Extender1.configReverseSoftLimitEnable(true, 0);
		//Extender1.configReverseSoftLimitThreshold(0*4096,0);
		
		//EXTENDER2 RUNS THE OPPOSITE DIRECTION FROM EXTENDER1
		Extender2 = new TalonSRX(PortMap.ARM_EXTENDER_FOLLOWER);
		Extender2.follow(Extender1);
		Extender2.setInverted(false);
		
		
		//ArmBrake = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
		RollerT1 = new TalonSRX(PortMap.TOP_ROLLER_LEAD);
//		RollerT1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		RollerT1.setInverted(false);
//		RollerT2 = new VictorSPX(PortMap.TOP_ROLLER_FOLLOWER);
//		RollerT2.follow(RollerT1);
//		RollerT2.setInverted(true);
		RollerB1 = new TalonSRX(PortMap.BOTTOM_ROLLER_LEAD);
//		RollerB1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		RollerB1.setInverted(true);
//		RollerB2 = new VictorSPX(PortMap.BOTTOM_ROLLER_FOLLOWER);
//		RollerB2.follow(RollerB1);
//		RollerB2.setInverted(false);
		//Puncher = new DoubleSolenoid(PortMap.PUNCHER_FORWARD_CHANNEL, PortMap.PUNCHER_REVERSE_CHANNEL);
		
		//Jaw = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
		//ClimbMin = new DigitalInput(PortMap.CLIMBER_MIN);
		//ClimbMax = new DigitalInput(PortMap.CLIMBER_MAX);
		
//		System.out.println("INITIALIZING ROBOT SPEED CONTROLLERS2222222");
		
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
