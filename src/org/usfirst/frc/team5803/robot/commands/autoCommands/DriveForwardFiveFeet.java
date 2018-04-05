package org.usfirst.frc.team5803.robot.commands.autoCommands;

//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with
 * motion profiling. It will drive forward 5 feet.
 */
public class DriveForwardFiveFeet extends CommandGroup {
	// SrxTrajectoryImporter importer = new
	// SrxTrajectoryImporter("/home/lvuser/Autos");
	// SrxTrajectory toFollow = null;
	public DriveForwardFiveFeet() {
		// try {
		// this.toFollow = importer.importSrxTrajectory("DriveForwardFiveFeet");
		// System.out.println("import" + this.toFollow);
		// } catch (IOException | ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// addSequential(new FollowTrajectory("DriveForwardFiveFeet"));
		System.out.println("Driving FiveFeet");
	}
}
