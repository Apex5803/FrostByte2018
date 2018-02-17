/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5803.robot;

import org.usfirst.frc.team5803.robot.commands.armCommands.ExtendArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.HoldArmPosition;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmManual;
import org.usfirst.frc.team5803.robot.commands.armCommands.StopArm;
import org.usfirst.frc.team5803.robot.commands.autoCommands.AutonomousCommand;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCube;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;
import org.usfirst.frc.team5803.robot.utils.POVTrigger;
import org.usfirst.frc.team5803.robot.utils.TriggerButton;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static XboxController xbox1;
	public static XboxController xbox2;
	
	public OI() {  
        xbox1 = new XboxController(0);
        xbox2 = new XboxController(1);
        
        //pickup angle
        Button A=new JoystickButton(xbox2,1);
//        A.whileHeld(new RotateArmManual());
        A.whenPressed(new RotateArmAngle(20));
        A.whenInactive(new HoldArmPosition());
        //A.whenPressed(new RotateArmManual());
        
        //climb angle
        Button B=new JoystickButton(xbox2,2);
        B.whenPressed(new RotateArmAngle(60));
        B.whenInactive(new HoldArmPosition());
        
  
        
        Button LB=new JoystickButton(xbox2,5);
        	LB.whileHeld(new EatCube());
        	
        Button RB=new JoystickButton(xbox2,6);
        	 RB.whileHeld(new SpitCube());
        	 
        Button X=new JoystickButton(xbox2,3);
        	X.whenPressed(new PunchCube());
        	
        
   //      Button Y=new JoystickButton(xbox2,4);
        
        TriggerButton LT=new TriggerButton(xbox2, 2);
        	LT.whenActive(new RotateArmManual());
        	LT.whenInactive(new HoldArmPosition());
        	 
        TriggerButton RT=new TriggerButton(xbox2, 3);
            RT.whenActive(new ExtendArm());
//            RT.whenInactive(new HoldArmPosition());
        	
        	
         POVTrigger UP=new POVTrigger(xbox2, 0, 0);
        	UP.whenActive(new LockArm());
       
        POVTrigger DOWN=new POVTrigger(xbox2, 0, 180);
        	DOWN.whenActive(new ReleaseArm());
        
        //this.operatorController.rightTriggerButton.whenPressed(new CubeCollectorGoToPosition());
        //this.operatorController.leftTriggerButton.whenPressed(new CubeCollectorGoToZero());        
        // SmartDashboard Buttons
        //SmartDashboard.putData("Drive", new Drive());           
    }

    
  

    public XboxController xbox1() {
    	return xbox1;
    }
    
    public XboxController xbox2() {
    	return xbox2;
    }

	
    
	
}
