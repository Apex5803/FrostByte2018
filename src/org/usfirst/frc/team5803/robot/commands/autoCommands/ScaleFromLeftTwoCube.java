package org.usfirst.frc.team5803.robot.commands.autoCommands;


import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScaleFromLeftTwoCube extends CommandGroup {
public ScaleFromLeftTwoCube(GameState gameState) {
	if (gameState.scaleSide.toString() == "LEFT") {
		addSequential(new ScaleLeftStartLeftTwoCube()); 
	}
	else if (gameState.scaleSide.toString()== "RIGHT") {
		addSequential(new ScaleRightStartLeft());
	}
	else System.out.println("did not recieve scale side");
}
	
}
