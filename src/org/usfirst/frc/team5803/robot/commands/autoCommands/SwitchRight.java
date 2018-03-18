package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeStandard;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class SwitchRight extends CommandGroup {
	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
	SrxTrajectory toFollow = null;
    public SwitchRight() {
        	try {
    			this.toFollow = importer.importSrxTrajectory("SwitchRight");
    			System.out.println("import" + this.toFollow); 
    		} catch (IOException | ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        	
        	addParallel(new IntakeCreep(), 4);
        	addSequential(new FollowTrajectory("SwitchRight"));
//        	addSequential(new IntakeCreep(), 1);
        	System.out.println("Driving SwitchRight");
        	addSequential(new ReleaseArm() , 0.1);
        	addSequential(new RotateArmAngle(40), 1);        	
        	addSequential(new SpitCubeAuto(), 2);
        	addSequential(new LockArm() , 0.1);
        	addSequential(new IntakeCreep());
    }
}
