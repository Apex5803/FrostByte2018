package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ScaleFromCenter extends CommandGroup {
public ScaleFromCenter(GameState gameState) {
	if (gameState.scaleSide.toString() == "LEFT") {
		addSequential(new ScaleLeft()); 
	}
	else if (gameState.scaleSide.toString()== "RIGHT") {
		addSequential(new ScaleRight());
	}
	else System.out.println("did not recieve scale side");
}
	
}