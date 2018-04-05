package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
import org.usfirst.frc.team5803.robot.models.*;
import org.usfirst.frc.team5803.robot.arcs.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class StartRightFiftyFifty extends CommandGroup {
//	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
//	SrxTrajectory toFollow = null;
    public StartRightFiftyFifty() {
    	System.out.println("driving forward");
    	addSequential(new FollowArc(new StartRightFiftyFiftyArc()));
    }
}