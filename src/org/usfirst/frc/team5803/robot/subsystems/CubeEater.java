package org.usfirst.frc.team5803.robot.subsystems;

import org.usfirst.frc.team5803.robot.OI;
import org.usfirst.frc.team5803.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class CubeEater extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public TalonSRX RollerT1 = RobotMap.RollerT1;
	public TalonSRX RollerB1 = RobotMap.RollerB1;
	public Solenoid Puncher1 = RobotMap.Puncher1;
	public Solenoid Puncher2 = RobotMap.Puncher2;
	//public DoubleSolenoid Jaw = RobotMap.Jaw;

	public void jawExtend() {
		//Jaw.set(Value.kForward);
	}
	
	public void jawRetract() {
		//Jaw.set(Value.kReverse);
	}
	
	public void punchCube() {
		Puncher1.set(true);
		Puncher2.set(true);		
		RollerT1.set(ControlMode.PercentOutput, -1);
		RollerB1.set(ControlMode.PercentOutput, -1);
	}
	
	public void retractPuncher() {
		Puncher1.set(false);;
		Puncher2.set(false);
		endRoller();
	}
	
	public void eatCubeStandard() {
		RollerT1.set(ControlMode.PercentOutput, 1);
		RollerB1.set(ControlMode.PercentOutput, 1);
	}
	
	public void eatCubeManual() {
		
		if (OI.xbox1.getTriggerAxis(Hand.kLeft) >= 0.2) {
			RollerT1.set(ControlMode.PercentOutput, 1 * OI.xbox1.getTriggerAxis(Hand.kLeft));
			RollerB1.set(ControlMode.PercentOutput, 1 * OI.xbox1.getTriggerAxis(Hand.kLeft));
			}
		else if (OI.xbox2.getTriggerAxis(Hand.kLeft) >= 0.2){
			RollerT1.set(ControlMode.PercentOutput, 1 * OI.xbox2.getTriggerAxis(Hand.kLeft));
			RollerB1.set(ControlMode.PercentOutput, 1 * OI.xbox2.getTriggerAxis(Hand.kLeft));
			//System.out.println("Trigger Speed"+OI.xbox2.getTriggerAxis(Hand.kLeft));
			}
		else {
			endRoller();
		}
		
	}
	
	//Vegeta what does the scouter say about his power level?
	public void spitCubeStandard() {
		RollerT1.set(ControlMode.PercentOutput, -1);
		RollerB1.set(ControlMode.PercentOutput, -1);
	}
	
	public void spitCubeAuto() {
		RollerT1.set(ControlMode.PercentOutput, -.5);
		RollerB1.set(ControlMode.PercentOutput, -.5);		
	}
public void spitCubeManual() {
		
		if (OI.xbox1.getTriggerAxis(Hand.kRight) >= 0.2) {
			RollerT1.set(ControlMode.PercentOutput, -1 * OI.xbox1.getTriggerAxis(Hand.kRight));
			RollerB1.set(ControlMode.PercentOutput, -1 * OI.xbox1.getTriggerAxis(Hand.kRight));
			}
		else if (OI.xbox2.getTriggerAxis(Hand.kRight) >= 0.2){
			RollerT1.set(ControlMode.PercentOutput, -1 * OI.xbox2.getTriggerAxis(Hand.kRight));
			RollerB1.set(ControlMode.PercentOutput, -1 * OI.xbox2.getTriggerAxis(Hand.kRight));
			}
		else {
			endRoller();
		}
	}
	public void intakeCreep() {
	RollerT1.set(ControlMode.PercentOutput, 0.1);
	RollerB1.set(ControlMode.PercentOutput, 0.1);
	}
	
	public void endRoller() {
		RollerT1.set(ControlMode.PercentOutput, 0.0);
		RollerB1.set(ControlMode.PercentOutput, 0.0);
	}

	//	Vegeta what does the scouter say about his power level?
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}