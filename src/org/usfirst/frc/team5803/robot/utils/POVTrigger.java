package org.usfirst.frc.team5803.robot.utils;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class POVTrigger extends Trigger{
	private int PovID;
	private int axisNumber;
	private int PovAngle;
	private XboxController xbox;
	
	
	public POVTrigger (XboxController xbox, int PovID, int axisNumber){
		 this.xbox = xbox;
		 this.PovID = PovID;
		 this.axisNumber = axisNumber;
	}
	@Override
	public boolean get() {
		// TODO Auto-generated method stub
		return xbox.getPOV(PovID) == axisNumber;
	}

}
