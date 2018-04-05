package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt5Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

public class SwitchLeft extends CommandGroup {
	public SwitchLeft() {

		addParallel(new IntakeCreep(), 3);
		addParallel(new FollowArc(new CenterToLeftSwitchArc()));
		// //addSequential(new IntakeCreep(), 1);
		System.out.println("Driving SwitchLeft");
		addSequential(new WaitCommand(2.5));
		addSequential(new ReleaseArm(), 0.1);
		addSequential(new RotateArmAngle(40), .5);
		addSequential(new SpitCubeAuto(), .5);
		addSequential(new LockArm(), 0.1);
		addParallel(new FollowArc(new CenterToLeftSwitchPt2Arc()));
		addSequential(new WaitCommand(1));
		addParallel(new RotateArmAngle(5), .5);
		addParallel(new EatCubeStandard(), 3.5);
		addSequential(new WaitCommand(2));
		addSequential(new FollowArc(new CenterToLeftSwitchPt3Arc()));
		addParallel(new IntakeCreep(), 3);
		addSequential(new FollowArc(new CenterToLeftSwitchPt4Arc()));
		addParallel(new RotateArmAngle(40), .5);
		addSequential(new FollowArc(new CenterToLeftSwitchPt5Arc()));
		addSequential(new SpitCubeAuto(), .5);
		addSequential(new LockArm(), 0.1);
		// addSequential(new IntakeCreep());
	}
}
