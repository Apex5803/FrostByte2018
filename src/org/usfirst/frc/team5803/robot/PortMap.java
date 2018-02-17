package org.usfirst.frc.team5803.robot;

public class PortMap {
		//drivebase ports
	public static final int DRIVE_BASE_LEFT_1 = 0;
	public static final int DRIVE_BASE_LEFT_2 = 0;
	public static final int DRIVE_BASE_LEFT_3 = 2;
	public static final int DRIVE_BASE_RIGHT_1 = 1;
	public static final int DRIVE_BASE_RIGHT_2 = 1;
	public static final int DRIVE_BASE_RIGHT_3 = 3;
	
		//arm ports
	public static final int ARM_LEAD = 2; //2 for practice bot, 7 for failstorm testing
	public static final int ARM_FOLLOWER = 4;
	public static final int ARM_EXTENDER_LEAD = 6;
	public static final int ARM_EXTENDER_FOLLOWER = 5;
	public static final int ARM_BRAKE_FORWARD_CHANNEL = 4;
	public static final int ARM_BRAKE_REVERSE_CHANNEL = 0;
		
		//cube eater ports
	public static final int TOP_ROLLER_LEAD = 3;
	public static final int TOP_ROLLER_FOLLOWER = 5;
	public static final int BOTTOM_ROLLER_LEAD = 4;
	public static final int BOTTOM_ROLLER_FOLLOWER = 6;
	public static final int PUNCHER1_FORWARD_CHANNEL = 1;
//	public static final int	PUNCHER1_REVERSE_CHANNEL = 7;
	public static final int PUNCHER2_FORWARD_CHANNEL = 2;
//	public static final int	PUNCHER2_REVERSE_CHANNEL = 6;
	public static final int JAW_FORWARD_CHANNEL = 2;
	public static final int JAW_REVERSE_CHANNEL = 5;
	
		//climber ports
	public static final int CLIMBER = 4;
	public static final int	CLIMBER_MIN = 4;
	public static final int CLIMBER_MAX = 4;
	
		//wheeliebar ports
	public static final int WHEELIE_BAR_FORWARD_CHANNEL = 4;
	public static final int WHEELIE_BAR_REVERSE_CHANNEL = 4;
}
