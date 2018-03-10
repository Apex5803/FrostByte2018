package org.usfirst.frc.team5803.robot.utils;
import edu.wpi.first.wpilibj.MotorSafety;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.IMotorController;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.LimitSwitchSource;
import com.ctre.phoenix.motorcontrol.RemoteSensorSource;
import com.ctre.phoenix.motorcontrol.SensorTerm;
import com.ctre.phoenix.motorcontrol.VelocityMeasPeriod;
//import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Creates TalonSRX objects and configures all the parameters we care about to factory defaults. Closed-loop and sensor
 * parameters are not set, as these are expected to be set by the application.
 */
public class TalonSRXFactory {
	public static int timeout = 0;
    public static class Configuration {
        public boolean LIMIT_SWITCH_NORMALLY_OPEN = true;
        public double MAX_OUTPUT_VOLTAGE = 12;
        public double NOMINAL_VOLTAGE = 0;
        public double PEAK_VOLTAGE = 12;
        public boolean ENABLE_BRAKE = false;
        public boolean ENABLE_CURRENT_LIMIT = false;
        public boolean ENABLE_SOFT_LIMIT = false;
        public boolean ENABLE_LIMIT_SWITCH = false;
        public int CURRENT_LIMIT = 0;
        public double EXPIRATION_TIMEOUT_SECONDS = MotorSafety.DEFAULT_SAFETY_EXPIRATION;
        public double FORWARD_SOFT_LIMIT = 0;
        public boolean INVERTED = false;
        public double NOMINAL_CLOSED_LOOP_VOLTAGE = 12;
        public double REVERSE_SOFT_LIMIT = 0;
        public boolean SAFETY_ENABLED = false;

        public int CONTROL_FRAME_PERIOD_MS = 5;
        public int MOTION_CONTROL_FRAME_PERIOD_MS = 100;
        public int GENERAL_STATUS_FRAME_RATE_MS = 5;
        public int FEEDBACK_STATUS_FRAME_RATE_MS = 100;
        public int QUAD_ENCODER_STATUS_FRAME_RATE_MS = 100;
        public int ANALOG_TEMP_VBAT_STATUS_FRAME_RATE_MS = 100;
        public int PULSE_WIDTH_STATUS_FRAME_RATE_MS = 100;

        //public TalonSRX.VelocityMeasPeriod VELOCITY_MEASUREMENT_PERIOD = TalonSRX.VelocityMeasPeriod.Period_100Ms;
        public int VELOCITY_MEASUREMENT_ROLLING_AVERAGE_WINDOW = 64;

        public double VOLTAGE_COMPENSATION_RAMP_RATE = 0;
        public double VOLTAGE_RAMP_RATE = 0;
    }

    private static final Configuration kDefaultConfiguration = new Configuration();
    private static final Configuration kSlaveConfiguration = new Configuration();

    static {
        kSlaveConfiguration.CONTROL_FRAME_PERIOD_MS = 1000;
        kSlaveConfiguration.MOTION_CONTROL_FRAME_PERIOD_MS = 1000;
        kSlaveConfiguration.GENERAL_STATUS_FRAME_RATE_MS = 1000;
        kSlaveConfiguration.FEEDBACK_STATUS_FRAME_RATE_MS = 1000;
        kSlaveConfiguration.QUAD_ENCODER_STATUS_FRAME_RATE_MS = 1000;
        kSlaveConfiguration.ANALOG_TEMP_VBAT_STATUS_FRAME_RATE_MS = 1000;
        kSlaveConfiguration.PULSE_WIDTH_STATUS_FRAME_RATE_MS = 1000;
    }

    // Create a CANTalon with the default (out of the box) configuration.
    public static TalonSRX createDefaultTalon(int id) {
        return createTalon(id, kDefaultConfiguration);
    }

    public static TalonSRX createPermanentSlaveTalon(int id, int master_id) {
        final TalonSRX talon = createTalon(id, kSlaveConfiguration);
//        IMotorController master_id1 = null;
       
//        talon.follow(master_id1);
        return talon;
    }

