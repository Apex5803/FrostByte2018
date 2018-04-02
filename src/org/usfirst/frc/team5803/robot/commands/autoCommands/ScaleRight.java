package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class ScaleRight extends CommandGroup {

    public ScaleRight() {

//        addParallel(new IntakeCreep(), 4);
//    	addParallel(new FollowArc(new CenterToRightSwitchArc()));
////    	//addSequential(new IntakeCreep(), 1);
//    	System.out.println("Driving SwitchRight");
//    	addSequential(new WaitCommand(1.5));
//    	addSequential(new ReleaseArm() , 0.1);
//    	addSequential(new RotateArmAngle(40), .5);        	
//    	addSequential(new SpitCubeAuto(), 2);
//    	addSequential(new LockArm() , 0.1);
//    	addSequential(new IntakeCreep());
    }
}
