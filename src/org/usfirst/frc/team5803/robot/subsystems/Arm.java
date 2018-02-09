package org.usfirst.frc.team5803.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5803.robot.Robot;
import org.usfirst.frc.team5803.robot.RobotMap;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Arm extends Subsystem {
	public static WPI_TalonSRX Arm1 = RobotMap.Arm1;
	public static WPI_VictorSPX Arm2 = RobotMap.Arm2;
	public static WPI_TalonSRX Extender = RobotMap.Extender1;
	public static DoubleSolenoid ArmBrake = RobotMap.ArmBrake;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void extend() {
		Extender.set(0.6);
	}
	
	public void retract() {
		Extender.set(-0.6);
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
		Extender.set(0.0);
	}
	
	public void end() {
		ArmBrake.set(Value.kOff);
		Extender.set(0.0);
	}

		public TalonSRX armmotor = RobotMap.Arm1;
		
		
		// Put methods for controlling this subsystem
		// here. Call these from Commands.

	
		 public void configPIDF(double p, double i, double d, double f) {

		    	this.armmotor.config_kP(0, p, 0);
		    	this.armmotor.config_kI(0, i, 0);
		    	this.armmotor.config_kD(0, d, 0);
		    	this.armmotor.config_kF(0, f, 0);

		    }
		 public double vgiver(){
			 return this.armmotor.getSelectedSensorPosition(0);
		 }
		 public void move(double stickv){
			 this.armmotor.set(ControlMode.PercentOutput, stickv);
		 }
		 public void moveTo(double angle){
			 //angle*4096 tics per rev./total degrees per revolution 
			 double setPoint= angle*4096/360;
			 this.armmotor.set(ControlMode.MotionMagic, setPoint);
			 //System.out.println(angle + ": target angle");
			 System.out.println( this.armmotor.getSelectedSensorPosition(0)*306/4096 + ": actual angle");
		 }
		 public void End() {
				Robot.kArm.move(0);
			}
		 
	
	
	//TODO: implement arm code once it's finished by other team
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}