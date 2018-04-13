package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt5Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt5Arc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightpt2Arc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightpt3Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeStandard;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

public class ScaleRightStartRightTwoCube extends CommandGroup {
	public ScaleRightStartRightTwoCube() {
		addParallel(new IntakeCreep(), 3);
		addParallel(new FollowArc(new ScaleRightStartRightArc()));
		// //addSequential(new IntakeCreep(), 1);
		System.out.println("Driving ScaleRightTwoCube");
		addSequential(new WaitCommand(3.0));
		addSequential(new ReleaseArm(), 0.1);
		addSequential(new RotateArmAngle(80), .5);
		addSequential(new PunchCube(), 2);
		addSequential (new RotateArmAngle(5), 0.3);
		addSequential(new LockArm(), 0.1);
		addParallel(new FollowArc(new ScaleRightStartRightpt2Arc()));
		addSequential(new WaitCommand(1));
		addParallel(new EatCubeStandard(), 3.5);
		addSequential(new WaitCommand(2));
		addSequential(new FollowArc(new ScaleRightStartRightpt3Arc()));
		addParallel(new IntakeCreep(), 3);
		addParallel(new RotateArmAngle(80), .5);
		addSequential(new PunchCube(), .5);
		addSequential(new LockArm(), 0.1);
	}
}
