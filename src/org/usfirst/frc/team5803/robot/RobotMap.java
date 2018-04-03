/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5803.robot;
//import org.usfirst.frc.team5803.robot.subsystems.*;

import org.usfirst.frc.team5803.robot.models.BobTalonSRX;
import org.usfirst.frc.team5803.robot.subsystems.DriveBase;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.RemoteSensorSource;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
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
	public static BobTalonSRX L1;
	public static VictorSPX L2;
	public static VictorSPX L3;
	public static BobTalonSRX R1;
	public static VictorSPX R2;
	public static VictorSPX R3;
	
	//Arm stuff

	public static TalonSRX Extender1;
//	public static TalonSRX Extender2; //FOR COMP BOT
	public static VictorSPX Extender2; //FOR PRACTICE BOT
	public static DoubleSolenoid ArmBrake;
	
	//Cube Eater stuff
	public static TalonSRX RollerT1;
	public static VictorSPX RollerT2;
	public static TalonSRX RollerB1;
	public static VictorSPX RollerB2;
	public static Solenoid Puncher1;
	public static Solenoid Puncher2;
	//public static DoubleSolenoid Jaw;
	
	//Extension sensors
	public static DigitalInput HallEffect;
	
	//Climber stuff
	public static DigitalInput ClimbMin;
	public static DigitalInput ClimbMax;
	
	//Wheelie bar stuff
	//public static DoubleSolenoid WheelieBar;
	
	public static void init() {
		System.out.println("INITIALIZING ROBOT SPEED CONTROLLERS11!!!!!1@1!!1");

		L1 = new BobTalonSRX(PortMap.DRIVE_BASE_LEFT_1);
		L1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
//		L1.setInverted(true);
		L1.setInverted(false);
		L1.setSensorPhase(true);
		L1.configNominalOutputForward(0, 0);
		L1.configNominalOutputReverse(0, 0);
		L1.configPeakOutputForward(1, 0);
		L1.configPeakOutputReverse(-1, 0);
		L1.configContinuousCurrentLimit(30, 0); //THIS WORKS TO LIMIT DRIVE TRAIN CURRENT
		L1.configPeakCurrentLimit(30,0); //THIS WORKS TO LIMIT DRIVE TRAIN CURRENT
//		L1.configContinuousCurrentLimit(0, 0);
//		L1.configPeakCurrentLimit(0,0);
		L1.configPeakCurrentDuration(0, 0);
		L1.enableCurrentLimit(true);
		
		
		L2 = new VictorSPX(PortMap.DRIVE_BASE_LEFT_2);
		L2.follow(L1);
//		L2.setInverted(true);
		L2.setInverted(false);
		L2.configNominalOutputForward(0, 0);
		L2.configNominalOutputReverse(0, 0);
		L2.configPeakOutputForward(1, 0);
		L2.configPeakOutputReverse(-1, 0);
		
		
		L3 = new VictorSPX(PortMap.DRIVE_BASE_LEFT_3);
		L3.follow(L1);
//		L3.setInverted(true);
		L3.setInverted(false);
		L3.configNominalOutputForward(0, 0);
		L3.configNominalOutputReverse(0, 0);
		L3.configPeakOutputForward(1, 0);
		L3.configPeakOutputReverse(-1, 0);
		
		R1 = new BobTalonSRX(PortMap.DRIVE_BASE_RIGHT_1);
		R1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		R1.setInverted(true);
		R1.setSensorPhase(true);
		R1.configNominalOutputForward(0, 0);
		R1.configNominalOutputReverse(0, 0);
		R1.configPeakOutputForward(1, 0);
		R1.configPeakOutputReverse(-1, 0);
		R1.configContinuousCurrentLimit(30, 0); //THIS WORKS TO LIMIT DRIVE TRAIN CURRENT
		R1.configPeakCurrentLimit(30, 0); //THIS WORKS TO LIMIT DRIVE TRAIN CURRENT
//		R1.configPeakCurrentLimit(0, 0); //turn these off to turn on current limiting
//		R1.configContinuousCurrentLimit(0, 0); //turn these off to turn on current limiting
		R1.configPeakCurrentDuration(0, 0);
		R1.enableCurrentLimit(true);
		
		// configure distance sensor
		// Remote 0 will be the other side's Talon
		R1.configRemoteSensor0(L1.getDeviceID(), RemoteSensorSource.TalonSRX_SelectedSensor);
		R1.configSensorSum(FeedbackDevice.RemoteSensor0, FeedbackDevice.CTRE_MagEncoder_Relative);
		R1.configPrimaryFeedbackDevice(FeedbackDevice.SensorSum, 0.5); // distances from left and right are
																				// summed, so average them
		R1.configMaxIntegralAccumulator(DriveBase.ROTATION_PROFILE, 3000);

		// configure angle sensor
		// Remote 1 will be a pigeon
		R1.configRemoteSensor1(DriveBase.pigeon.getDeviceID(), RemoteSensorSource.Pigeon_Yaw);
		R1.configSecondaryFeedbackDevice(FeedbackDevice.RemoteSensor1, (3600.0 / 8192.0)); // Coefficient for
																						// Pigeon to

		// convert to 360
		L1.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 5, 0);
		R1.configAuxPIDPolarity(false, 0);

		R2 = new VictorSPX(PortMap.DRIVE_BASE_RIGHT_2);
		R2.follow(R1);
		R2.setInverted(true);
		R2.configNominalOutputForward(0, 0);
		R2.configNominalOutputReverse(0, 0);
		R2.configPeakOutputForward(1, 0);
		R2.configPeakOutputReverse(-1, 0);
		
		R3 = new VictorSPX(PortMap.DRIVE_BASE_RIGHT_3);
		R3.follow(R1);
		R3.setInverted(true);
		R3.configNominalOutputForward(0, 0);
		R3.configNominalOutputReverse(0, 0);
		R3.configPeakOutputForward(1, 0);
		R3.configPeakOutputReverse(-1, 0);
		
		ArmBrake = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);

		Extender1 = new TalonSRX(PortMap.ARM_EXTENDER_LEAD);
		/* choose the sensor and sensor direction */
		Extender1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 0);

		/* choose to ensure sensor is positive when output is positive */
		Extender1.setSensorPhase(true);

		/* choose based on what direction you want forward/positive to be.
		 * This does not affect sensor phase. */ 
		Extender1.setInverted(false);

		/* set the peak and nominal outputs, 12V means full */
		Extender1.configNominalOutputForward(0, 0);
		Extender1.configNominalOutputReverse(0, 0);
		Extender1.configPeakOutputForward(1, 0);
		Extender1.configPeakOutputReverse(-1, 0);
		/*
		 * set the allowable closed-loop error, Closed-Loop output will be
		 * neutral within this range. See Table in Section 17.2.1 for native
		 * units per rotation.
		 */
		Extender1.configAllowableClosedloopError(0, 0, 0);
		Extender1.configForwardSoftLimitEnable(false, 0);		
