package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class FiftyFiftyRight extends CommandGroup {
public FiftyFiftyRight(GameState gameState) {
	if (gameState.scaleSide.toString() == "RIGHT") {
		addSequential(new ScaleRightStartRightTwoCube()); 
	}
	else if (gameState.scaleSide.toString()== "LEFT") {
//		addSequential(new StartRightFiftyFifty());
		addSequential(new DriveBackward());
	}
	else System.out.println("did not recieve scale side");
}
}
