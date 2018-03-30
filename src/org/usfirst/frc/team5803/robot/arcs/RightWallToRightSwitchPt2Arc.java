package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class RightWallToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.63,2.79,-30.00)
	// (20.63,1.79,-60.00)
	
    public RightWallToRightSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.566,11.314,10.000,-30.000},
				{2.828,33.942,10.000,-30.000},
				{7.920,67.884,10.000,-30.000},
				{16.971,113.140,10.000,-30.000},
				{31.113,169.710,10.000,-30.000},
				{51.479,237.594,10.000,-30.000},
				{79.198,316.791,10.000,-30.000},
				{115.403,407.303,10.000,-30.000},
				{161.224,509.129,10.000,-29.990},
				{217.794,622.269,10.000,-29.990},
				{286.244,746.723,10.000,-29.980},
				{367.704,882.491,10.000,-29.970},
				{463.308,1029.572,10.000,-29.950},
				{574.185,1187.968,10.000,-29.920},
				{700.901,1346.364,10.000,-29.880},
				{843.457,1504.760,10.000,-29.820},
				{1001.853,1663.155,10.000,-29.750},
				{1176.088,1821.551,10.000,-29.660},
				{1366.163,1979.947,10.000,-29.550},
				{1572.078,2138.342,10.000,-29.410},
				{1793.832,2296.738,10.000,-29.240},
				{2031.425,2455.134,10.000,-29.040},
				{2284.859,2613.530,10.000,-28.800},
				{2554.131,2771.925,10.000,-28.520},
				{2839.244,2930.321,10.000,-28.200},
				{3140.196,3088.717,10.000,-27.830},
				{3456.987,3247.113,10.000,-27.410},
				{3789.618,3405.508,10.000,-26.950},
				{4138.089,3563.904,10.000,-26.430},
				{4502.399,3722.300,10.000,-25.860},
				{4882.549,3880.696,10.000,-25.240},
				{5278.538,4039.091,10.000,-24.570},
				{5690.367,4197.487,10.000,-23.840},
				{6118.035,4355.883,10.000,-23.060},
				{6561.543,4514.279,10.000,-22.240},
				{7020.891,4672.674,10.000,-21.380},
				{7496.078,4831.070,10.000,-20.470},
				{7987.105,4989.466,10.000,-19.540},
				{8493.971,5147.861,10.000,-18.580},
				{9016.677,5306.257,10.000,-17.600},
				{9555.223,5464.653,10.000,-16.610},
				{10109.608,5623.049,10.000,-15.620},
				{10679.833,5781.444,10.000,-14.630},
				{11265.897,5939.840,10.000,-13.670},
				{11867.801,6098.236,10.000,-12.730},
				{12485.544,6256.632,10.000,-11.840},
				{13119.127,6415.027,10.000,-10.990},
				{13768.550,6573.423,10.000,-10.200},
				{14433.246,6720.505,10.000,-9.480},
				{15112.085,6856.273,10.000,-8.840},
				{15803.935,6980.726,10.000,-8.290},
				{16507.664,7093.866,10.000,-7.840},
				{17222.142,7195.692,10.000,-7.490},
				{17946.237,7286.204,10.000,-7.260},
				{18678.817,7365.402,10.000,-7.160},
				{19418.752,7433.286,10.000,-7.180},
				{20164.909,7489.856,10.000,-7.340},
				{20916.157,7535.112,10.000,-7.640},
				{21671.365,7569.053,10.000,-8.090},
				{22429.402,7591.681,10.000,-8.690},
				{23189.136,7602.995,10.000,-9.460},
				{23948.969,7593.671,10.000,-10.380},
				{24707.305,7573.032,10.000,-11.470},
				{25463.010,7541.079,10.000,-12.720},
				{26214.955,7497.812,10.000,-14.130},
				{26962.007,7443.232,10.000,-15.700},
				{27703.035,7377.337,10.000,-17.420},
				{28436.909,7300.128,10.000,-19.280},
				{29162.495,7211.606,10.000,-21.260},
				{29878.664,7111.769,10.000,-23.340},
				{30584.283,7000.618,10.000,-25.500},
				{31278.222,6878.154,10.000,-27.710},
				{31959.348,6744.375,10.000,-29.950},
				{32626.531,6599.282,10.000,-32.170},
				{33278.639,6442.876,10.000,-34.350},
				{33915.007,6284.480,10.000,-36.480},
				{34535.535,6126.084,10.000,-38.530},
				{35140.224,5967.689,10.000,-40.480},
				{35729.073,5809.293,10.000,-42.330},
				{36302.082,5650.897,10.000,-44.070},
				{36859.252,5492.501,10.000,-45.690},
				{37400.583,5334.106,10.000,-47.190},
				{37926.073,5175.710,10.000,-48.590},
				{38435.725,5017.314,10.000,-49.860},
				{38929.536,4858.918,10.000,-51.030},
				{39407.508,4700.523,10.000,-52.100},
				{39869.641,4542.127,10.000,-53.070},
				{40315.934,4383.731,10.000,-53.950},
				{40746.387,4225.335,10.000,-54.740},
				{41161.001,4066.940,10.000,-55.450},
				{41559.775,3908.544,10.000,-56.080},
				{41942.710,3750.148,10.000,-56.650},
				{42309.805,3591.753,10.000,-57.150},
				{42661.060,3433.357,10.000,-57.600},
				{42996.476,3274.961,10.000,-57.990},
				{43316.052,3116.565,10.000,-58.330},
				{43619.789,2958.170,10.000,-58.620},
				{43907.686,2799.774,10.000,-58.880},
				{44179.744,2641.378,10.000,-59.090},
				{44435.962,2482.982,10.000,-59.280},
				{44676.340,2324.587,10.000,-59.430},
				{44900.879,2166.191,10.000,-59.560},
				{45109.578,2007.795,10.000,-59.670},
				{45302.438,1849.399,10.000,-59.750},
				{45479.458,1691.004,10.000,-59.820},
				{45640.639,1532.608,10.000,-59.870},
				{45785.980,1374.212,10.000,-59.910},
				{45915.481,1215.816,10.000,-59.940},
				{46029.143,1057.421,10.000,-59.960},
				{46127.432,908.350,10.000,-59.970},
				{46211.379,770.593,10.000,-59.980},
				{46282.116,644.150,10.000,-59.990},
				{46340.775,529.021,10.000,-59.990},
				{46388.486,425.206,10.000,-60.000},
				{46426.381,332.705,10.000,-60.000},
				{46455.593,251.518,10.000,-60.000},
				{46477.251,181.645,10.000,-60.000},
				{46492.487,123.086,10.000,-60.000},
				{46502.434,75.841,10.000,-60.000},
				{46508.221,39.909,10.000,-60.000},
				{46510.981,15.292,10.000,-60.000},
				{46511.845,1.989,10.000,-60.000},
				{46511.945,0.000,10.000,-60.000},
				{46511.945,0.000,10.000,-60.000}		};

}