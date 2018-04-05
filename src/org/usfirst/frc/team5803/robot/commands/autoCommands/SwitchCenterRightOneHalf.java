package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with
 * motion profiling. It will drive forward 5 feet.
 */
public class SwitchCenterRightOneHalf extends CommandGroup {
	public SwitchCenterRightOneHalf() {

		addParallel(new IntakeCreep(), 3);
		addParallel(new FollowArc(new CenterToRightSwitchArc()));
		// addSequential(new IntakeCreep(), 1);
		System.out.println("Driving SwitchRightOneHalf");
		addSequential(new WaitCommand(2.5));
		addSequential(new ReleaseArm(), 0.1);
		addSequential(new RotateArmAngle(40), .5);
		addSequential(new SpitCubeAuto(), 2);
		addSequential(new LockArm(), 0.1);
		addParallel(new FollowArc(new CenterToRightSwitchPt2Arc()));
		addSequential(new WaitCommand(1));
		addParallel(new RotateArmAngle(5), .5);
		addParallel(new EatCubeStandard(), 3.5);
		addSequential(new WaitCommand(2));
		addSequential(new FollowArc(new CenterToRightSwitchPt3Arc()));
		addParallel(new IntakeCreep(), 3);
		addSequential(new FollowArc(new CenterToRightSwitchPt4Arc()));
		// addParallel(new RotateArmAngle(40), .5);
	}
}