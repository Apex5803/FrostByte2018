package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchFromCenter extends CommandGroup {
public SwitchFromCenter(GameState gameState) {
	if (gameState.mySwitchSide.toString() == "LEFT") {
		addSequential(new SwitchLeft()); 
	}
	else if (gameState.mySwitchSide.toString()== "RIGHT") {
		addSequential(new SwitchRight());
	}
	else System.out.println("did not recieve switch side");
}
	
}
