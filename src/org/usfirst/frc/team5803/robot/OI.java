/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5803.robot;

import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
        A.whenPressed(new RotateArmAngle(6));
        //climb angle
        Button B=new JoystickButton(xbox2,2);
        B.whenPressed(new RotateArmAngle(90));

        // SmartDashboard Buttons
        SmartDashboard.putData("Drive", new Drive());
        
   
    }

    
  

    public XboxController xbox1() {
    	return xbox1;
    }
    
    public XboxController xbox2() {
    	return xbox2;
    }

	
    
	
}
