package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScaleFromRightTwoCube extends CommandGroup {
public ScaleFromRightTwoCube(GameState gameState) {
	if (gameState.scaleSide.toString() == "LEFT") {
		addSequential(new ScaleLeftStartRight()); 
	}
	else if (gameState.scaleSide.toString()== "RIGHT") {
		addSequential(new ScaleRightStartRightTwoCube());
	}
	else System.out.println("did not recieve scale side");
}
	
}
