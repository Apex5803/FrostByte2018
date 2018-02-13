package org.usfirst.frc.team5803.robot.subsystems;

import org.usfirst.frc.team5803.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class CubeEater extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public TalonSRX RollerT1 = RobotMap.RollerT1;
	public TalonSRX RollerB1 = RobotMap.RollerB1;
	//public DoubleSolenoid Puncher = RobotMap.Puncher;
	//public DoubleSolenoid Jaw = RobotMap.Jaw;

	public void jawExtend() {
		//Jaw.set(Value.kForward);
	}
	
	public void jawRetract() {
		//Jaw.set(Value.kReverse);
	}
	
	public void punchCube() {
		//Puncher.set(Value.kForward);
	}
	
	public void retractPuncher() {
		//Puncher.set(Value.kReverse);
	}
	
	public void eatCube() {
		RollerT1.set(ControlMode.PercentOutput, 0.7);
		RollerB1.set(ControlMode.PercentOutput, 0.7);
	}
	
	public void spitCube() {
		RollerT1.set(ControlMode.PercentOutput, -0.7);
		RollerB1.set(ControlMode.PercentOutput, -0.7);
	}
	
	public void endRoller() {
		RollerT1.set(ControlMode.PercentOutput, 0.0);
		RollerB1.set(ControlMode.PercentOutput, 0.0);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}