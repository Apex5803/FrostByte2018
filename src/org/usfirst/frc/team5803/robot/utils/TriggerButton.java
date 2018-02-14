/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc.team5803.robot.utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 * @author mwtidd
 */
public class TriggerButton extends Trigger{
    private final XboxController xbox;
    private final int axis;

    public TriggerButton(XboxController xbox, int axis){
        this.xbox = xbox;
        this.axis = axis;
    }

    public boolean get() {
        return xbox.getRawAxis(axis) >= .5;
    }
}

/*
package org.usfirst.frc.team5803.robot.utils;

//import org.usfirst.frc.team5803.robot.utils;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;

public class TriggerButton extends Button{
		private final Joystick joy;
		private final int axis;
		private double targetVal;
		private ThresholdType thresholdType;

	public TriggerButton(Joystick joystick, int axis, double threshold, ThresholdType thresholdType) {
		this.joy = joystick;
		this.axis = axis;
		this.targetVal = threshold;
		this.thresholdType = thresholdType;
	}

	public boolean get() {
		switch (this.thresholdType) {
		case EXACT:
			System.out.println("axis value: " + joy.getRawAxis(this.axis));
			return joy.getRawAxis(this.axis) == this.targetVal;
		case LESS_THAN:
			return joy.getRawAxis(this.axis) < this.targetVal;
		case GREATER_THAN:
			return joy.getRawAxis(this.axis) > this.targetVal;
		case POV:
			return joy.getPOV() == this.targetVal;
		default:
		return false;
		}
	}
	
	static enum ThresholdType
	{
			LESS_THAN, GREATER_THAN, EXACT, POV;	
	}

}
*/