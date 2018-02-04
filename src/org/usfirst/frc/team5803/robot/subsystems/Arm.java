package org.usfirst.frc.team5803.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5803.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Arm extends Subsystem {
	public static WPI_TalonSRX Arm1 = RobotMap.Arm1;
	public static WPI_VictorSPX Arm2 = RobotMap.Arm2;
	public static DoubleSolenoid Extender = RobotMap.Extender;
	public static DoubleSolenoid ArmBrake = RobotMap.ArmBrake;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void extend() {
		Extender.set(Value.kForward);
	}
	
	public void retract() {
		Extender.set(Value.kReverse);
	}
	
	public void secure() {
		ArmBrake.set(Value.kForward);
	}
	
	public void unsecure() {
		ArmBrake.set(Value.kReverse);
	}
	
	public void endSecurer() {
		ArmBrake.set(Value.kOff);
	}
	
	public void endExtender() {
		Extender.set(Value.kOff);
	}
	
	public void end() {
		ArmBrake.set(Value.kOff);
		Extender.set(Value.kOff);
	}
	
	//TODO: implement arm code once it's finished by other team
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}