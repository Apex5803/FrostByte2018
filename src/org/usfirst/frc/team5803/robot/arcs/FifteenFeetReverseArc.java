package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class FifteenFeetReverseArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
    public FifteenFeetReverseArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetReverseArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.568,-11.351,10.000,0.000},
				{-2.838,-34.054,10.000,0.000},
				{-7.946,-68.107,10.000,0.000},
				{-17.027,-113.512,10.000,0.000},
				{-31.216,-170.268,10.000,0.000},
				{-51.648,-238.376,10.000,0.000},
				{-79.459,-317.834,10.000,0.000},
				{-115.783,-408.644,10.000,0.000},
				{-161.755,-510.805,10.000,0.000},
				{-218.511,-624.318,10.000,0.000},
				{-287.186,-749.181,10.000,0.000},
				{-368.915,-885.396,10.000,0.000},
				{-464.833,-1032.962,10.000,0.000},
				{-576.075,-1191.879,10.000,0.000},
				{-703.209,-1350.797,10.000,0.000},
				{-846.234,-1509.714,10.000,0.000},
				{-1005.152,-1668.631,10.000,0.000},
				{-1179.961,-1827.548,10.000,0.000},
				{-1370.661,-1986.466,10.000,0.000},
				{-1577.254,-2145.383,10.000,0.000},
				{-1799.738,-2304.300,10.000,0.000},
				{-2038.114,-2463.217,10.000,0.000},
				{-2292.381,-2622.135,10.000,0.000},
				{-2562.541,-2781.052,10.000,0.000},
				{-2848.592,-2939.969,10.000,0.000},
				{-3150.534,-3098.886,10.000,0.000},
				{-3468.369,-3257.804,10.000,0.000},
				{-3802.095,-3416.721,10.000,0.000},
				{-4151.713,-3575.638,10.000,0.000},
				{-4517.223,-3734.555,10.000,0.000},
				{-4898.624,-3893.472,10.000,0.000},
				{-5295.917,-4052.390,10.000,0.000},
				{-5709.102,-4211.307,10.000,0.000},
				{-6138.179,-4370.224,10.000,0.000},
				{-6583.147,-4529.141,10.000,0.000},
				{-7044.007,-4688.059,10.000,0.000},
				{-7520.759,-4846.976,10.000,0.000},
				{-8013.402,-5005.893,10.000,0.000},
				{-8521.937,-5164.810,10.000,0.000},
				{-9046.364,-5323.728,10.000,0.000},
				{-9586.683,-5482.645,10.000,0.000},
				{-10142.893,-5641.562,10.000,0.000},
				{-10714.995,-5800.479,10.000,0.000},
				{-11302.989,-5959.397,10.000,0.000},
				{-11906.875,-6118.314,10.000,0.000},
				{-12526.652,-6277.231,10.000,0.000},
				{-13162.321,-6436.148,10.000,0.000},
				{-13813.881,-6595.066,10.000,0.000},
				{-14481.334,-6753.983,10.000,0.000},
				{-15164.678,-6912.900,10.000,0.000},
				{-15863.914,-7071.817,10.000,0.000},
				{-16579.042,-7230.735,10.000,0.000},
				{-17310.061,-7389.652,10.000,0.000},
				{-18056.972,-7548.569,10.000,0.000},
				{-18819.775,-7707.486,10.000,0.000},
				{-19598.469,-7866.404,10.000,0.000},
				{-20393.055,-8025.321,10.000,0.000},
				{-21203.533,-8184.238,10.000,0.000},
				{-22029.903,-8343.155,10.000,0.000},
				{-22872.164,-8502.073,10.000,0.000},
				{-23730.318,-8660.990,10.000,0.000},
				{-24604.362,-8819.907,10.000,0.000},
				{-25494.299,-8978.824,10.000,0.000},
				{-26400.127,-9137.742,10.000,0.000},
				{-27321.847,-9296.659,10.000,0.000},
				{-28259.459,-9455.576,10.000,0.000},
				{-29212.962,-9614.493,10.000,0.000},
				{-30182.358,-9773.411,10.000,0.000},
				{-31167.645,-9932.328,10.000,0.000},
				{-32168.823,-10091.245,10.000,0.000},
				{-33185.894,-10250.162,10.000,0.000},
				{-34218.856,-10409.080,10.000,0.000},
				{-35267.709,-10567.997,10.000,0.000},
				{-36332.455,-10726.914,10.000,0.000},
				{-37413.092,-10885.831,10.000,0.000},
				{-38509.621,-11044.748,10.000,0.000},
				{-39622.042,-11203.666,10.000,0.000},
				{-40750.354,-11362.583,10.000,0.000},
				{-41894.559,-11521.500,10.000,0.000},
				{-43054.654,-11680.417,10.000,0.000},
				{-44230.642,-11839.335,10.000,0.000},
				{-45422.521,-11998.252,10.000,0.000},
				{-46630.292,-12157.169,10.000,0.000},
				{-47853.955,-12316.086,10.000,0.000},
				{-49093.510,-12475.004,10.000,0.000},
				{-50348.956,-12633.921,10.000,0.000},
				{-51620.294,-12792.838,10.000,0.000},
				{-52907.524,-12951.755,10.000,0.000},
				{-54210.645,-13110.673,10.000,0.000},
				{-55529.658,-13269.590,10.000,0.000},
				{-56864.563,-13428.507,10.000,0.000},
				{-58215.360,-13587.424,10.000,0.000},
				{-59582.048,-13746.342,10.000,0.000},
				{-60964.628,-13905.259,10.000,0.000},
				{-62363.100,-14064.176,10.000,0.000},
				{-63777.463,-14223.093,10.000,0.000},
				{-65207.718,-14382.011,10.000,0.000},
				{-66653.865,-14540.928,10.000,0.000},
				{-68115.904,-14699.845,10.000,0.000},
				{-69593.834,-14858.762,10.000,0.000},
				{-71087.656,-15017.680,10.000,0.000},
				{-72597.370,-15176.597,10.000,0.000},
				{-74122.976,-15335.514,10.000,0.000},
				{-75664.473,-15494.431,10.000,0.000},
				{-77221.862,-15653.349,10.000,0.000},
				{-78795.143,-15812.266,10.000,0.000},
				{-80384.315,-15971.183,10.000,0.000},
				{-81989.379,-16130.100,10.000,0.000},
				{-83610.335,-16289.018,10.000,0.000},
				{-85247.183,-16447.935,10.000,0.000},
				{-86899.922,-16606.852,10.000,0.000},
				{-88568.553,-16765.769,10.000,0.000},
				{-90253.076,-16924.687,10.000,0.000},
				{-91953.491,-17083.604,10.000,0.000},
				{-93669.797,-17242.521,10.000,0.000},
				{-95401.995,-17401.438,10.000,0.000},
				{-97150.085,-17560.356,10.000,0.000},
				{-98914.066,-17719.273,10.000,0.000},
				{-100693.939,-17878.190,10.000,0.000},
				{-102489.704,-18037.107,10.000,0.000},
				{-104301.361,-18196.025,10.000,0.000},
				{-106128.909,-18354.942,10.000,0.000},
				{-107972.349,-18513.859,10.000,0.000},
				{-109831.681,-18672.776,10.000,0.000},
				{-111706.904,-18831.693,10.000,0.000},
				{-113597.452,-18979.259,10.000,0.000},
				{-115502.188,-19115.474,10.000,0.000},
				{-117419.979,-19240.338,10.000,0.000},
				{-119349.688,-19353.850,10.000,0.000},
				{-121290.182,-19456.011,10.000,0.000},
				{-123240.323,-19546.821,10.000,0.000},
				{-125198.978,-19626.280,10.000,0.000},
				{-127165.012,-19694.387,10.000,0.000},
				{-129137.288,-19751.143,10.000,0.000},
				{-131114.673,-19796.548,10.000,0.000},
				{-133096.030,-19830.602,10.000,0.000},
				{-135080.225,-19853.304,10.000,0.000},
				{-137066.123,-19864.656,10.000,0.000},
				{-139052.589,-19864.656,10.000,0.000},
				{-141039.055,-19864.656,10.000,0.000},
				{-143025.520,-19864.656,10.000,0.000},
				{-145011.986,-19864.656,10.000,0.000},
				{-146998.451,-19864.656,10.000,0.000},
				{-148984.917,-19864.656,10.000,0.000},
				{-150971.382,-19864.656,10.000,0.000},
				{-152957.848,-19864.656,10.000,0.000},
				{-154944.313,-19864.656,10.000,0.000},
				{-156930.779,-19864.656,10.000,0.000},
				{-158917.245,-19864.656,10.000,0.000},
				{-160903.710,-19864.656,10.000,0.000},
				{-162889.608,-19853.304,10.000,0.000},
				{-164873.803,-19830.602,10.000,0.000},
				{-166855.161,-19796.548,10.000,0.000},
				{-168832.545,-19751.143,10.000,0.000},
				{-170804.822,-19694.387,10.000,0.000},
				{-172770.855,-19626.280,10.000,0.000},
				{-174729.510,-19546.821,10.000,0.000},
				{-176679.652,-19456.011,10.000,0.000},
				{-178620.145,-19353.850,10.000,0.000},
				{-180549.854,-19240.338,10.000,0.000},
				{-182467.645,-19115.474,10.000,0.000},
				{-184372.382,-18979.259,10.000,0.000},
				{-186262.929,-18831.693,10.000,0.000},
				{-188138.153,-18672.776,10.000,0.000},
				{-189997.485,-18513.859,10.000,0.000},
				{-191840.925,-18354.942,10.000,0.000},
				{-193668.473,-18196.025,10.000,0.000},
				{-195480.130,-18037.107,10.000,0.000},
				{-197275.894,-17878.190,10.000,0.000},
				{-199055.768,-17719.273,10.000,0.000},
				{-200819.749,-17560.356,10.000,0.000},
				{-202567.839,-17401.438,10.000,0.000},
				{-204300.037,-17242.521,10.000,0.000},
				{-206016.343,-17083.604,10.000,0.000},
				{-207716.757,-16924.687,10.000,0.000},
				{-209401.280,-16765.769,10.000,0.000},
				{-211069.911,-16606.852,10.000,0.000},
				{-212722.651,-16447.935,10.000,0.000},
				{-214359.498,-16289.018,10.000,0.000},
				{-215980.454,-16130.100,10.000,0.000},
				{-217585.518,-15971.183,10.000,0.000},
				{-219174.691,-15812.266,10.000,0.000},
				{-220747.971,-15653.349,10.000,0.000},
				{-222305.360,-15494.431,10.000,0.000},
				{-223846.858,-15335.514,10.000,0.000},
				{-225372.463,-15176.597,10.000,0.000},
				{-226882.177,-15017.680,10.000,0.000},
				{-228375.999,-14858.762,10.000,0.000},
				{-229853.930,-14699.845,10.000,0.000},
				{-231315.968,-14540.928,10.000,0.000},
				{-232762.115,-14382.011,10.000,0.000},
				{-234192.370,-14223.093,10.000,0.000},
				{-235606.734,-14064.176,10.000,0.000},
				{-237005.206,-13905.259,10.000,0.000},
				{-238387.786,-13746.342,10.000,0.000},
				{-239754.474,-13587.424,10.000,0.000},
				{-241105.270,-13428.507,10.000,0.000},
				{-242440.175,-13269.590,10.000,0.000},
				{-243759.188,-13110.673,10.000,0.000},
				{-245062.310,-12951.755,10.000,0.000},
				{-246349.540,-12792.838,10.000,0.000},
				{-247620.878,-12633.921,10.000,0.000},
				{-248876.324,-12475.004,10.000,0.000},
				{-250115.878,-12316.086,10.000,0.000},
				{-251339.541,-12157.169,10.000,0.000},
				{-252547.312,-11998.252,10.000,0.000},
				{-253739.191,-11839.335,10.000,0.000},
				{-254915.179,-11680.417,10.000,0.000},
				{-256075.275,-11521.500,10.000,0.000},
				{-257219.479,-11362.583,10.000,0.000},
				{-258347.792,-11203.666,10.000,0.000},
				{-259460.212,-11044.748,10.000,0.000},
				{-260556.741,-10885.831,10.000,0.000},
				{-261637.378,-10726.914,10.000,0.000},
				{-262702.124,-10567.997,10.000,0.000},
				{-263750.978,-10409.080,10.000,0.000},
				{-264783.940,-10250.162,10.000,0.000},
				{-265801.010,-10091.245,10.000,0.000},
				{-266802.189,-9932.328,10.000,0.000},
				{-267787.476,-9773.411,10.000,0.000},
				{-268756.871,-9614.493,10.000,0.000},
				{-269710.375,-9455.576,10.000,0.000},
				{-270647.986,-9296.659,10.000,0.000},
				{-271569.706,-9137.742,10.000,0.000},
				{-272475.535,-8978.824,10.000,0.000},
				{-273365.471,-8819.907,10.000,0.000},
				{-274239.516,-8660.990,10.000,0.000},
				{-275097.669,-8502.073,10.000,0.000},
				{-275939.931,-8343.155,10.000,0.000},
				{-276766.300,-8184.238,10.000,0.000},
				{-277576.778,-8025.321,10.000,0.000},
				{-278371.364,-7866.404,10.000,0.000},
				{-279150.059,-7707.486,10.000,0.000},
				{-279912.862,-7548.569,10.000,0.000},
				{-280659.773,-7389.652,10.000,0.000},
				{-281390.792,-7230.735,10.000,0.000},
				{-282105.920,-7071.817,10.000,0.000},
				{-282805.155,-6912.900,10.000,0.000},
				{-283488.500,-6753.983,10.000,0.000},
				{-284155.952,-6595.066,10.000,0.000},
				{-284807.513,-6436.148,10.000,0.000},
				{-285443.182,-6277.231,10.000,0.000},
				{-286062.959,-6118.314,10.000,0.000},
				{-286666.845,-5959.397,10.000,0.000},
				{-287254.838,-5800.479,10.000,0.000},
				{-287826.940,-5641.562,10.000,0.000},
				{-288383.151,-5482.645,10.000,0.000},
				{-288923.469,-5323.728,10.000,0.000},
				{-289447.896,-5164.810,10.000,0.000},
				{-289956.431,-5005.893,10.000,0.000},
				{-290449.075,-4846.976,10.000,0.000},
				{-290925.827,-4688.059,10.000,0.000},
				{-291386.687,-4529.141,10.000,0.000},
				{-291831.655,-4370.224,10.000,0.000},
				{-292260.732,-4211.307,10.000,0.000},
				{-292673.916,-4052.390,10.000,0.000},
				{-293071.209,-3893.472,10.000,0.000},
				{-293452.611,-3734.555,10.000,0.000},
				{-293818.121,-3575.638,10.000,0.000},
				{-294167.738,-3416.721,10.000,0.000},
				{-294501.465,-3257.804,10.000,0.000},
				{-294819.299,-3098.886,10.000,0.000},
				{-295121.242,-2939.969,10.000,0.000},
				{-295407.293,-2781.052,10.000,0.000},
				{-295677.452,-2622.135,10.000,0.000},
				{-295931.720,-2463.217,10.000,0.000},
				{-296170.096,-2304.300,10.000,0.000},
				{-296392.580,-2145.383,10.000,0.000},
				{-296599.172,-1986.466,10.000,0.000},
				{-296789.873,-1827.548,10.000,0.000},
				{-296964.682,-1668.631,10.000,0.000},
				{-297123.599,-1509.714,10.000,0.000},
				{-297266.625,-1350.797,10.000,0.000},
				{-297393.759,-1191.879,10.000,0.000},
				{-297505.001,-1032.962,10.000,0.000},
				{-297600.918,-885.396,10.000,0.000},
				{-297682.647,-749.181,10.000,0.000},
				{-297751.322,-624.318,10.000,0.000},
				{-297808.078,-510.805,10.000,0.000},
				{-297854.051,-408.644,10.000,0.000},
				{-297890.375,-317.834,10.000,0.000},
				{-297918.185,-238.376,10.000,0.000},
				{-297938.618,-170.268,10.000,0.000},
				{-297952.807,-113.512,10.000,0.000},
				{-297961.888,-68.107,10.000,0.000},
				{-297966.996,-34.054,10.000,0.000},
				{-297969.266,-11.351,10.000,0.000},
				{-297969.834,-0.000,10.000,0.000},
				{-297969.834,-0.000,10.000,0.000}		};

}