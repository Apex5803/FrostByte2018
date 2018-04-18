package org.usfirst.frc.team5803.robot.subsystems;

import org.usfirst.frc.team5803.robot.RobotMap;
import org.usfirst.frc.team5803.robot.commands.extensionCommands.HoldExtenderPosition;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Extension extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public DigitalInput ClimbMin = RobotMap.ClimbMin;
//	public DigitalInput ClimbMax = RobotMap.ClimbMax;

	public TalonSRX Extender1 = RobotMap.Extender1;
	public TalonSRX Extender2 = RobotMap.Extender2;
//	 public VictorSPX Extender2 = RobotMap.Extender2;

	public void configPIDFextender(double p, double i, double d, double f) {
		this.Extender1.config_kP(0, p, 0);
		this.Extender1.config_kI(0, i, 0);
		this.Extender1.config_kD(0, d, 0);
		this.Extender1.config_kF(0, f, 0);
	}

	public void extend(ControlMode controlmode, double position) {
		Extender1.set(controlmode, position);
		// Extender2.set(ControlMode.PercentOutput, speed);
	}

	public void retract() {
		Extender1.set(ControlMode.PercentOutput, -0.2);
		// Extender2.set(ControlMode.PercentOutput, -0.2);
	}

	public void endExtender() {
		Extender1.set(ControlMode.PercentOutput, 0.0);
		// Extender2.set(ControlMode.PercentOutput, 0.0);
	}

	public void end() {
		Extender1.set(ControlMode.PercentOutput, 0.0);
		// Extender2.set(ControlMode.PercentOutput, 0.0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new HoldExtenderPosition());
	}
}