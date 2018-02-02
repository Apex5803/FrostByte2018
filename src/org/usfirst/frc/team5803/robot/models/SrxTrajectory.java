package org.usfirst.frc.team5803.robot.models;

import org.json.simple.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.models.*;





//Combines left and right motion profiles in one object

public class SrxTrajectory {

	public SRXMotionProfile leftProfile;

	public SRXMotionProfile rightProfile;



	public SrxTrajectory(SRXMotionProfile left, SRXMotionProfile right) {

		this.leftProfile = left;

		this.rightProfile = right;

	}



	public SrxTrajectory(JSONObject json){

		leftProfile = new SRXMotionProfile((JSONObject) json.get("left"));

		rightProfile = new SRXMotionProfile((JSONObject) json.get("right"));

	}



	public JSONObject toJson(){

		JSONObject trajectory = new JSONObject();

		trajectory.put("left", leftProfile.toJson());

		trajectory.put("right",rightProfile.toJson());

		return trajectory;

	}



}