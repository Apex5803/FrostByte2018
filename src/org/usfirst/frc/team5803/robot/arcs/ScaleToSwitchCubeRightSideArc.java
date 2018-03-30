package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleToSwitchCubeRightSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.13,6.79,0.00)
	// (19.13,7.29,0.00)
	
    public ScaleToSwitchCubeRightSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleToSwitchCubeRightSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.567,11.344,10.000,0.000},
				{2.836,34.031,10.000,0.000},
				{7.941,68.062,10.000,0.000},
				{17.016,113.437,10.000,0.000},
				{31.195,170.155,10.000,0.000},
				{51.614,238.218,10.000,0.000},
				{79.406,317.623,10.000,0.000},
				{115.706,408.373,10.000,0.000},
				{161.648,510.466,10.000,0.000},
				{218.366,623.903,10.000,0.000},
				{286.995,748.684,10.000,0.000},
				{368.670,884.808,10.000,0.000},
				{464.524,1032.276,10.000,0.000},
				{575.692,1191.088,10.000,-0.010},
				{702.742,1349.899,10.000,-0.010},
				{845.672,1508.711,10.000,-0.010},
				{1004.484,1667.523,10.000,-0.020},
				{1179.177,1826.334,10.000,-0.020},
				{1369.751,1985.146,10.000,-0.030},
				{1576.206,2143.958,10.000,-0.040},
				{1798.542,2302.769,10.000,-0.050},
				{2036.760,2461.581,10.000,-0.070},
				{2290.859,2620.393,10.000,-0.080},
				{2560.838,2779.205,10.000,-0.110},
				{2846.699,2938.016,10.000,-0.130},
				{3148.442,3096.828,10.000,-0.160},
				{3466.065,3255.640,10.000,-0.190},
				{3799.570,3414.451,10.000,-0.230},
				{4148.955,3573.263,10.000,-0.270},
				{4514.222,3732.075,10.000,-0.310},
				{4895.370,3890.886,10.000,-0.370},
				{5292.399,4049.698,10.000,-0.430},
				{5705.310,4208.510,10.000,-0.490},
				{6134.101,4367.321,10.000,-0.560},
				{6578.774,4526.133,10.000,-0.640},
				{7039.328,4684.945,10.000,-0.730},
				{7515.763,4843.756,10.000,-0.820},
				{8008.079,5002.568,10.000,-0.920},
				{8516.277,5161.380,10.000,-1.030},
				{9040.355,5320.192,10.000,-1.150},
				{9580.315,5479.003,10.000,-1.270},
				{10136.156,5637.815,10.000,-1.410},
				{10707.878,5796.627,10.000,-1.550},
				{11295.481,5955.438,10.000,-1.710},
				{11898.966,6114.250,10.000,-1.870},
				{12518.331,6273.062,10.000,-2.040},
				{13153.578,6431.873,10.000,-2.220},
				{13804.706,6590.685,10.000,-2.410},
				{14471.715,6749.497,10.000,-2.610},
				{15154.605,6908.308,10.000,-2.820},
				{15853.377,7067.120,10.000,-3.030},
				{16568.029,7225.932,10.000,-3.260},
				{17298.563,7384.743,10.000,-3.490},
				{18044.978,7543.555,10.000,-3.730},
				{18807.274,7702.367,10.000,-3.980},
				{19585.451,7861.179,10.000,-4.240},
				{20379.510,8019.990,10.000,-4.500},
				{21189.449,8178.802,10.000,-4.770},
				{22015.270,8337.614,10.000,-5.040},
				{22856.972,8496.425,10.000,-5.320},
				{23714.555,8655.237,10.000,-5.600},
				{24588.019,8814.049,10.000,-5.890},
				{25477.365,8972.860,10.000,-6.170},
				{26382.592,9131.672,10.000,-6.460},
				{27303.699,9290.484,10.000,-6.750},
				{28240.688,9449.295,10.000,-7.040},
				{29193.558,9608.107,10.000,-7.320},
				{30162.310,9766.919,10.000,-7.610},
				{31146.942,9925.730,10.000,-7.880},
				{32147.456,10084.542,10.000,-8.160},
				{33163.851,10243.354,10.000,-8.420},
				{34196.127,10402.166,10.000,-8.680},
				{35244.284,10560.977,10.000,-8.930},
				{36307.755,10708.445,10.000,-9.170},
				{37385.406,10844.569,10.000,-9.400},
				{38476.101,10969.350,10.000,-9.610},
				{39578.708,11082.787,10.000,-9.800},
				{40692.092,11184.880,10.000,-9.980},
				{41815.117,11275.630,10.000,-10.150},
				{42946.650,11355.036,10.000,-10.290},
				{44085.557,11423.098,10.000,-10.410},
				{45230.703,11479.816,10.000,-10.520},
				{46380.953,11525.191,10.000,-10.600},
				{47535.174,11559.222,10.000,-10.660},
				{48692.230,11581.909,10.000,-10.700},
				{49850.989,11593.253,10.000,-10.710},
				{51009.908,11585.141,10.000,-10.700},
				{52167.450,11565.684,10.000,-10.670},
				{53322.478,11534.885,10.000,-10.620},
				{54473.859,11492.741,10.000,-10.540},
				{55620.459,11439.254,10.000,-10.450},
				{56761.143,11374.423,10.000,-10.330},
				{57894.776,11298.248,10.000,-10.190},
				{59020.225,11210.730,10.000,-10.030},
				{60136.355,11111.868,10.000,-9.860},
				{61242.032,11001.662,10.000,-9.660},
				{62336.120,10880.113,10.000,-9.460},
				{63417.487,10747.219,10.000,-9.240},
				{64484.997,10602.983,10.000,-9.000},
				{65537.516,10447.402,10.000,-8.750},
				{66574.316,10288.590,10.000,-8.500},
				{67595.234,10129.779,10.000,-8.230},
				{68600.272,9970.967,10.000,-7.960},
				{69589.428,9812.155,10.000,-7.690},
				{70562.703,9653.344,10.000,-7.410},
				{71520.097,9494.532,10.000,-7.120},
				{72461.609,9335.720,10.000,-6.830},
				{73387.241,9176.909,10.000,-6.540},
				{74296.991,9018.097,10.000,-6.260},
				{75190.860,8859.285,10.000,-5.970},
				{76068.848,8700.474,10.000,-5.680},
				{76930.955,8541.662,10.000,-5.400},
				{77777.180,8382.850,10.000,-5.120},
				{78607.525,8224.039,10.000,-4.850},
				{79421.988,8065.227,10.000,-4.580},
				{80220.570,7906.415,10.000,-4.310},
				{81003.271,7747.603,10.000,-4.060},
				{81770.091,7588.792,10.000,-3.800},
				{82521.029,7429.980,10.000,-3.560},
				{83256.087,7271.168,10.000,-3.330},
				{83975.263,7112.357,10.000,-3.100},
				{84678.558,6953.545,10.000,-2.880},
				{85365.972,6794.733,10.000,-2.670},
				{86037.505,6635.922,10.000,-2.470},
				{86693.156,6477.110,10.000,-2.270},
				{87332.927,6318.298,10.000,-2.090},
				{87956.816,6159.487,10.000,-1.920},
				{88564.824,6000.675,10.000,-1.750},
				{89156.951,5841.863,10.000,-1.600},
				{89733.197,5683.052,10.000,-1.450},
				{90293.561,5524.240,10.000,-1.310},
				{90838.045,5365.428,10.000,-1.180},
				{91366.647,5206.616,10.000,-1.060},
				{91879.368,5047.805,10.000,-0.950},
				{92376.208,4888.993,10.000,-0.850},
				{92857.167,4730.181,10.000,-0.750},
				{93322.244,4571.370,10.000,-0.660},
				{93771.441,4412.558,10.000,-0.580},
				{94204.756,4253.746,10.000,-0.510},
				{94622.190,4094.935,10.000,-0.440},
				{95023.743,3936.123,10.000,-0.380},
				{95409.415,3777.311,10.000,-0.330},
				{95779.205,3618.500,10.000,-0.280},
				{96133.114,3459.688,10.000,-0.240},
				{96471.143,3300.876,10.000,-0.200},
				{96793.290,3142.065,10.000,-0.170},
				{97099.556,2983.253,10.000,-0.140},
				{97389.940,2824.441,10.000,-0.110},
				{97664.444,2665.629,10.000,-0.090},
				{97923.066,2506.818,10.000,-0.070},
				{98165.807,2348.006,10.000,-0.060},
				{98392.667,2189.194,10.000,-0.040},
				{98603.646,2030.383,10.000,-0.030},
				{98798.744,1871.571,10.000,-0.030},
				{98977.960,1712.759,10.000,-0.020},
				{99141.296,1553.948,10.000,-0.010},
				{99288.750,1395.136,10.000,-0.010},
				{99420.323,1236.324,10.000,-0.010},
				{99536.015,1077.513,10.000,0.000},
				{99636.231,926.813,10.000,0.000},
				{99721.945,787.458,10.000,0.000},
				{99794.290,659.446,10.000,0.000},
				{99854.401,542.778,10.000,0.000},
				{99903.413,437.454,10.000,0.000},
				{99942.459,343.473,10.000,0.000},
				{99972.674,260.836,10.000,0.000},
				{99995.193,189.543,10.000,0.000},
				{100011.150,129.593,10.000,0.000},
				{100021.679,80.987,10.000,0.000},
				{100027.915,43.725,10.000,0.000},
				{100030.991,17.806,10.000,0.000},
				{100032.043,3.231,10.000,0.000},
				{100032.205,0.000,10.000,0.000},
				{100032.205,0.000,10.000,0.000}		};

}