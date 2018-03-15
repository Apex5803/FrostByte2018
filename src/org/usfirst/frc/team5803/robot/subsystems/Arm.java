package org.usfirst.frc.team5803.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5803.robot.Robot;
import org.usfirst.frc.team5803.robot.RobotMap;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Arm extends Subsystem {
	public TalonSRX Arm1 = Robot.Arm1;
	public VictorSPX Arm2 = Robot.Arm2;
	public TalonSRX Extender1 = RobotMap.Extender1;
	public TalonSRX Extender2 = RobotMap.Extender2;
//	public VictorSPX Extender2 = RobotMap.Extender2;
	public static DoubleSolenoid ArmBrake = RobotMap.ArmBrake;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public boolean IsSecured;
	public void extend(ControlMode controlmode, double position) {
		Extender1.set(controlmode, position);
		//Extender2.set(ControlMode.PercentOutput, speed);
	}
	
	public void retract() {
		Extender1.set(ControlMode.PercentOutput, -0.2);
		//Extender2.set(ControlMode.PercentOutput, -0.2);
	}
	
	public void secure() {
		ArmBrake.set(Value.kReverse);
		IsSecured = true;
	}
	
	public void unsecure() {
		ArmBrake.set(Value.kForward);
		IsSecured = false;
	}
	
	public void endSecurer() {
		ArmBrake.free();
	}
	
	public void endExtender() {
		Extender1.set(ControlMode.PercentOutput, 0.0);
		//Extender2.set(ControlMode.PercentOutput, 0.0);
	}
	
	public void end() {
//		ArmBrake.set(Value.kOff);
		Extender1.set(ControlMode.PercentOutput, 0.0);
		//Extender2.set(ControlMode.PercentOutput, 0.0);
	}
	
		 public void configPIDF(double p, double i, double d, double f) {

		    	this.Arm1.config_kP( 0, p, 0);
		    	this.Arm1.config_kI(0, i, 0);
		    	this.Arm1.config_kD(0, d, 0);
		    	this.Arm1.config_kF(0, f, 0);
		 }   	
		 public void configPIDFextender(double p, double i, double d, double f) {
		    	this.Extender1.config_kP(0, p, 0); 
		    	this.Extender1.config_kI(0, i, 0); 
		    	this.Extender1.config_kD(0, d, 0); 
		    	this.Extender1.config_kF(0, f, 0); 
		    	}
		 public double vgiver(){
			 return this.Arm1.getSelectedSensorPosition(0);
		 }
		 public void move(double stickv){
			 this.Arm1.set(ControlMode.PercentOutput, stickv);
		 }
		 public void moveTo(ControlMode controlMode, double angle){
			 //angle*4096 tics per rev./total degrees per revolution 
			 double setPoint= angle*4096/360 + 68;
			 this.Arm1.set(ControlMode.MotionMagic, setPoint);
			 System.out.println(angle + ": target angle");
			 System.out.println( Arm1.getSelectedSensorPosition(0)*360/4096 + ": actual angle");
			 SmartDashboard.putNumber("Arm 1 error", angle -  Arm1.getSelectedSensorPosition(0)*360/4096); 
		 }
		 public void End() {
				this.move(0);
			}
		 	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	
}