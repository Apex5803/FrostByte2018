package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class FiftyFiftyLeft extends CommandGroup{
public FiftyFiftyLeft(GameState gameState) {
	if (gameState.scaleSide.toString() == "LEFT") {
		addSequential(new ScaleLeftStartLeft()); 
	}
	else if (gameState.scaleSide.toString()== "RIGHT") {
		addSequential(new DriveBackward());
	}
	else System.out.println("did not recieve scale side");
}
}
