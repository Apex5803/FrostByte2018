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
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeManual;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeManual;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeStandard;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;
import org.usfirst.frc.team5803.robot.utils.POVTrigger;
import org.usfirst.frc.team5803.robot.utils.TriggerButton;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;
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
//        Button A2=new JoystickButton(xbox2,1);
//        A.whileHeld(new RotateArmManual());
//        0 A2.whenPressed(new RotateArmAngle(20));
//        A.whenInactive(new HoldArmPosition());
        //A.whenPressed(new RotateArmManual());
        Button RPT2=new JoystickButton(xbox2, 2 );  //Change this to appropriate paddle value after testing
        	RPT2.whileHeld(new RotateArmManual());
        Button LPT2=new JoystickButton(xbox2, 1 );  //Change this to appropriate paddle value after testing
        	LPT2.whileHeld(new ExtendArm());
        	
        Button LPB2=new JoystickButton(xbox2, 3 );  //Change this to appropriate paddle value after testing
        	LPB2.whenActive(new LockArm());
        	LPB2.whenInactive(new ReleaseArm());
        //climb angle
        Button B2=new JoystickButton(xbox2,2);
        B2.whenPressed(new RotateArmAngle(60));
//        B.whenInactive(new HoldArmPosition());
        
  
        Button LB1=new JoystickButton(xbox1,5);
    		LB1.whileHeld(new EatCubeStandard());
        Button LB2=new JoystickButton(xbox2,5);
        	LB2.whileHeld(new EatCubeStandard());
        	  
//        TriggerButton LT2=new TriggerButton(xbox2, 2);
//        	LT2.whileActive(new RotateArmManual());
        Button RB1=new JoystickButton(xbox2,6);
         	RB1.whileHeld(new SpitCubeStandard());
        Button RB2=new JoystickButton(xbox2,6);
        	 RB2.whileHeld(new SpitCubeStandard());
        	 
        Button Y1=new JoystickButton(xbox1,4);
        	Y1.whileActive(new PunchCube());
        	Y1.whenInactive(new RetractPuncher());
        Button Y2=new JoystickButton(xbox2,4);
         	Y2.whileActive(new PunchCube());
         	Y2.whenInactive(new RetractPuncher());
        
//         Button Y=new JoystickButton(xbox2,4);
      
        	 
       TriggerButton RT1=new TriggerButton(xbox1, 3);
       		RT1.whileActive(new SpitCubeManual());	
       TriggerButton RT2=new TriggerButton(xbox2, 3);
       		RT2.whileActive(new SpitCubeManual());
       
       TriggerButton LT1=new TriggerButton(xbox1, 3);
       	 	LT1.whileActive(new EatCubeManual());
       TriggerButton LT2=new TriggerButton(xbox2, 3);
       	 	LT2.whileActive(new EatCubeManual());
//            RT.whenInactive(new HoldArmPosition());
        	
        	
         POVTrigger DPAD_UP2=new POVTrigger(xbox2, 0, 0);
        	DPAD_UP2.whenActive(new RotateArmAngle(75));
        
        POVTrigger DPAD_UP_RIGHT2=new POVTrigger(xbox2, 0, 45);
        	DPAD_UP_RIGHT2.whenActive(new RotateArmAngle(90));
        	
        POVTrigger DPAD_UP_LEFT2=new POVTrigger(xbox2, 0, 315);
        	DPAD_UP_LEFT2.whenActive(new RotateArmAngle(25));
        	
        POVTrigger DPAD_L2=new POVTrigger(xbox2, 0, 270);
        	DPAD_L2.whenActive(new RotateArmAngle(5.5));
        	
        
        	
       
//        POVTrigger DOWN2=new POVTrigger(xbox2, 0, 180);
//        	DOWN2.whileActive(new ReleaseArm());
        
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
