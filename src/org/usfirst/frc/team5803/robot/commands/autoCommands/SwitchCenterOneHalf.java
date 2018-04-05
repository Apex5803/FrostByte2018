package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.models.GameState;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SwitchCenterOneHalf extends CommandGroup {
	public SwitchCenterOneHalf(GameState gameState) {
		if (gameState.mySwitchSide.toString() == "LEFT") {
			addSequential(new SwitchCenterLeftOneHalf());
		} else if (gameState.mySwitchSide.toString() == "RIGHT") {
			addSequential(new SwitchCenterRightOneHalf());
		} else
			System.out.println("did not recieve switch side");
	}
}
