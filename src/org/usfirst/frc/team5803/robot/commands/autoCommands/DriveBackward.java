package org.usfirst.frc.team5803.robot.commands.autoCommands;

//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5803.robot.arcs.FifteenFeetReverseArc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with
 * motion profiling. It will drive forward 5 feet.
 */
public class DriveBackward extends CommandGroup {
	// SrxTrajectoryImporter importer = new
	// SrxTrajectoryImporter("/home/lvuser/Autos");
	// SrxTrajectory toFollow = null;
	public DriveBackward() {
		// try {
		// this.toFollow = importer.importSrxTrajectory("DriveBackwardTwelveFeet");
		// System.out.println("import" + this.toFollow);
		// } catch (IOException | ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// addSequential(new FollowTrajectory("DriveBackwardTwelveFeet"));
		System.out.println("Driving Backward");
		addSequential(new FollowArc(new FifteenFeetReverseArc()));
	}
}
