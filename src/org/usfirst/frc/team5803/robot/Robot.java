// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc.team5803.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5803.robot.arcs.CrossTheLineArc;
import org.usfirst.frc.team5803.robot.commands.*;
import org.usfirst.frc.team5803.robot.commands.autoCommands.DriveBackward;
import org.usfirst.frc.team5803.robot.commands.autoCommands.DriveForward;
import org.usfirst.frc.team5803.robot.commands.autoCommands.DriveForwardFiveFeet;
import org.usfirst.frc.team5803.robot.commands.autoCommands.FiftyFiftyLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.FiftyFiftyRight;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleFromCenter;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleFromLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleFromRight;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleLeftStartLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleLeftStartRight;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleRight;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleRightStartLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.ScaleRightStartRight;
import org.usfirst.frc.team5803.robot.commands.autoCommands.SwitchCenterLeftOneHalf;
import org.usfirst.frc.team5803.robot.commands.autoCommands.SwitchCenterOneHalf;
import org.usfirst.frc.team5803.robot.commands.autoCommands.SwitchFromCenter;
import org.usfirst.frc.team5803.robot.commands.autoCommands.SwitchLeft;
import org.usfirst.frc.team5803.robot.commands.autoCommands.SwitchRight;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;
import org.usfirst.frc.team5803.robot.models.GameState;
import org.usfirst.frc.team5803.robot.models.SRXGains;
//import org.usfirst.frc5803.RobotTestBench.commands.autonomous.DriveForwardFiveFeet;
import org.usfirst.frc.team5803.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.sensors.PigeonIMU;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {

	Command autonomousCommand;
	// SendableChooser<Command> chooser = new SendableChooser<>();
	public static TalonSRX Arm1;
	public static VictorSPX Arm2;
	public static OI oi;
	public static DriveBase driveTrain;
	public static Arm arm;
	public static CubeEater kCubeEater;

	public GameState gameState;
	SendableChooser<String> autoChooser;

	Compressor compressor = new Compressor(0);

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {

		RobotMap.init();

		CameraServer.getInstance().startAutomaticCapture();
//		camera->SetResolution(320., 240.);

		Arm1 = new TalonSRX(PortMap.ARM_LEAD);
		int absolutePosition = Arm1.getSensorCollection().getPulseWidthPosition();
		absolutePosition &= 0xFFF;
		Arm1.setSelectedSensorPosition(absolutePosition - 3205, 0, 0);
		System.out.println("Set arm encoder 0");

		Arm1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		Arm1.setInverted(false);
		Arm1.setSensorPhase(true);
		Arm1.configForwardSoftLimitEnable(false, 0);
		// Arm1.configForwardSoftLimitEnable(true, 0);
		// Arm1.configForwardSoftLimitThreshold(1350,0); //max = ~1100
		Arm1.configReverseSoftLimitEnable(false, 0);
		// Arm1.configReverseSoftLimitEnable(true, 0);
		// Arm1.configReverseSoftLimitThreshold(-20,0);
		Arm1.configMotionCruiseVelocity(1000, 0);
		Arm1.configMotionAcceleration(500, 0);
		Arm1.configNominalOutputForward(0, 0);
		Arm1.configNominalOutputReverse(0, 0);
		Arm1.configPeakOutputForward(1, 0);
		Arm1.configPeakOutputReverse(-0.60, 0);
		Arm1.configAllowableClosedloopError(10, 0, 0);
		// ARM2 RUNS THE SAME DIRECTION AS ARM1
		Arm2 = new VictorSPX(PortMap.ARM_FOLLOWER);
		Arm2.follow(Arm1);
		Arm2.setInverted(false);

		// REMOVE THIS WHEN WE HAVE TIME TO TEST

		Arm2.configMotionCruiseVelocity(1000, 0);
		Arm2.configMotionAcceleration(500, 0);
		Arm2.configNominalOutputForward(0, 0);
		Arm2.configNominalOutputReverse(0, 0);
		Arm2.configPeakOutputForward(1, 0);
		Arm2.configPeakOutputReverse(-0.60, 0);
		Arm2.configAllowableClosedloopError(10, 0, 0);

		Arm2.configReverseSoftLimitEnable(false, 0);
		Arm2.configForwardSoftLimitEnable(false, 0);

		driveTrain = new DriveBase();
		arm = new Arm();
		kCubeEater = new CubeEater();
		compressor.setClosedLoopControl(true);
		arm.configPIDF(2.2, 0, 0, 1.6);
		// p = 1.8
		arm.configPIDFextender(0.2, 0, 0, 0);

		SRXGains highGearGains = new SRXGains(DriveBase.HIGH_GEAR_PROFILE, 1.4, 0.0, 8.0, 0.25, 0);
		SRXGains rotationGains = new SRXGains(DriveBase.ROTATION_PROFILE, 1.6, 0.00, 50, 0.0, 0);
		// SRXGains rotationGains = new SRXGains(DriveBase.ROTATION_PROFILE, 2.5, 0.00,
		// 25.0, 0.0, 0);
		// d=180
		driveTrain.R1.setSelectedSensorPosition(0, 0, 0);
		// driveTrain.configPIDF(0.2, 0, 50, 0.5);
		driveTrain.configGains(highGearGains);
		driveTrain.configGains(rotationGains);
		driveTrain.L1.setSelectedSensorPosition(0, 0, 0);
		// OI must be constructed after subsystems. If the OI creates Commands
		// (which it very likely will), subsystems are not guaranteed to be
		// constructed yet. Thus, their requires() statements may grab null
		// pointers. Bad news. Don't move it.
		oi = new OI();
		Robot.driveTrain.pigeon.setYaw(0, 0);

		RobotMap.Extender1.setSelectedSensorPosition(0, 0, 0);

		// Add commands to Autonomous Sendable Chooser

		// chooser.addDefault("Autonomous Command", new AutonomousCommand());
		// chooser.addObject("other auto", new AutonomousCommand());

		// SmartDashboard.putData("Auto mode", autoChooser);

		autoChooser = new SendableChooser<String>();
		autoChooser.addDefault("No Auto", "No Auto");
		autoChooser.addObject("DriveBackward", "DriveBackward");
		autoChooser.addObject("SwitchFromCenterTwoCube", "SwitchFromCenterTwoCube");
		autoChooser.addObject("SwitchCenterOneAndHalf", "SwitchCenterOneAndHalf");
        //autoChooser.addObject("ScaleFromCenter", "ScaleFromCenter");
		autoChooser.addObject("ScaleFromLeft", "ScaleFromLeft");
		autoChooser.addObject("ScaleFromRight", "ScaleFromRight");
		autoChooser.addObject("50/50FromLeft", "50/50FromLeft");
		autoChooser.addObject("50/50FromRight", "50/50FromRight");
		// SmartDashboard.putData("Auto Mode Chooser", autoChooser);
		SmartDashboard.putData("New Auto Mode Chooser", autoChooser);
//		SmartDashboard.putData("CrossTheLine", new FollowArc(new CrossTheLineArc()));
	}

	/**
	 * This function is called when the disabled button is hit. You can use it to
	 * reset subsystems before shutting down.
	 */
	@Override
	public void disabledInit() {
//		arm.secure();
	}

	@Override
	public void disabledPeriodic() {
		this.gameState = new GameState(DriverStation.getInstance().getGameSpecificMessage());
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Arm 1 encoderPosition", Arm1.getSelectedSensorPosition(0));
		// 3SmartDashboard.putNumber("Arm1 encoder speed",
		// RobotMap.Arm1.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("L1 encoderPosition", RobotMap.L1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("R1 encoderPosition", RobotMap.R1.getSelectedSensorPosition(0));
		// SmartDashboard.putNumber("Extender2 encoderPosition",
		// RobotMap.Extender2.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Extender1 encoderPosition", RobotMap.Extender1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("RollerT1 encoder Postion", RobotMap.RollerT1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("yaw", Robot.driveTrain.getAngle());
		// SmartDashboard.putNumber("RobotAngle", 50. * OI.xbox2.getY(Hand.kLeft));;

	}

	@Override
	public void autonomousInit() {
		System.out.println("MySwitch: " + this.gameState.mySwitchSide.toString() + ", Scale: "
				+ this.gameState.scaleSide.toString() + ", Their Switch: " + this.gameState.theirSwitchSide.toString());
		System.out.println("Initialized drive motors to brake");
		RobotMap.R1.setNeutralMode(NeutralMode.Brake);
		RobotMap.L1.setNeutralMode(NeutralMode.Brake);
		RobotMap.R2.setNeutralMode(NeutralMode.Brake);
		RobotMap.R3.setNeutralMode(NeutralMode.Brake);
		RobotMap.L2.setNeutralMode(NeutralMode.Brake);
		RobotMap.L3.setNeutralMode(NeutralMode.Brake);
		Robot.driveTrain.pigeon.setYaw(0, 0);
		driveTrain.R1.setSelectedSensorPosition(0, 0, 0);
		driveTrain.L1.setSelectedSensorPosition(0, 0, 0);

		String selectedAuto = (String) autoChooser.getSelected();
		switch (selectedAuto) {
		case "SwitchFromCenterTwoCube":
			autonomousCommand = new SwitchFromCenter(gameState);
			break;
		case "SwitchCenterOneAndHalf":
			autonomousCommand = new SwitchCenterOneHalf(gameState);
			break;
		case "ScaleFromLeft":
			autonomousCommand = new ScaleFromLeft(gameState);
			break;
		case "ScaleFromRight":
			autonomousCommand = new ScaleFromRight(gameState);
			break;
		case "DriveBackward":
			autonomousCommand = new DriveBackward();
			break;
		case "50/50FromRight":
			autonomousCommand = new FiftyFiftyRight(gameState);
			break;
		case "50/50FromLeft":
			autonomousCommand = new FiftyFiftyLeft(gameState);
			break;
		default:
			System.out.println("Default, no auto");
			break;
		}
		autoChooser.addDefault("No Auto", "No Auto");
		autoChooser.addObject("DriveBackward", "DriveBackward");
		autoChooser.addObject("SwitchFromCenterTwoCube", "SwitchFromCenterTwoCube");
		autoChooser.addObject("SwitchCenterOneAndHalf", "SwitchCenterOneAndHalf");
        //autoChooser.addObject("ScaleFromCenter", "ScaleFromCenter");
		autoChooser.addObject("ScaleFromLeft", "ScaleFromLeft");
		autoChooser.addObject("ScaleFromRight", "ScaleFromRight");
		autoChooser.addObject("50/50FromLeft", "50/50FromLeft");
		autoChooser.addObject("50/50FromRight", "50/50FromRight");
		/*
		 * autonomousCommand = chooser.getSelected(); // schedule the autonomous command
		 * (example) if (autonomousCommand != null) autonomousCommand.start();
		 */
		// autonomousCommand = new DriveForwardFiveFeet();
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();

		arm.secure();
		arm.IsSecured = true;
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		compressor.setClosedLoopControl(false);
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("L1 encoderPosition", RobotMap.L1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("L1 encoderVelocity", RobotMap.L1.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("R1 encoderPosition", RobotMap.R1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("R1 encoderVelocity", RobotMap.R1.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("yaw", Robot.driveTrain.getAngle());
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		arm.secure();
		arm.IsSecured = true;
		System.out.println("Initialized drive train in coast mode");
		RobotMap.L1.setNeutralMode(NeutralMode.Coast);
		RobotMap.L2.setNeutralMode(NeutralMode.Coast);
		RobotMap.L3.setNeutralMode(NeutralMode.Coast);
		RobotMap.R1.setNeutralMode(NeutralMode.Coast);
		RobotMap.R2.setNeutralMode(NeutralMode.Coast);
		RobotMap.R3.setNeutralMode(NeutralMode.Coast);
		Robot.driveTrain.pigeon.setYaw(0, 0);

	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		compressor.setClosedLoopControl(true);
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Arm 1 encoderPosition", Arm1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Extender1 encoderPosition", RobotMap.Extender1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("RollerT1 encoder position", RobotMap.RollerT1.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Arm1 encoder speed", Arm1.getSelectedSensorVelocity(0));
		SmartDashboard.putNumber("yaw", Robot.driveTrain.getAngle());
		SmartDashboard.putNumber("Intake Power", OI.xbox2.getTriggerAxis(Hand.kLeft));

		// SmartDashboard.putNumber("Arm 1 error", RobotMap.Arm1.get)
		// SmartDashboard.putNumber("RobotAngle", 50. * OI.xbox2.getY(Hand.kLeft));;

	}
}