    public static TalonSRX createTalon(int id, Configuration config) {
    	TalonSRX talon = new TalonSRX(id);
        talon.set(ControlMode.Current, 0);
        talon.changeMotionControlFramePeriod(config.MOTION_CONTROL_FRAME_PERIOD_MS);
        talon.configOpenloopRamp(0, timeout);
        talon.configClosedloopRamp(0, timeout);
        talon.configPeakOutputForward(1, timeout);
        talon.configPeakOutputReverse(-1, timeout);
        talon.configNominalOutputForward(0, timeout);
        talon.configNominalOutputReverse(0, timeout);
        talon.configNeutralDeadband(0.04, timeout);
        talon.configVoltageCompSaturation(0, timeout);
        talon.configVoltageMeasurementFilter(32, timeout);
        talon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, timeout);
        talon.configSelectedFeedbackCoefficient(1.0, 0, timeout);
        talon.configRemoteFeedbackFilter(id, RemoteSensorSource.Off, 0, timeout);
        talon.configSensorTerm(SensorTerm.Sum0, FeedbackDevice.QuadEncoder, timeout);
        talon.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_100Ms, timeout);
        talon.configVelocityMeasurementWindow(64, timeout);
        talon.configForwardLimitSwitchSource(LimitSwitchSource.Deactivated, LimitSwitchNormal.NormallyOpen, timeout);
        talon.configReverseLimitSwitchSource(LimitSwitchSource.Deactivated, LimitSwitchNormal.NormallyOpen, timeout);
        talon.configForwardSoftLimitThreshold(0, timeout);
        talon.configReverseSoftLimitThreshold(0, timeout);
        talon.configForwardSoftLimitEnable(false, timeout);
        talon.configReverseSoftLimitEnable(false, timeout);
        talon.config_kP(0, 0.0, timeout);
        talon.config_kI(0, 0.0, timeout);
        talon.config_kD(0, 0.0, timeout);
        talon.config_kF(0, 0.0, timeout);
        talon.config_IntegralZone(0, 0, timeout);
        talon.configAllowableClosedloopError(0, 0, timeout);
        talon.configMaxIntegralAccumulator(0, 0.0, timeout);
        talon.configClosedLoopPeakOutput(0, 1.0, timeout);
        talon.configClosedLoopPeriod(0, 1, timeout);
        talon.configAuxPIDPolarity(false, timeout);
        talon.configMotionCruiseVelocity(0, timeout);
        talon.configMotionAcceleration(0, timeout);
        talon.configMotionProfileTrajectoryPeriod(0, timeout);
        talon.configSetCustomParam(0, 0, timeout);
        talon.configPeakCurrentLimit(0, timeout);
        talon.configPeakCurrentDuration(10, timeout);
        talon.configContinuousCurrentLimit(0, timeout);
        
        
