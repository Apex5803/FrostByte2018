package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleLeftStartRightArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (11.63,2.79,0.00)
	// (17.88,7.79,79.90)
	// (18.88,17.79,79.90)
	// (23.88,21.79,20.00)
	// (27.88,25.79,89.90)
	
    public ScaleLeftStartRightArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleLeftStartRightArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.077,-1.534,10.000,0.000},
				{-0.383,-4.602,10.000,0.000},
				{-1.074,-9.203,10.000,0.000},
				{-2.301,-15.339,10.000,0.000},
				{-4.218,-23.008,10.000,0.000},
				{-6.979,-32.211,10.000,0.000},
				{-10.737,-42.949,10.000,0.000},
				{-15.646,-55.220,10.000,0.000},
				{-21.858,-69.025,10.000,0.000},
				{-29.527,-84.363,10.000,0.000},
				{-38.807,-101.236,10.000,0.000},
				{-49.851,-119.643,10.000,0.000},
				{-62.812,-139.583,10.000,0.000},
				{-77.844,-161.057,10.000,0.000},
				{-95.101,-184.066,10.000,0.000},
				{-114.734,-208.608,10.000,0.000},
				{-136.899,-234.684,10.000,0.000},
				{-161.671,-260.759,10.000,-0.010},
				{-189.051,-286.835,10.000,-0.010},
				{-219.038,-312.911,10.000,-0.010},
				{-251.633,-338.987,10.000,-0.020},
				{-286.835,-365.063,10.000,-0.020},
				{-324.646,-391.139,10.000,-0.030},
				{-365.063,-417.215,10.000,-0.030},
				{-408.089,-443.291,10.000,-0.040},
				{-453.721,-469.367,10.000,-0.050},
				{-501.962,-495.443,10.000,-0.060},
				{-552.810,-521.519,10.000,-0.070},
				{-606.266,-547.595,10.000,-0.090},
				{-662.329,-573.671,10.000,-0.100},
				{-721.000,-599.747,10.000,-0.120},
				{-782.278,-625.823,10.000,-0.140},
				{-846.164,-651.899,10.000,-0.160},
				{-912.658,-677.975,10.000,-0.190},
				{-981.759,-704.051,10.000,-0.220},
				{-1053.468,-730.126,10.000,-0.250},
				{-1127.785,-756.202,10.000,-0.290},
				{-1204.709,-782.278,10.000,-0.320},
				{-1284.240,-808.354,10.000,-0.370},
				{-1366.380,-834.430,10.000,-0.410},
				{-1451.126,-860.506,10.000,-0.460},
				{-1538.481,-886.582,10.000,-0.520},
				{-1628.443,-912.658,10.000,-0.570},
				{-1721.012,-938.734,10.000,-0.640},
				{-1816.190,-964.810,10.000,-0.700},
				{-1913.974,-990.886,10.000,-0.770},
				{-2014.367,-1016.962,10.000,-0.850},
				{-2117.367,-1043.038,10.000,-0.930},
				{-2222.974,-1069.114,10.000,-1.020},
				{-2331.190,-1095.190,10.000,-1.110},
				{-2442.012,-1121.266,10.000,-1.210},
				{-2555.443,-1147.342,10.000,-1.310},
				{-2671.481,-1173.418,10.000,-1.420},
				{-2790.126,-1199.494,10.000,-1.530},
				{-2911.379,-1225.569,10.000,-1.650},
				{-3035.240,-1251.645,10.000,-1.780},
				{-3161.708,-1277.721,10.000,-1.910},
				{-3290.784,-1303.797,10.000,-2.040},
				{-3422.468,-1329.873,10.000,-2.190},
				{-3556.759,-1355.949,10.000,-2.340},
				{-3693.658,-1382.025,10.000,-2.490},
				{-3833.164,-1408.101,10.000,-2.650},
				{-3975.278,-1434.177,10.000,-2.810},
				{-4119.999,-1460.253,10.000,-2.980},
				{-4267.329,-1486.329,10.000,-3.160},
				{-4417.265,-1512.405,10.000,-3.340},
				{-4569.810,-1538.481,10.000,-3.530},
				{-4724.961,-1564.557,10.000,-3.720},
				{-4882.721,-1590.633,10.000,-3.910},
				{-5043.088,-1616.709,10.000,-4.110},
				{-5206.063,-1642.785,10.000,-4.320},
				{-5371.645,-1668.861,10.000,-4.530},
				{-5539.835,-1694.936,10.000,-4.740},
				{-5710.632,-1721.012,10.000,-4.950},
				{-5884.037,-1747.088,10.000,-5.170},
				{-6060.050,-1773.164,10.000,-5.390},
				{-6238.670,-1799.240,10.000,-5.620},
				{-6419.898,-1825.316,10.000,-5.840},
				{-6603.733,-1851.392,10.000,-6.070},
				{-6790.176,-1877.468,10.000,-6.300},
				{-6979.227,-1903.544,10.000,-6.530},
				{-7170.885,-1929.620,10.000,-6.750},
				{-7365.151,-1955.696,10.000,-6.980},
				{-7562.024,-1981.772,10.000,-7.210},
				{-7761.505,-2007.848,10.000,-7.430},
				{-7963.594,-2033.924,10.000,-7.660},
				{-8168.290,-2060.000,10.000,-7.880},
				{-8375.594,-2086.076,10.000,-8.090},
				{-8585.505,-2112.152,10.000,-8.300},
				{-8798.024,-2138.228,10.000,-8.510},
				{-9013.151,-2164.304,10.000,-8.720},
				{-9230.885,-2190.379,10.000,-8.910},
				{-9451.227,-2216.455,10.000,-9.100},
				{-9674.176,-2242.531,10.000,-9.280},
				{-9899.733,-2268.607,10.000,-9.460},
				{-10127.897,-2294.683,10.000,-9.630},
				{-10358.669,-2320.759,10.000,-9.780},
				{-10592.049,-2346.835,10.000,-9.930},
				{-10828.037,-2372.911,10.000,-10.070},
				{-11066.631,-2398.987,10.000,-10.190},
				{-11307.757,-2423.529,10.000,-10.310},
				{-11551.261,-2446.537,10.000,-10.410},
				{-11796.988,-2468.012,10.000,-10.490},
				{-12044.786,-2487.952,10.000,-10.570},
				{-12294.502,-2506.359,10.000,-10.630},
				{-12545.981,-2523.231,10.000,-10.670},
				{-12799.071,-2538.570,10.000,-10.700},
				{-13053.619,-2552.375,10.000,-10.710},
				{-13309.470,-2564.646,10.000,-10.710},
				{-13566.471,-2575.383,10.000,-10.690},
				{-13824.469,-2584.586,10.000,-10.650},
				{-14083.312,-2592.256,10.000,-10.600},
				{-14342.844,-2598.391,10.000,-10.530},
				{-14602.913,-2602.993,10.000,-10.450},
				{-14863.366,-2606.061,10.000,-10.340},
				{-15124.049,-2607.595,10.000,-10.230},
				{-15384.808,-2607.595,10.000,-10.090},
				{-15645.568,-2607.595,10.000,-9.940},
				{-15906.327,-2607.595,10.000,-9.780},
				{-16167.086,-2607.595,10.000,-9.600},
				{-16427.846,-2607.595,10.000,-9.410},
				{-16688.605,-2607.595,10.000,-9.200},
				{-16949.365,-2607.595,10.000,-8.980},
				{-17210.124,-2607.595,10.000,-8.750},
				{-17470.884,-2607.595,10.000,-8.510},
				{-17731.643,-2607.595,10.000,-8.250},
				{-17992.403,-2607.595,10.000,-7.980},
				{-18253.162,-2607.595,10.000,-7.700},
				{-18513.922,-2607.595,10.000,-7.420},
				{-18774.681,-2607.595,10.000,-7.120},
				{-19035.440,-2607.595,10.000,-6.820},
				{-19296.200,-2607.595,10.000,-6.510},
				{-19556.959,-2607.595,10.000,-6.190},
				{-19817.719,-2607.595,10.000,-5.870},
				{-20078.478,-2607.595,10.000,-5.550},
				{-20339.238,-2607.595,10.000,-5.220},
				{-20599.997,-2607.595,10.000,-4.890},
				{-20860.757,-2607.595,10.000,-4.560},
				{-21121.516,-2607.595,10.000,-4.240},
				{-21382.276,-2607.595,10.000,-3.910},
				{-21643.035,-2607.595,10.000,-3.590},
				{-21903.795,-2607.595,10.000,-3.270},
				{-22164.554,-2607.595,10.000,-2.960},
				{-22425.313,-2607.595,10.000,-2.650},
				{-22686.073,-2607.595,10.000,-2.360},
				{-22946.832,-2607.595,10.000,-2.070},
				{-23207.592,-2607.595,10.000,-1.800},
				{-23468.351,-2607.595,10.000,-1.540},
				{-23729.111,-2607.595,10.000,-1.290},
				{-23989.870,-2607.595,10.000,-1.060},
				{-24250.630,-2607.595,10.000,-0.850},
				{-24511.389,-2607.595,10.000,-0.660},
				{-24772.149,-2607.595,10.000,-0.490},
				{-25032.908,-2607.595,10.000,-0.340},
				{-25293.667,-2607.595,10.000,-0.210},
				{-25554.427,-2607.595,10.000,-0.120},
				{-25815.186,-2607.595,10.000,-0.050},
				{-26075.946,-2607.595,10.000,-0.010},
				{-26336.705,-2607.595,10.000,0.000},
				{-26597.465,-2607.595,10.000,0.020},
				{-26858.224,-2607.595,10.000,0.070},
				{-27118.984,-2607.595,10.000,0.140},
				{-27379.743,-2607.595,10.000,0.240},
				{-27640.503,-2607.595,10.000,0.360},
				{-27901.262,-2607.595,10.000,0.510},
				{-28162.022,-2607.595,10.000,0.680},
				{-28422.781,-2607.595,10.000,0.880},
				{-28683.540,-2607.595,10.000,1.110},
				{-28944.300,-2607.595,10.000,1.370},
				{-29205.059,-2607.595,10.000,1.650},
				{-29465.819,-2607.595,10.000,1.960},
				{-29726.578,-2607.595,10.000,2.300},
				{-29987.338,-2607.595,10.000,2.670},
				{-30248.097,-2607.595,10.000,3.070},
				{-30508.857,-2607.595,10.000,3.510},
				{-30769.616,-2607.595,10.000,3.980},
				{-31030.376,-2607.595,10.000,4.480},
				{-31291.135,-2607.595,10.000,5.010},
				{-31551.895,-2607.595,10.000,5.590},
				{-31812.654,-2607.595,10.000,6.200},
				{-32073.413,-2607.595,10.000,6.850},
				{-32334.173,-2607.595,10.000,7.540},
				{-32594.932,-2607.595,10.000,8.270},
				{-32855.692,-2607.595,10.000,9.050},
				{-33116.451,-2607.595,10.000,9.880},
				{-33377.211,-2607.595,10.000,10.750},
				{-33637.970,-2607.595,10.000,11.670},
				{-33898.730,-2607.595,10.000,12.640},
				{-34159.489,-2607.595,10.000,13.660},
				{-34420.249,-2607.595,10.000,14.740},
				{-34681.008,-2607.595,10.000,15.870},
				{-34941.767,-2607.595,10.000,17.060},
				{-35202.527,-2607.595,10.000,18.310},
				{-35463.286,-2607.595,10.000,19.610},
				{-35724.046,-2607.595,10.000,20.970},
				{-35984.805,-2607.595,10.000,22.390},
				{-36245.565,-2607.595,10.000,23.860},
				{-36506.324,-2607.595,10.000,25.390},
				{-36767.084,-2607.595,10.000,26.970},
				{-37027.843,-2607.595,10.000,28.600},
				{-37288.603,-2607.595,10.000,30.270},
				{-37549.362,-2607.595,10.000,31.980},
				{-37810.122,-2607.595,10.000,33.720},
				{-38070.881,-2607.595,10.000,35.500},
				{-38331.640,-2607.595,10.000,37.290},
				{-38592.400,-2607.595,10.000,39.100},
				{-38853.159,-2607.595,10.000,40.910},
				{-39113.919,-2607.595,10.000,42.720},
				{-39374.678,-2607.595,10.000,44.530},
				{-39635.438,-2607.595,10.000,46.310},
				{-39896.197,-2607.595,10.000,48.070},
				{-40156.957,-2607.595,10.000,49.800},
				{-40417.716,-2607.595,10.000,51.500},
				{-40678.476,-2607.595,10.000,53.150},
				{-40939.235,-2607.595,10.000,54.750},
				{-41199.994,-2607.595,10.000,56.310},
				{-41460.754,-2607.595,10.000,57.810},
				{-41721.513,-2607.595,10.000,59.250},
				{-41982.273,-2607.595,10.000,60.640},
				{-42243.032,-2607.595,10.000,61.980},
				{-42503.792,-2607.595,10.000,63.250},
				{-42764.551,-2607.595,10.000,64.470},
				{-43025.311,-2607.595,10.000,65.630},
				{-43286.070,-2607.595,10.000,66.730},
				{-43546.830,-2607.595,10.000,67.780},
				{-43807.589,-2607.595,10.000,68.780},
				{-44068.349,-2607.595,10.000,69.720},
				{-44329.108,-2607.595,10.000,70.610},
				{-44589.867,-2607.595,10.000,71.450},
				{-44850.627,-2607.595,10.000,72.240},
				{-45111.386,-2607.595,10.000,72.990},
				{-45372.146,-2607.595,10.000,73.690},
				{-45632.905,-2607.595,10.000,74.350},
				{-45893.665,-2607.595,10.000,74.970},
				{-46154.424,-2607.595,10.000,75.540},
				{-46415.184,-2607.595,10.000,76.080},
				{-46675.943,-2607.595,10.000,76.580},
				{-46936.703,-2607.595,10.000,77.040},
				{-47197.462,-2607.595,10.000,77.460},
				{-47458.221,-2607.595,10.000,77.850},
				{-47718.981,-2607.595,10.000,78.200},
				{-47979.740,-2607.595,10.000,78.520},
				{-48240.500,-2607.595,10.000,78.810},
				{-48501.259,-2607.595,10.000,79.060},
				{-48762.019,-2607.595,10.000,79.280},
				{-49022.778,-2607.595,10.000,79.470},
				{-49283.538,-2607.595,10.000,79.620},
				{-49544.297,-2607.595,10.000,79.740},
				{-49805.057,-2607.595,10.000,79.830},
				{-50065.816,-2607.595,10.000,79.880},
				{-50326.576,-2607.595,10.000,79.900},
				{-50587.335,-2607.595,10.000,79.910},
				{-50848.094,-2607.595,10.000,79.950},
				{-51108.854,-2607.595,10.000,80.010},
				{-51369.613,-2607.595,10.000,80.090},
				{-51630.373,-2607.595,10.000,80.190},
				{-51891.132,-2607.595,10.000,80.310},
				{-52151.892,-2607.595,10.000,80.440},
				{-52412.651,-2607.595,10.000,80.600},
				{-52673.411,-2607.595,10.000,80.760},
				{-52934.170,-2607.595,10.000,80.940},
				{-53194.930,-2607.595,10.000,81.140},
				{-53455.689,-2607.595,10.000,81.340},
				{-53716.449,-2607.595,10.000,81.550},
				{-53977.208,-2607.595,10.000,81.780},
				{-54237.967,-2607.595,10.000,82.010},
				{-54498.727,-2607.595,10.000,82.240},
				{-54759.486,-2607.595,10.000,82.480},
				{-55020.246,-2607.595,10.000,82.730},
				{-55281.005,-2607.595,10.000,82.980},
				{-55541.765,-2607.595,10.000,83.230},
				{-55802.524,-2607.595,10.000,83.480},
				{-56063.284,-2607.595,10.000,83.730},
				{-56324.043,-2607.595,10.000,83.980},
				{-56584.803,-2607.595,10.000,84.230},
				{-56845.562,-2607.595,10.000,84.480},
				{-57106.321,-2607.595,10.000,84.730},
				{-57367.081,-2607.595,10.000,84.970},
				{-57627.840,-2607.595,10.000,85.210},
				{-57888.600,-2607.595,10.000,85.440},
				{-58149.359,-2607.595,10.000,85.660},
				{-58410.119,-2607.595,10.000,85.880},
				{-58670.878,-2607.595,10.000,86.090},
				{-58931.638,-2607.595,10.000,86.290},
				{-59192.397,-2607.595,10.000,86.490},
				{-59453.157,-2607.595,10.000,86.670},
				{-59713.916,-2607.595,10.000,86.850},
				{-59974.676,-2607.595,10.000,87.020},
				{-60235.435,-2607.595,10.000,87.170},
				{-60496.194,-2607.595,10.000,87.320},
				{-60756.954,-2607.595,10.000,87.450},
				{-61017.713,-2607.595,10.000,87.580},
				{-61278.473,-2607.595,10.000,87.690},
				{-61539.232,-2607.595,10.000,87.790},
				{-61799.992,-2607.595,10.000,87.870},
				{-62060.751,-2607.595,10.000,87.950},
				{-62321.511,-2607.595,10.000,88.010},
				{-62582.270,-2607.595,10.000,88.060},
				{-62843.030,-2607.595,10.000,88.100},
				{-63103.789,-2607.595,10.000,88.120},
				{-63364.548,-2607.595,10.000,88.130},
				{-63625.308,-2607.595,10.000,88.130},
				{-63886.067,-2607.595,10.000,88.110},
				{-64146.827,-2607.595,10.000,88.090},
				{-64407.586,-2607.595,10.000,88.050},
				{-64668.346,-2607.595,10.000,87.990},
				{-64929.105,-2607.595,10.000,87.930},
				{-65189.865,-2607.595,10.000,87.850},
				{-65450.624,-2607.595,10.000,87.760},
				{-65711.384,-2607.595,10.000,87.650},
				{-65972.143,-2607.595,10.000,87.540},
				{-66232.903,-2607.595,10.000,87.410},
				{-66493.662,-2607.595,10.000,87.270},
				{-66754.421,-2607.595,10.000,87.130},
				{-67015.181,-2607.595,10.000,86.970},
				{-67275.940,-2607.595,10.000,86.800},
				{-67536.700,-2607.595,10.000,86.620},
				{-67797.459,-2607.595,10.000,86.430},
				{-68058.219,-2607.595,10.000,86.230},
				{-68318.978,-2607.595,10.000,86.030},
				{-68579.738,-2607.595,10.000,85.810},
				{-68840.497,-2607.595,10.000,85.590},
				{-69101.257,-2607.595,10.000,85.370},
				{-69362.016,-2607.595,10.000,85.130},
				{-69622.775,-2607.595,10.000,84.890},
				{-69883.535,-2607.595,10.000,84.650},
				{-70144.294,-2607.595,10.000,84.410},
				{-70405.054,-2607.595,10.000,84.160},
				{-70665.813,-2607.595,10.000,83.910},
				{-70926.573,-2607.595,10.000,83.650},
				{-71187.332,-2607.595,10.000,83.400},
				{-71448.092,-2607.595,10.000,83.150},
				{-71708.851,-2607.595,10.000,82.900},
				{-71969.611,-2607.595,10.000,82.650},
				{-72230.370,-2607.595,10.000,82.410},
				{-72491.130,-2607.595,10.000,82.170},
				{-72751.889,-2607.595,10.000,81.930},
				{-73012.648,-2607.595,10.000,81.710},
				{-73273.408,-2607.595,10.000,81.490},
				{-73534.167,-2607.595,10.000,81.280},
				{-73794.927,-2607.595,10.000,81.080},
				{-74055.686,-2607.595,10.000,80.890},
				{-74316.446,-2607.595,10.000,80.710},
				{-74577.205,-2607.595,10.000,80.550},
				{-74837.965,-2607.595,10.000,80.400},
				{-75098.724,-2607.595,10.000,80.270},
				{-75359.484,-2607.595,10.000,80.150},
				{-75620.243,-2607.595,10.000,80.060},
				{-75881.002,-2607.595,10.000,79.990},
				{-76141.762,-2607.595,10.000,79.930},
				{-76402.521,-2607.595,10.000,79.910},
				{-76663.281,-2607.595,10.000,79.890},
				{-76924.040,-2607.595,10.000,79.810},
				{-77184.800,-2607.595,10.000,79.620},
				{-77445.559,-2607.595,10.000,79.340},
				{-77706.319,-2607.595,10.000,78.970},
				{-77967.078,-2607.595,10.000,78.500},
				{-78227.838,-2607.595,10.000,77.940},
				{-78488.597,-2607.595,10.000,77.290},
				{-78749.357,-2607.595,10.000,76.540},
				{-79010.116,-2607.595,10.000,75.690},
				{-79270.875,-2607.595,10.000,74.740},
				{-79531.635,-2607.595,10.000,73.690},
				{-79792.394,-2607.595,10.000,72.530},
				{-80053.154,-2607.595,10.000,71.250},
				{-80313.913,-2607.595,10.000,69.870},
				{-80574.673,-2607.595,10.000,68.360},
				{-80835.432,-2607.595,10.000,66.740},
				{-81096.192,-2607.595,10.000,65.000},
				{-81356.951,-2607.595,10.000,63.140},
				{-81617.711,-2607.595,10.000,61.170},
				{-81878.470,-2607.595,10.000,59.090},
				{-82139.230,-2607.595,10.000,56.910},
				{-82399.989,-2607.595,10.000,54.640},
				{-82660.748,-2607.595,10.000,52.310},
				{-82921.508,-2607.595,10.000,49.920},
				{-83182.267,-2607.595,10.000,47.500},
				{-83443.027,-2607.595,10.000,45.080},
				{-83703.786,-2607.595,10.000,42.670},
				{-83964.546,-2607.595,10.000,40.300},
				{-84225.305,-2607.595,10.000,38.000},
				{-84486.065,-2607.595,10.000,35.770},
				{-84746.824,-2607.595,10.000,33.640},
				{-85007.584,-2607.595,10.000,31.620},
				{-85268.343,-2607.595,10.000,29.730},
				{-85529.102,-2607.595,10.000,27.950},
				{-85789.862,-2607.595,10.000,26.310},
				{-86050.621,-2607.595,10.000,24.790},
				{-86311.381,-2607.595,10.000,23.410},
				{-86572.140,-2607.595,10.000,22.150},
				{-86832.900,-2607.595,10.000,21.010},
				{-87093.659,-2607.595,10.000,19.990},
				{-87354.419,-2607.595,10.000,19.080},
				{-87615.178,-2607.595,10.000,18.280},
				{-87875.938,-2607.595,10.000,17.590},
				{-88136.697,-2607.595,10.000,16.990},
				{-88397.457,-2607.595,10.000,16.490},
				{-88658.216,-2607.595,10.000,16.080},
				{-88918.975,-2607.595,10.000,15.750},
				{-89179.735,-2607.595,10.000,15.500},
				{-89440.494,-2607.595,10.000,15.330},
				{-89701.254,-2607.595,10.000,15.230},
				{-89962.013,-2607.595,10.000,15.200},
				{-90222.773,-2607.595,10.000,15.230},
				{-90483.532,-2607.595,10.000,15.320},
				{-90744.292,-2607.595,10.000,15.460},
				{-91005.051,-2607.595,10.000,15.660},
				{-91265.811,-2607.595,10.000,15.900},
				{-91526.570,-2607.595,10.000,16.190},
				{-91787.329,-2607.595,10.000,16.500},
				{-92048.089,-2607.595,10.000,16.850},
				{-92308.848,-2607.595,10.000,17.220},
				{-92569.608,-2607.595,10.000,17.600},
				{-92830.367,-2607.595,10.000,17.980},
				{-93091.127,-2607.595,10.000,18.360},
				{-93351.886,-2607.595,10.000,18.730},
				{-93612.646,-2607.595,10.000,19.080},
				{-93873.405,-2607.595,10.000,19.380},
				{-94134.165,-2607.595,10.000,19.640},
				{-94394.924,-2607.595,10.000,19.840},
				{-94655.684,-2607.595,10.000,19.960},
				{-94916.443,-2607.595,10.000,20.000},
				{-95177.202,-2607.595,10.000,19.950},
				{-95437.962,-2607.595,10.000,19.830},
				{-95698.721,-2607.595,10.000,19.650},
				{-95959.481,-2607.595,10.000,19.440},
				{-96220.240,-2607.595,10.000,19.200},
				{-96480.985,-2607.300,10.000,18.940},
				{-96741.624,-2605.472,10.000,18.680},
				{-97002.003,-2602.110,10.000,18.430},
				{-97261.969,-2597.214,10.000,18.190},
				{-97521.369,-2590.784,10.000,17.980},
				{-97780.049,-2582.820,10.000,17.810},
				{-98037.856,-2573.322,10.000,17.680},
				{-98294.637,-2562.291,10.000,17.590},
				{-98550.237,-2549.725,10.000,17.560},
				{-98804.505,-2535.626,10.000,17.580},
				{-99057.286,-2519.993,10.000,17.670},
				{-99308.427,-2502.826,10.000,17.830},
				{-99557.774,-2484.125,10.000,18.050},
				{-99805.175,-2463.890,10.000,18.360},
				{-100050.476,-2442.121,10.000,18.730},
				{-100293.523,-2418.818,10.000,19.190},
				{-100534.163,-2393.982,10.000,19.740},
				{-100772.257,-2367.906,10.000,20.370},
				{-101007.744,-2341.830,10.000,21.090},
				{-101240.623,-2315.754,10.000,21.900},
				{-101470.895,-2289.678,10.000,22.810},
				{-101698.559,-2263.602,10.000,23.810},
				{-101923.615,-2237.526,10.000,24.920},
				{-102146.064,-2211.450,10.000,26.120},
				{-102365.905,-2185.374,10.000,27.430},
				{-102583.139,-2159.298,10.000,28.840},
				{-102797.765,-2133.222,10.000,30.350},
				{-103009.783,-2107.146,10.000,31.970},
				{-103219.194,-2081.071,10.000,33.670},
				{-103425.997,-2054.995,10.000,35.480},
				{-103630.193,-2028.919,10.000,37.360},
				{-103831.781,-2002.843,10.000,39.320},
				{-104030.761,-1976.767,10.000,41.340},
				{-104227.134,-1950.691,10.000,43.420},
				{-104420.900,-1924.615,10.000,45.530},
				{-104612.057,-1898.539,10.000,47.660},
				{-104800.607,-1872.463,10.000,49.800},
				{-104986.550,-1846.387,10.000,51.930},
				{-105169.885,-1820.311,10.000,54.040},
				{-105350.612,-1794.235,10.000,56.110},
				{-105528.732,-1768.159,10.000,58.130},
				{-105704.244,-1742.083,10.000,60.080},
				{-105877.148,-1716.007,10.000,61.970},
				{-106047.445,-1689.931,10.000,63.780},
				{-106215.135,-1663.855,10.000,65.510},
				{-106380.216,-1637.779,10.000,67.160},
				{-106542.691,-1611.703,10.000,68.720},
				{-106702.557,-1585.628,10.000,70.200},
				{-106859.816,-1559.552,10.000,71.600},
				{-107014.467,-1533.476,10.000,72.910},
				{-107166.511,-1507.400,10.000,74.150},
				{-107315.947,-1481.324,10.000,75.310},
				{-107462.776,-1455.248,10.000,76.390},
				{-107606.997,-1429.172,10.000,77.410},
				{-107748.610,-1403.096,10.000,78.360},
				{-107887.616,-1377.020,10.000,79.250},
				{-108024.014,-1350.944,10.000,80.080},
				{-108157.805,-1324.868,10.000,80.850},
				{-108288.988,-1298.792,10.000,81.570},
				{-108417.563,-1272.716,10.000,82.250},
				{-108543.531,-1246.640,10.000,82.870},
				{-108666.891,-1220.564,10.000,83.460},
				{-108787.644,-1194.488,10.000,84.000},
				{-108905.789,-1168.412,10.000,84.510},
				{-109021.327,-1142.336,10.000,84.980},
				{-109134.256,-1116.261,10.000,85.410},
				{-109244.579,-1090.185,10.000,85.820},
				{-109352.293,-1064.109,10.000,86.190},
				{-109457.400,-1038.033,10.000,86.540},
				{-109559.900,-1011.957,10.000,86.860},
				{-109659.792,-985.881,10.000,87.160},
				{-109757.076,-959.805,10.000,87.430},
				{-109851.753,-933.729,10.000,87.680},
				{-109943.822,-907.653,10.000,87.910},
				{-110033.283,-881.577,10.000,88.120},
				{-110120.137,-855.501,10.000,88.320},
				{-110204.384,-829.425,10.000,88.500},
				{-110286.022,-803.349,10.000,88.660},
				{-110365.053,-777.273,10.000,88.810},
				{-110441.477,-751.197,10.000,88.940},
				{-110515.293,-725.121,10.000,89.060},
				{-110586.501,-699.045,10.000,89.170},
				{-110655.102,-672.969,10.000,89.270},
				{-110721.095,-646.893,10.000,89.360},
				{-110784.481,-620.818,10.000,89.440},
				{-110845.259,-594.742,10.000,89.500},
				{-110903.429,-568.666,10.000,89.570},
				{-110958.992,-542.590,10.000,89.620},
				{-111011.947,-516.514,10.000,89.670},
				{-111062.294,-490.438,10.000,89.710},
				{-111110.034,-464.362,10.000,89.740},
				{-111155.167,-438.286,10.000,89.770},
				{-111197.692,-412.210,10.000,89.800},
				{-111237.609,-386.134,10.000,89.820},
				{-111274.918,-360.058,10.000,89.840},
				{-111309.620,-333.982,10.000,89.850},
				{-111341.715,-307.906,10.000,89.860},
				{-111371.202,-281.830,10.000,89.870},
				{-111398.081,-255.754,10.000,89.880},
				{-111422.353,-229.678,10.000,89.890},
				{-111444.031,-203.897,10.000,89.890},
				{-111463.209,-179.649,10.000,89.890},
				{-111480.038,-156.935,10.000,89.900},
				{-111494.672,-135.756,10.000,89.900},
				{-111507.266,-116.110,10.000,89.900},
				{-111517.971,-97.997,10.000,89.900},
				{-111526.942,-81.419,10.000,89.900},
				{-111534.331,-66.375,10.000,89.900},
				{-111540.293,-52.864,10.000,89.900},
				{-111544.981,-40.888,10.000,89.900},
				{-111548.548,-30.445,10.000,89.900},
				{-111551.147,-21.536,10.000,89.900},
				{-111552.932,-14.161,10.000,89.900},
				{-111554.056,-8.320,10.000,89.900},
				{-111554.672,-4.013,10.000,89.900},
				{-111554.935,-1.239,10.000,89.900},
				{-111554.997,-0.000,10.000,89.900},
				{-111554.997,-0.000,10.000,89.900}		};

}