//		Extender1.configForwardSoftLimitThreshold(31000,0); //max = ~27000 
//		Extender1.configForwardSoftLimitEnable(true, 0);
		//Extender1.configReverseSoftLimitEnable(false, 0);	
		//Extender1.configReverseSoftLimitThreshold(-10,0);
		Extender1.configReverseSoftLimitEnable(false, 0);
		Extender1.configContinuousCurrentLimit(40, 0); //THIS WORKS TO LIMIT EXTENDER CURRENT
		Extender1.configPeakCurrentLimit(40,0); //THIS WORKS TO LIMIT EXTENDER CURRENT
		Extender1.configPeakCurrentDuration(0, 0);
		Extender1.enableCurrentLimit(true);
		
		
		
//		Extender2 = new TalonSRX(PortMap.ARM_EXTENDER_FOLLOWER);//FOR COMP BOT
		Extender2 = new VictorSPX(PortMap.TOP_ROLLER_FOLLOWER); //FOR PRACTICE BOT
		Extender2.follow(Extender1);
		Extender2.setInverted(true);
		
		Extender2.configReverseSoftLimitEnable(false, 0);
		Extender2.configForwardSoftLimitEnable(false, 0);
		
		Extender2.configNominalOutputForward(0, 0);
		Extender2.configNominalOutputReverse(0, 0);
		Extender2.configPeakOutputForward(1, 0);
		Extender2.configPeakOutputReverse(-1, 0);
//		Extender2.configContinuousCurrentLimit(40, 0); //THIS WORKS TO LIMIT EXTENDER CURRENT
//		Extender2.configPeakCurrentLimit(40,0); //THIS WORKS TO LIMIT EXTENDER CURRENT
//		Extender2.configPeakCurrentDuration(0, 0);
//		Extender2.enableCurrentLimit(true);

		//ArmBrake = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
		RollerT1 = new TalonSRX(PortMap.TOP_ROLLER_LEAD);
		RollerT1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute, 0, 0);
		RollerT1.setInverted(false);
		RollerT1.configNominalOutputForward(0, 0);
		RollerT1.configNominalOutputReverse(0, 0);
		RollerT1.configPeakOutputForward(1, 0);
		RollerT1.configPeakOutputReverse(-1, 0);
		//RollerT2 = new VictorSPX(PortMap.TOP_ROLLER_FOLLOWER);
		//RollerT2.follow(RollerT1);
//		RollerT2.setInverted(true);
		Puncher1 = new Solenoid(PortMap.PUNCHER1_FORWARD_CHANNEL);
		Puncher2 = new Solenoid(PortMap.PUNCHER2_FORWARD_CHANNEL);
		RollerB1 = new TalonSRX(PortMap.BOTTOM_ROLLER_LEAD);
//		RollerB1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		RollerB1.setInverted(false); //True for competition bot, false for practice bot
		RollerB1.configNominalOutputForward(0, 0);
		RollerB1.configNominalOutputReverse(0, 0);
		RollerB1.configPeakOutputForward(1, 0);
		RollerB1.configPeakOutputReverse(-1, 0);
		//RollerB2 = new VictorSPX(PortMap.BOTTOM_ROLLER_FOLLOWER);
		//RollerB2.follow(RollerB1);
		//RollerB2.setInverted(true);
		
		//Jaw = new DoubleSolenoid(PortMap.ARM_BRAKE_FORWARD_CHANNEL, PortMap.ARM_BRAKE_REVERSE_CHANNEL);
		
//		HallEffect = new DigitalInput(PortMap.EXTENSION_MIN);
		//ClimbMin = new DigitalInput(PortMap.CLIMBER_MIN);
		//ClimbMax = new DigitalInput(PortMap.CLIMBER_MAX);

		
	}

}
