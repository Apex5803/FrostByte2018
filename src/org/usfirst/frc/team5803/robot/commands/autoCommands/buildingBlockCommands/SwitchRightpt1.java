package org.usfirst.frc.team5803.robot.commands.autoCommands.buildingBlockCommands;

import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class SwitchRightpt1 extends CommandGroup {
	public SwitchRightpt1() {
	addParallel(new FollowArc(new CenterToRightSwitchArc()));
	System.out.println("Driving SwitchRight");
	addSequential(new WaitCommand(2.5));
	addSequential(new ReleaseArm(), 0.1);
	addSequential(new RotateArmAngle(40), .5);
	}
}