//        talon.ClearIaccum();
//        talon.clearMotionProfileHasUnderrun();
//        talon.clearMotionProfileTrajectories();
//        talon.clearStickyFaults();
//        talon.ConfigFwdLimitSwitchNormallyOpen(config.LIMIT_SWITCH_NORMALLY_OPEN);
//        talon.configMaxOutputVoltage(config.MAX_OUTPUT_VOLTAGE);
//        talon.configNominalOutputVoltage(config.NOMINAL_VOLTAGE, -config.NOMINAL_VOLTAGE);
//        talon.configPeakOutputVoltage(config.PEAK_VOLTAGE, -config.PEAK_VOLTAGE);
//        talon.ConfigRevLimitSwitchNormallyOpen(config.LIMIT_SWITCH_NORMALLY_OPEN);
//        talon.enableBrakeMode(config.ENABLE_BRAKE);
//        talon.EnableCurrentLimit(config.ENABLE_CURRENT_LIMIT);
//        talon.enableForwardSoftLimit(config.ENABLE_SOFT_LIMIT);
//        talon.enableLimitSwitch(config.ENABLE_LIMIT_SWITCH, config.ENABLE_LIMIT_SWITCH);
//        talon.enableReverseSoftLimit(config.ENABLE_SOFT_LIMIT);
//        talon.enableZeroSensorPositionOnForwardLimit(false);
//        talon.enableZeroSensorPositionOnIndex(false, false);
//        talon.enableZeroSensorPositionOnReverseLimit(false);
//        talon.reverseOutput(false);
//        talon.reverseSensor(false);
//        talon.setAnalogPosition(0);
//        talon.setCurrentLimit(config.CURRENT_LIMIT);
//        talon.setExpiration(config.EXPIRATION_TIMEOUT_SECONDS);
//        talon.setForwardSoftLimit(config.FORWARD_SOFT_LIMIT);
//        talon.setInverted(config.INVERTED);
//        talon.setNominalClosedLoopVoltage(config.NOMINAL_CLOSED_LOOP_VOLTAGE);
//        talon.setPosition(0);
//        talon.setProfile(0);
//        talon.setPulseWidthPosition(0);
//        talon.setReverseSoftLimit(config.REVERSE_SOFT_LIMIT);
//        talon.setSafetyEnabled(config.SAFETY_ENABLED);
//        talon.SetVelocityMeasurementPeriod(config.VELOCITY_MEASUREMENT_PERIOD);
//        talon.SetVelocityMeasurementWindow(config.VELOCITY_MEASUREMENT_ROLLING_AVERAGE_WINDOW);
//        talon.setVoltageCompensationRampRate(config.VOLTAGE_COMPENSATION_RAMP_RATE);
//        talon.setVoltageRampRate(config.VOLTAGE_RAMP_RATE);
//
//        talon.setStatusFrameRateMs(TalonSRX.StatusFrameRate.General, config.GENERAL_STATUS_FRAME_RATE_MS);
//        talon.setStatusFrameRateMs(TalonSRX.StatusFrameRate.Feedback, config.FEEDBACK_STATUS_FRAME_RATE_MS);
//        talon.setStatusFrameRateMs(TalonSRX.StatusFrameRate.QuadEncoder, config.QUAD_ENCODER_STATUS_FRAME_RATE_MS);
//        talon.setStatusFrameRateMs(TalonSRX.StatusFrameRate.AnalogTempVbat,
//                config.ANALOG_TEMP_VBAT_STATUS_FRAME_RATE_MS);
//        talon.setStatusFrameRateMs(TalonSRX.StatusFrameRate.PulseWidth, config.PULSE_WIDTH_STATUS_FRAME_RATE_MS);
//		return talon;

        return talon;
    }

    /**
     * Run this on a fresh talon to produce good values for the defaults.
     */
   /* public static String getFullTalonInfo(TalonSRX talon) {
        StringBuilder sb = new StringBuilder().append("isRevLimitSwitchClosed = ")
                .append(talon.isRevLimitSwitchClosed()).append("\n").append("getBusVoltage = ")
                .append(talon.getBusVoltage()).append("\n").append("isForwardSoftLimitEnabled = ")
                .append(talon.isForwardSoftLimitEnabled()).append("\n").append("getFaultRevSoftLim = ")
                .append(talon.getFaultRevSoftLim()).append("\n").append("getStickyFaultOverTemp = ")
                .append(talon.getStickyFaultOverTemp()).append("\n").append("isZeroSensorPosOnFwdLimitEnabled = ")
                .append(talon.isZeroSensorPosOnFwdLimitEnabled()).append("\n")
                .append("getMotionProfileTopLevelBufferCount = ").append(talon.getMotionProfileTopLevelBufferCount())
                .append("\n").append("getNumberOfQuadIdxRises = ").append(talon.getNumberOfQuadIdxRises()).append("\n")
                .append("getInverted = ").append(talon.getInverted()).append("\n")
                .append("getPulseWidthRiseToRiseUs = ").append(talon.getPulseWidthRiseToRiseUs()).append("\n")
                .append("getError = ").append(talon.getError()).append("\n").append("isSensorPresent = ")
                .append(talon.isSensorPresent(TalonSRX.FeedbackDevice.CtreMagEncoder_Relative)).append("\n")
                .append("isControlEnabled = ").append(talon.isControlEnabled()).append("\n").append("getTable = ")
                .append(talon.getTable()).append("\n").append("isEnabled = ").append(talon.isEnabled()).append("\n")
                .append("isZeroSensorPosOnRevLimitEnabled = ").append(talon.isZeroSensorPosOnRevLimitEnabled())
                .append("\n").append("isSafetyEnabled = ").append(talon.isSafetyEnabled()).append("\n")
                .append("getOutputVoltage = ").append(talon.getOutputVoltage()).append("\n").append("getTemperature = ")
                .append(talon.getTemperature()).append("\n").append("getSmartDashboardType = ")
                .append(talon.getSmartDashboardType()).append("\n").append("getPulseWidthPosition = ")
                .append(talon.getPulseWidthPosition()).append("\n").append("getOutputCurrent = ")
                .append(talon.getOutputCurrent()).append("\n").append("get = ").append(talon.get()).append("\n")
                .append("isZeroSensorPosOnIndexEnabled = ").append(talon.isZeroSensorPosOnIndexEnabled()).append("\n")
                .append("getMotionMagicCruiseVelocity = ").append(talon.getMotionMagicCruiseVelocity()).append("\n")
                .append("getStickyFaultRevSoftLim = ").append(talon.getStickyFaultRevSoftLim()).append("\n")
                .append("getFaultRevLim = ").append(talon.getFaultRevLim()).append("\n").append("getEncPosition = ")
                .append(talon.getEncPosition()).append("\n").append("getIZone = ").append(talon.getIZone()).append("\n")
                .append("getAnalogInPosition = ").append(talon.getAnalogInPosition()).append("\n")
                .append("getFaultUnderVoltage = ").append(talon.getFaultUnderVoltage()).append("\n")
                .append("getCloseLoopRampRate = ").append(talon.getCloseLoopRampRate()).append("\n")
                .append("toString = ").append(talon.toString()).append("\n")
                // .append("getMotionMagicActTrajPosition =
                // ").append(talon.getMotionMagicActTrajPosition()).append("\n")
                .append("getF = ").append(talon.getF()).append("\n").append("getClass = ").append(talon.getClass())
                .append("\n").append("getAnalogInVelocity = ").append(talon.getAnalogInVelocity()).append("\n")
                .append("getI = ").append(talon.getI()).append("\n").append("isReverseSoftLimitEnabled = ")
                .append(talon.isReverseSoftLimitEnabled()).append("\n").append("getPIDSourceType = ")
                .append(talon.getPIDSourceType()).append("\n").append("getEncVelocity = ")
                .append(talon.getEncVelocity()).append("\n").append("GetVelocityMeasurementPeriod = ")
                .append(talon.GetVelocityMeasurementPeriod()).append("\n").append("getP = ").append(talon.getP())
                .append("\n").append("GetVelocityMeasurementWindow = ").append(talon.GetVelocityMeasurementWindow())
                .append("\n").append("getDeviceID = ").append(talon.getDeviceID()).append("\n")
                .append("getStickyFaultRevLim = ").append(talon.getStickyFaultRevLim()).append("\n")
                // .append("getMotionMagicActTrajVelocity =
                // ").append(talon.getMotionMagicActTrajVelocity()).append("\n")
                .append("getReverseSoftLimit = ").append(talon.getReverseSoftLimit()).append("\n").append("getD = ")
                .append(talon.getD()).append("\n").append("getFaultOverTemp = ").append(talon.getFaultOverTemp())
                .append("\n").append("getForwardSoftLimit = ").append(talon.getForwardSoftLimit()).append("\n")
                .append("GetFirmwareVersion = ").append(talon.GetFirmwareVersion()).append("\n")
                .append("getLastError = ").append(talon.getLastError()).append("\n").append("isAlive = ")
                .append(talon.isAlive()).append("\n").append("getPinStateQuadIdx = ").append(talon.getPinStateQuadIdx())
                .append("\n").append("getAnalogInRaw = ").append(talon.getAnalogInRaw()).append("\n")
                .append("getFaultForLim = ").append(talon.getFaultForLim()).append("\n").append("getSpeed = ")
                .append(talon.getSpeed()).append("\n").append("getStickyFaultForLim = ")
                .append(talon.getStickyFaultForLim()).append("\n").append("getFaultForSoftLim = ")
                .append(talon.getFaultForSoftLim()).append("\n").append("getStickyFaultForSoftLim = ")
                .append(talon.getStickyFaultForSoftLim()).append("\n").append("getClosedLoopError = ")
                .append(talon.getClosedLoopError()).append("\n").append("getSetpoint = ").append(talon.getSetpoint())
                .append("\n").append("isMotionProfileTopLevelBufferFull = ")
                .append(talon.isMotionProfileTopLevelBufferFull()).append("\n").append("getDescription = ")
                .append(talon.getDescription()).append("\n").append("hashCode = ").append(talon.hashCode()).append("\n")
                .append("isFwdLimitSwitchClosed = ").append(talon.isFwdLimitSwitchClosed()).append("\n")
                .append("getPinStateQuadA = ").append(talon.getPinStateQuadA()).append("\n")
                .append("getPinStateQuadB = ").append(talon.getPinStateQuadB()).append("\n").append("GetIaccum = ")
                .append(talon.GetIaccum()).append("\n").append("getFaultHardwareFailure = ")
                .append(talon.getFaultHardwareFailure()).append("\n").append("pidGet = ").append(talon.pidGet())
                .append("\n").append("getBrakeEnableDuringNeutral = ").append(talon.getBrakeEnableDuringNeutral())
                .append("\n").append("getStickyFaultUnderVoltage = ").append(talon.getStickyFaultUnderVoltage())
                .append("\n").append("getPulseWidthVelocity = ").append(talon.getPulseWidthVelocity()).append("\n")
                .append("GetNominalClosedLoopVoltage = ").append(talon.GetNominalClosedLoopVoltage()).append("\n")
                .append("getPosition = ").append(talon.getPosition()).append("\n").append("getExpiration = ")
                .append(talon.getExpiration()).append("\n").append("getPulseWidthRiseToFallUs = ")
                .append(talon.getPulseWidthRiseToFallUs()).append("\n")
                // .append("createTableListener = ").append(talon.createTableListener()).append("\n")
                .append("getControlMode = ").append(talon.getControlMode()).append("\n")
                .append("getMotionMagicAcceleration = ").append(talon.getMotionMagicAcceleration()).append("\n")
                .append("getControlMode = ").append(talon.getControlMode());

        return sb.toString();
    }*/
}