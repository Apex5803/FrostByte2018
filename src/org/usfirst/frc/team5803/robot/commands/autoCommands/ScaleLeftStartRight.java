package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartRightArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartRightpt2Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeManual;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class ScaleLeftStartRight extends CommandGroup {
//	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
//	SrxTrajectory toFollow = null;
    public ScaleLeftStartRight() {
//        	try {
//    			this.toFollow = importer.importSrxTrajectory("ScaleLeftStartRight");
//    			System.out.println("import" + this.toFollow); 
//    		} catch (IOException | ParseException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
////        	addSequential(new IntakeCreep(), 0.2);
        	addParallel(new IntakeCreep(), 10);
        	addParallel(new FollowArc(new ScaleLeftStartRightArc()));
        	addSequential(new WaitCommand(.5));
        	addSequential(new RotateArmAngle(45), 1);
        	System.out.println("Driving ScaleLeftStartRight");
        	addSequential(new WaitCommand(5));
        	addSequential(new RotateArmAngle(80), 1);
        	addSequential(new PunchCube(), 2);
        	addSequential(new RetractPuncher());
    }
}
