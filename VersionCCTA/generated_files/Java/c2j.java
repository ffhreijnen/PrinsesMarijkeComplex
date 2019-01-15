package myPackage;

import static myPackage.c2j.c2jUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** c2j code generated from a CIF specification. */
@SuppressWarnings("unused")
public abstract class c2j {
    /** Should execution timing information be provided? */
    public boolean doInfoExec = true;

    /** Should executed event information be provided? */
    public boolean doInfoEvent = false;

    /** Should print output be provided? */
    public boolean doInfoPrintOutput = true;

    /** Whether this is the first time the code is (to be) executed. */
    protected boolean firstExec;

    /** The names of all the events, except for event 'tau'. */
    private final String[] EVENT_NAMES = {
        "M.Barrier_Barrier_Actuator_c_open",
        "M.Barrier_Barrier_Actuator_c_close",
        "M.Barrier_Barrier_Actuator_c_emergencyStop",
        "M.Barrier_Barrier_Actuator_c_endStopClosing",
        "M.Barrier_Barrier_Actuator_c_endStopOpening",
        "M.Barrier_Barrier_Sensor_u_open_on",
        "M.Barrier_Barrier_Sensor_u_open_off",
        "M.Barrier_Barrier_Sensor_u_closed_on",
        "M.Barrier_Barrier_Sensor_u_closed_off",
        "M.Barrier_Downstream_TLs_East_Actuator_c_r",
        "M.Barrier_Downstream_TLs_East_Actuator_c_g",
        "M.Barrier_Downstream_TLs_East_SensorG_u_on",
        "M.Barrier_Downstream_TLs_East_SensorG_u_off",
        "M.Barrier_Downstream_TLs_East_SensorR_u_on",
        "M.Barrier_Downstream_TLs_East_SensorR_u_off",
        "M.Barrier_Downstream_TLs_West_Actuator_c_r",
        "M.Barrier_Downstream_TLs_West_Actuator_c_g",
        "M.Barrier_Downstream_TLs_West_SensorG_u_on",
        "M.Barrier_Downstream_TLs_West_SensorG_u_off",
        "M.Barrier_Downstream_TLs_West_SensorR_u_on",
        "M.Barrier_Downstream_TLs_West_SensorR_u_off",
        "M.Barrier_Upstream_TLs_East_Actuator_c_r",
        "M.Barrier_Upstream_TLs_East_Actuator_c_g",
        "M.Barrier_Upstream_TLs_East_SensorG_u_on",
        "M.Barrier_Upstream_TLs_East_SensorG_u_off",
        "M.Barrier_Upstream_TLs_East_SensorR_u_on",
        "M.Barrier_Upstream_TLs_East_SensorR_u_off",
        "M.Barrier_Upstream_TLs_West_Actuator_c_r",
        "M.Barrier_Upstream_TLs_West_Actuator_c_g",
        "M.Barrier_Upstream_TLs_West_SensorG_u_on",
        "M.Barrier_Upstream_TLs_West_SensorG_u_off",
        "M.Barrier_Upstream_TLs_West_SensorR_u_on",
        "M.Barrier_Upstream_TLs_West_SensorR_u_off",
        "M.North_Downstream_EnteringTLs_East_Actuator_c_r",
        "M.North_Downstream_EnteringTLs_East_Actuator_c_rr",
        "M.North_Downstream_EnteringTLs_East_Actuator_c_rg",
        "M.North_Downstream_EnteringTLs_East_Actuator_c_g",
        "M.North_Downstream_EnteringTLs_East_SensorG_u_on",
        "M.North_Downstream_EnteringTLs_East_SensorG_u_off",
        "M.North_Downstream_EnteringTLs_East_SensorR1_u_on",
        "M.North_Downstream_EnteringTLs_East_SensorR1_u_off",
        "M.North_Downstream_EnteringTLs_East_SensorR2_u_on",
        "M.North_Downstream_EnteringTLs_East_SensorR2_u_off",
        "M.North_Downstream_EnteringTLs_West_Actuator_c_r",
        "M.North_Downstream_EnteringTLs_West_Actuator_c_rr",
        "M.North_Downstream_EnteringTLs_West_Actuator_c_rg",
        "M.North_Downstream_EnteringTLs_West_Actuator_c_g",
        "M.North_Downstream_EnteringTLs_West_SensorG_u_on",
        "M.North_Downstream_EnteringTLs_West_SensorG_u_off",
        "M.North_Downstream_EnteringTLs_West_SensorR1_u_on",
        "M.North_Downstream_EnteringTLs_West_SensorR1_u_off",
        "M.North_Downstream_EnteringTLs_West_SensorR2_u_on",
        "M.North_Downstream_EnteringTLs_West_SensorR2_u_off",
        "M.North_Downstream_EqualWaterSensor_u_on",
        "M.North_Downstream_EqualWaterSensor_u_off",
        "M.North_Downstream_Gates_East_Actuator_c_open",
        "M.North_Downstream_Gates_East_Actuator_c_close",
        "M.North_Downstream_Gates_East_Actuator_c_emergencyStop",
        "M.North_Downstream_Gates_East_Actuator_c_endStopClosing",
        "M.North_Downstream_Gates_East_Actuator_c_endStopOpening",
        "M.North_Downstream_Gates_East_Sensor_u_open_on",
        "M.North_Downstream_Gates_East_Sensor_u_open_off",
        "M.North_Downstream_Gates_East_Sensor_u_closed_on",
        "M.North_Downstream_Gates_East_Sensor_u_closed_off",
        "M.North_Downstream_Gates_West_Actuator_c_open",
        "M.North_Downstream_Gates_West_Actuator_c_close",
        "M.North_Downstream_Gates_West_Actuator_c_emergencyStop",
        "M.North_Downstream_Gates_West_Actuator_c_endStopClosing",
        "M.North_Downstream_Gates_West_Actuator_c_endStopOpening",
        "M.North_Downstream_Gates_West_Sensor_u_open_on",
        "M.North_Downstream_Gates_West_Sensor_u_open_off",
        "M.North_Downstream_Gates_West_Sensor_u_closed_on",
        "M.North_Downstream_Gates_West_Sensor_u_closed_off",
        "M.North_Downstream_LeavingTLs_East_Actuator_c_r",
        "M.North_Downstream_LeavingTLs_East_Actuator_c_g",
        "M.North_Downstream_LeavingTLs_East_SensorG_u_on",
        "M.North_Downstream_LeavingTLs_East_SensorG_u_off",
        "M.North_Downstream_LeavingTLs_East_SensorR_u_on",
        "M.North_Downstream_LeavingTLs_East_SensorR_u_off",
        "M.North_Downstream_LeavingTLs_West_Actuator_c_r",
        "M.North_Downstream_LeavingTLs_West_Actuator_c_g",
        "M.North_Downstream_LeavingTLs_West_SensorG_u_on",
        "M.North_Downstream_LeavingTLs_West_SensorG_u_off",
        "M.North_Downstream_LeavingTLs_West_SensorR_u_on",
        "M.North_Downstream_LeavingTLs_West_SensorR_u_off",
        "M.North_Downstream_Paddles_East_Actuator_c_open",
        "M.North_Downstream_Paddles_East_Actuator_c_close",
        "M.North_Downstream_Paddles_East_Actuator_c_emergencyStop",
        "M.North_Downstream_Paddles_East_Actuator_c_endStopClosing",
        "M.North_Downstream_Paddles_East_Actuator_c_endStopOpening",
        "M.North_Downstream_Paddles_East_Sensor_u_open_on",
        "M.North_Downstream_Paddles_East_Sensor_u_open_off",
        "M.North_Downstream_Paddles_East_Sensor_u_closed_on",
        "M.North_Downstream_Paddles_East_Sensor_u_closed_off",
        "M.North_Downstream_Paddles_West_Actuator_c_open",
        "M.North_Downstream_Paddles_West_Actuator_c_close",
        "M.North_Downstream_Paddles_West_Actuator_c_emergencyStop",
        "M.North_Downstream_Paddles_West_Actuator_c_endStopClosing",
        "M.North_Downstream_Paddles_West_Actuator_c_endStopOpening",
        "M.North_Downstream_Paddles_West_Sensor_u_open_on",
        "M.North_Downstream_Paddles_West_Sensor_u_open_off",
        "M.North_Downstream_Paddles_West_Sensor_u_closed_on",
        "M.North_Downstream_Paddles_West_Sensor_u_closed_off",
        "M.North_Upstream_EnteringTLs_East_Actuator_c_r",
        "M.North_Upstream_EnteringTLs_East_Actuator_c_rr",
        "M.North_Upstream_EnteringTLs_East_Actuator_c_rg",
        "M.North_Upstream_EnteringTLs_East_Actuator_c_g",
        "M.North_Upstream_EnteringTLs_East_SensorG_u_on",
        "M.North_Upstream_EnteringTLs_East_SensorG_u_off",
        "M.North_Upstream_EnteringTLs_East_SensorR1_u_on",
        "M.North_Upstream_EnteringTLs_East_SensorR1_u_off",
        "M.North_Upstream_EnteringTLs_East_SensorR2_u_on",
        "M.North_Upstream_EnteringTLs_East_SensorR2_u_off",
        "M.North_Upstream_EnteringTLs_West_Actuator_c_r",
        "M.North_Upstream_EnteringTLs_West_Actuator_c_rr",
        "M.North_Upstream_EnteringTLs_West_Actuator_c_rg",
        "M.North_Upstream_EnteringTLs_West_Actuator_c_g",
        "M.North_Upstream_EnteringTLs_West_SensorG_u_on",
        "M.North_Upstream_EnteringTLs_West_SensorG_u_off",
        "M.North_Upstream_EnteringTLs_West_SensorR1_u_on",
        "M.North_Upstream_EnteringTLs_West_SensorR1_u_off",
        "M.North_Upstream_EnteringTLs_West_SensorR2_u_on",
        "M.North_Upstream_EnteringTLs_West_SensorR2_u_off",
        "M.North_Upstream_EqualWaterSensor_u_on",
        "M.North_Upstream_EqualWaterSensor_u_off",
        "M.North_Upstream_Gates_East_Actuator_c_open",
        "M.North_Upstream_Gates_East_Actuator_c_close",
        "M.North_Upstream_Gates_East_Actuator_c_emergencyStop",
        "M.North_Upstream_Gates_East_Actuator_c_endStopClosing",
        "M.North_Upstream_Gates_East_Actuator_c_endStopOpening",
        "M.North_Upstream_Gates_East_Sensor_u_open_on",
        "M.North_Upstream_Gates_East_Sensor_u_open_off",
        "M.North_Upstream_Gates_East_Sensor_u_closed_on",
        "M.North_Upstream_Gates_East_Sensor_u_closed_off",
        "M.North_Upstream_Gates_West_Actuator_c_open",
        "M.North_Upstream_Gates_West_Actuator_c_close",
        "M.North_Upstream_Gates_West_Actuator_c_emergencyStop",
        "M.North_Upstream_Gates_West_Actuator_c_endStopClosing",
        "M.North_Upstream_Gates_West_Actuator_c_endStopOpening",
        "M.North_Upstream_Gates_West_Sensor_u_open_on",
        "M.North_Upstream_Gates_West_Sensor_u_open_off",
        "M.North_Upstream_Gates_West_Sensor_u_closed_on",
        "M.North_Upstream_Gates_West_Sensor_u_closed_off",
        "M.North_Upstream_LeavingTLs_East_Actuator_c_r",
        "M.North_Upstream_LeavingTLs_East_Actuator_c_g",
        "M.North_Upstream_LeavingTLs_East_SensorG_u_on",
        "M.North_Upstream_LeavingTLs_East_SensorG_u_off",
        "M.North_Upstream_LeavingTLs_East_SensorR_u_on",
        "M.North_Upstream_LeavingTLs_East_SensorR_u_off",
        "M.North_Upstream_LeavingTLs_West_Actuator_c_r",
        "M.North_Upstream_LeavingTLs_West_Actuator_c_g",
        "M.North_Upstream_LeavingTLs_West_SensorG_u_on",
        "M.North_Upstream_LeavingTLs_West_SensorG_u_off",
        "M.North_Upstream_LeavingTLs_West_SensorR_u_on",
        "M.North_Upstream_LeavingTLs_West_SensorR_u_off",
        "M.North_Upstream_Paddles_East_Actuator_c_open",
        "M.North_Upstream_Paddles_East_Actuator_c_close",
        "M.North_Upstream_Paddles_East_Actuator_c_emergencyStop",
        "M.North_Upstream_Paddles_East_Actuator_c_endStopClosing",
        "M.North_Upstream_Paddles_East_Actuator_c_endStopOpening",
        "M.North_Upstream_Paddles_East_Sensor_u_open_on",
        "M.North_Upstream_Paddles_East_Sensor_u_open_off",
        "M.North_Upstream_Paddles_East_Sensor_u_closed_on",
        "M.North_Upstream_Paddles_East_Sensor_u_closed_off",
        "M.North_Upstream_Paddles_West_Actuator_c_open",
        "M.North_Upstream_Paddles_West_Actuator_c_close",
        "M.North_Upstream_Paddles_West_Actuator_c_emergencyStop",
        "M.North_Upstream_Paddles_West_Actuator_c_endStopClosing",
        "M.North_Upstream_Paddles_West_Actuator_c_endStopOpening",
        "M.North_Upstream_Paddles_West_Sensor_u_open_on",
        "M.North_Upstream_Paddles_West_Sensor_u_open_off",
        "M.North_Upstream_Paddles_West_Sensor_u_closed_on",
        "M.North_Upstream_Paddles_West_Sensor_u_closed_off",
        "M.South_Downstream_EnteringTLs_East_Actuator_c_r",
        "M.South_Downstream_EnteringTLs_East_Actuator_c_rr",
        "M.South_Downstream_EnteringTLs_East_Actuator_c_rg",
        "M.South_Downstream_EnteringTLs_East_Actuator_c_g",
        "M.South_Downstream_EnteringTLs_East_SensorG_u_on",
        "M.South_Downstream_EnteringTLs_East_SensorG_u_off",
        "M.South_Downstream_EnteringTLs_East_SensorR1_u_on",
        "M.South_Downstream_EnteringTLs_East_SensorR1_u_off",
        "M.South_Downstream_EnteringTLs_East_SensorR2_u_on",
        "M.South_Downstream_EnteringTLs_East_SensorR2_u_off",
        "M.South_Downstream_EnteringTLs_West_Actuator_c_r",
        "M.South_Downstream_EnteringTLs_West_Actuator_c_rr",
        "M.South_Downstream_EnteringTLs_West_Actuator_c_rg",
        "M.South_Downstream_EnteringTLs_West_Actuator_c_g",
        "M.South_Downstream_EnteringTLs_West_SensorG_u_on",
        "M.South_Downstream_EnteringTLs_West_SensorG_u_off",
        "M.South_Downstream_EnteringTLs_West_SensorR1_u_on",
        "M.South_Downstream_EnteringTLs_West_SensorR1_u_off",
        "M.South_Downstream_EnteringTLs_West_SensorR2_u_on",
        "M.South_Downstream_EnteringTLs_West_SensorR2_u_off",
        "M.South_Downstream_EqualWaterSensor_u_on",
        "M.South_Downstream_EqualWaterSensor_u_off",
        "M.South_Downstream_Gates_East_Actuator_c_open",
        "M.South_Downstream_Gates_East_Actuator_c_close",
        "M.South_Downstream_Gates_East_Actuator_c_emergencyStop",
        "M.South_Downstream_Gates_East_Actuator_c_endStopClosing",
        "M.South_Downstream_Gates_East_Actuator_c_endStopOpening",
        "M.South_Downstream_Gates_East_Sensor_u_open_on",
        "M.South_Downstream_Gates_East_Sensor_u_open_off",
        "M.South_Downstream_Gates_East_Sensor_u_closed_on",
        "M.South_Downstream_Gates_East_Sensor_u_closed_off",
        "M.South_Downstream_Gates_West_Actuator_c_open",
        "M.South_Downstream_Gates_West_Actuator_c_close",
        "M.South_Downstream_Gates_West_Actuator_c_emergencyStop",
        "M.South_Downstream_Gates_West_Actuator_c_endStopClosing",
        "M.South_Downstream_Gates_West_Actuator_c_endStopOpening",
        "M.South_Downstream_Gates_West_Sensor_u_open_on",
        "M.South_Downstream_Gates_West_Sensor_u_open_off",
        "M.South_Downstream_Gates_West_Sensor_u_closed_on",
        "M.South_Downstream_Gates_West_Sensor_u_closed_off",
        "M.South_Downstream_LeavingTLs_East_Actuator_c_r",
        "M.South_Downstream_LeavingTLs_East_Actuator_c_g",
        "M.South_Downstream_LeavingTLs_East_SensorG_u_on",
        "M.South_Downstream_LeavingTLs_East_SensorG_u_off",
        "M.South_Downstream_LeavingTLs_East_SensorR_u_on",
        "M.South_Downstream_LeavingTLs_East_SensorR_u_off",
        "M.South_Downstream_LeavingTLs_West_Actuator_c_r",
        "M.South_Downstream_LeavingTLs_West_Actuator_c_g",
        "M.South_Downstream_LeavingTLs_West_SensorG_u_on",
        "M.South_Downstream_LeavingTLs_West_SensorG_u_off",
        "M.South_Downstream_LeavingTLs_West_SensorR_u_on",
        "M.South_Downstream_LeavingTLs_West_SensorR_u_off",
        "M.South_Downstream_Paddles_East_Actuator_c_open",
        "M.South_Downstream_Paddles_East_Actuator_c_close",
        "M.South_Downstream_Paddles_East_Actuator_c_emergencyStop",
        "M.South_Downstream_Paddles_East_Actuator_c_endStopClosing",
        "M.South_Downstream_Paddles_East_Actuator_c_endStopOpening",
        "M.South_Downstream_Paddles_East_Sensor_u_open_on",
        "M.South_Downstream_Paddles_East_Sensor_u_open_off",
        "M.South_Downstream_Paddles_East_Sensor_u_closed_on",
        "M.South_Downstream_Paddles_East_Sensor_u_closed_off",
        "M.South_Downstream_Paddles_West_Actuator_c_open",
        "M.South_Downstream_Paddles_West_Actuator_c_close",
        "M.South_Downstream_Paddles_West_Actuator_c_emergencyStop",
        "M.South_Downstream_Paddles_West_Actuator_c_endStopClosing",
        "M.South_Downstream_Paddles_West_Actuator_c_endStopOpening",
        "M.South_Downstream_Paddles_West_Sensor_u_open_on",
        "M.South_Downstream_Paddles_West_Sensor_u_open_off",
        "M.South_Downstream_Paddles_West_Sensor_u_closed_on",
        "M.South_Downstream_Paddles_West_Sensor_u_closed_off",
        "M.South_Upstream_EnteringTLs_East_Actuator_c_r",
        "M.South_Upstream_EnteringTLs_East_Actuator_c_rr",
        "M.South_Upstream_EnteringTLs_East_Actuator_c_rg",
        "M.South_Upstream_EnteringTLs_East_Actuator_c_g",
        "M.South_Upstream_EnteringTLs_East_SensorG_u_on",
        "M.South_Upstream_EnteringTLs_East_SensorG_u_off",
        "M.South_Upstream_EnteringTLs_East_SensorR1_u_on",
        "M.South_Upstream_EnteringTLs_East_SensorR1_u_off",
        "M.South_Upstream_EnteringTLs_East_SensorR2_u_on",
        "M.South_Upstream_EnteringTLs_East_SensorR2_u_off",
        "M.South_Upstream_EnteringTLs_West_Actuator_c_r",
        "M.South_Upstream_EnteringTLs_West_Actuator_c_rr",
        "M.South_Upstream_EnteringTLs_West_Actuator_c_rg",
        "M.South_Upstream_EnteringTLs_West_Actuator_c_g",
        "M.South_Upstream_EnteringTLs_West_SensorG_u_on",
        "M.South_Upstream_EnteringTLs_West_SensorG_u_off",
        "M.South_Upstream_EnteringTLs_West_SensorR1_u_on",
        "M.South_Upstream_EnteringTLs_West_SensorR1_u_off",
        "M.South_Upstream_EnteringTLs_West_SensorR2_u_on",
        "M.South_Upstream_EnteringTLs_West_SensorR2_u_off",
        "M.South_Upstream_EqualWaterSensor_u_on",
        "M.South_Upstream_EqualWaterSensor_u_off",
        "M.South_Upstream_Gates_East_Actuator_c_open",
        "M.South_Upstream_Gates_East_Actuator_c_close",
        "M.South_Upstream_Gates_East_Actuator_c_emergencyStop",
        "M.South_Upstream_Gates_East_Actuator_c_endStopClosing",
        "M.South_Upstream_Gates_East_Actuator_c_endStopOpening",
        "M.South_Upstream_Gates_East_Sensor_u_open_on",
        "M.South_Upstream_Gates_East_Sensor_u_open_off",
        "M.South_Upstream_Gates_East_Sensor_u_closed_on",
        "M.South_Upstream_Gates_East_Sensor_u_closed_off",
        "M.South_Upstream_Gates_West_Actuator_c_open",
        "M.South_Upstream_Gates_West_Actuator_c_close",
        "M.South_Upstream_Gates_West_Actuator_c_emergencyStop",
        "M.South_Upstream_Gates_West_Actuator_c_endStopClosing",
        "M.South_Upstream_Gates_West_Actuator_c_endStopOpening",
        "M.South_Upstream_Gates_West_Sensor_u_open_on",
        "M.South_Upstream_Gates_West_Sensor_u_open_off",
        "M.South_Upstream_Gates_West_Sensor_u_closed_on",
        "M.South_Upstream_Gates_West_Sensor_u_closed_off",
        "M.South_Upstream_LeavingTLs_East_Actuator_c_r",
        "M.South_Upstream_LeavingTLs_East_Actuator_c_g",
        "M.South_Upstream_LeavingTLs_East_SensorG_u_on",
        "M.South_Upstream_LeavingTLs_East_SensorG_u_off",
        "M.South_Upstream_LeavingTLs_East_SensorR_u_on",
        "M.South_Upstream_LeavingTLs_East_SensorR_u_off",
        "M.South_Upstream_LeavingTLs_West_Actuator_c_r",
        "M.South_Upstream_LeavingTLs_West_Actuator_c_g",
        "M.South_Upstream_LeavingTLs_West_SensorG_u_on",
        "M.South_Upstream_LeavingTLs_West_SensorG_u_off",
        "M.South_Upstream_LeavingTLs_West_SensorR_u_on",
        "M.South_Upstream_LeavingTLs_West_SensorR_u_off",
        "M.South_Upstream_Paddles_East_Actuator_c_open",
        "M.South_Upstream_Paddles_East_Actuator_c_close",
        "M.South_Upstream_Paddles_East_Actuator_c_emergencyStop",
        "M.South_Upstream_Paddles_East_Actuator_c_endStopClosing",
        "M.South_Upstream_Paddles_East_Actuator_c_endStopOpening",
        "M.South_Upstream_Paddles_East_Sensor_u_open_on",
        "M.South_Upstream_Paddles_East_Sensor_u_open_off",
        "M.South_Upstream_Paddles_East_Sensor_u_closed_on",
        "M.South_Upstream_Paddles_East_Sensor_u_closed_off",
        "M.South_Upstream_Paddles_West_Actuator_c_open",
        "M.South_Upstream_Paddles_West_Actuator_c_close",
        "M.South_Upstream_Paddles_West_Actuator_c_emergencyStop",
        "M.South_Upstream_Paddles_West_Actuator_c_endStopClosing",
        "M.South_Upstream_Paddles_West_Actuator_c_endStopOpening",
        "M.South_Upstream_Paddles_West_Sensor_u_open_on",
        "M.South_Upstream_Paddles_West_Sensor_u_open_off",
        "M.South_Upstream_Paddles_West_Sensor_u_closed_on",
        "M.South_Upstream_Paddles_West_Sensor_u_closed_off",
        "M.Wh_high",
        "M.Wh_low",
    };


    /** Variable 'time'. */
    public double time;

    /** Continuous variable "North_Upstream_Gates_East_Degree". */
    public double North_Upstream_Gates_East_Degree_;

    /** Continuous variable "North_Upstream_Gates_West_Degree". */
    public double North_Upstream_Gates_West_Degree_;

    /** Continuous variable "North_Upstream_Paddles_East_Degree". */
    public double North_Upstream_Paddles_East_Degree_;

    /** Continuous variable "North_Upstream_Paddles_West_Degree". */
    public double North_Upstream_Paddles_West_Degree_;

    /** Continuous variable "North_Downstream_Gates_East_Degree". */
    public double North_Downstream_Gates_East_Degree_;

    /** Continuous variable "North_Downstream_Gates_West_Degree". */
    public double North_Downstream_Gates_West_Degree_;

    /** Continuous variable "North_Downstream_Paddles_East_Degree". */
    public double North_Downstream_Paddles_East_Degree_;

    /** Continuous variable "North_Downstream_Paddles_West_Degree". */
    public double North_Downstream_Paddles_West_Degree_;

    /** Continuous variable "North_Water_H_Chamber". */
    public double North_Water_H_Chamber_;

    /** Continuous variable "South_Upstream_Gates_East_Degree". */
    public double South_Upstream_Gates_East_Degree_;

    /** Continuous variable "South_Upstream_Gates_West_Degree". */
    public double South_Upstream_Gates_West_Degree_;

    /** Continuous variable "South_Upstream_Paddles_East_Degree". */
    public double South_Upstream_Paddles_East_Degree_;

    /** Continuous variable "South_Upstream_Paddles_West_Degree". */
    public double South_Upstream_Paddles_West_Degree_;

    /** Continuous variable "South_Downstream_Gates_East_Degree". */
    public double South_Downstream_Gates_East_Degree_;

    /** Continuous variable "South_Downstream_Gates_West_Degree". */
    public double South_Downstream_Gates_West_Degree_;

    /** Continuous variable "South_Downstream_Paddles_East_Degree". */
    public double South_Downstream_Paddles_East_Degree_;

    /** Continuous variable "South_Downstream_Paddles_West_Degree". */
    public double South_Downstream_Paddles_West_Degree_;

    /** Continuous variable "South_Water_H_Chamber". */
    public double South_Water_H_Chamber_;

    /** Continuous variable "Barrier_Barrier_Degree". */
    public double Barrier_Barrier_Degree_;

    /** Discrete variable "M.Barrier_Barrier_Actuator". */
    public c2jEnum M_Barrier_Barrier_Actuator_;

    /** Discrete variable "M.Barrier_Barrier_Sensor". */
    public c2jEnum M_Barrier_Barrier_Sensor_;

    /** Discrete variable "M.Barrier_Downstream_TLs_East_Actuator". */
    public c2jEnum M_Barrier_Downstream_TLs_East_Actuator_;

    /** Discrete variable "M.Barrier_Downstream_TLs_East_SensorG". */
    public c2jEnum M_Barrier_Downstream_TLs_East_SensorG_;

    /** Discrete variable "M.Barrier_Downstream_TLs_East_SensorR". */
    public c2jEnum M_Barrier_Downstream_TLs_East_SensorR_;

    /** Discrete variable "M.Barrier_Downstream_TLs_West_Actuator". */
    public c2jEnum M_Barrier_Downstream_TLs_West_Actuator_;

    /** Discrete variable "M.Barrier_Downstream_TLs_West_SensorG". */
    public c2jEnum M_Barrier_Downstream_TLs_West_SensorG_;

    /** Discrete variable "M.Barrier_Downstream_TLs_West_SensorR". */
    public c2jEnum M_Barrier_Downstream_TLs_West_SensorR_;

    /** Discrete variable "M.Barrier_HW_Barrier_BVH_East_Open". */
    public boolean M_Barrier_HW_Barrier_BVH_East_Open_;

    /** Discrete variable "M.Barrier_HW_Barrier_BVH_East_Closed". */
    public boolean M_Barrier_HW_Barrier_BVH_East_Closed_;

    /** Discrete variable "M.Barrier_HW_TL_BNH_East_Red". */
    public boolean M_Barrier_HW_TL_BNH_East_Red_;

    /** Discrete variable "M.Barrier_HW_TL_BNH_East_Green". */
    public boolean M_Barrier_HW_TL_BNH_East_Green_;

    /** Discrete variable "M.Barrier_HW_TL_BNH_West_Red". */
    public boolean M_Barrier_HW_TL_BNH_West_Red_;

    /** Discrete variable "M.Barrier_HW_TL_BNH_West_Green". */
    public boolean M_Barrier_HW_TL_BNH_West_Green_;

    /** Discrete variable "M.Barrier_HW_TL_BVH_East_Red". */
    public boolean M_Barrier_HW_TL_BVH_East_Red_;

    /** Discrete variable "M.Barrier_HW_TL_BVH_East_Green". */
    public boolean M_Barrier_HW_TL_BVH_East_Green_;

    /** Discrete variable "M.Barrier_HW_TL_BVH_West_Red". */
    public boolean M_Barrier_HW_TL_BVH_West_Red_;

    /** Discrete variable "M.Barrier_HW_TL_BVH_West_Green". */
    public boolean M_Barrier_HW_TL_BVH_West_Green_;

    /** Discrete variable "M.Barrier_Upstream_TLs_East_Actuator". */
    public c2jEnum M_Barrier_Upstream_TLs_East_Actuator_;

    /** Discrete variable "M.Barrier_Upstream_TLs_East_SensorG". */
    public c2jEnum M_Barrier_Upstream_TLs_East_SensorG_;

    /** Discrete variable "M.Barrier_Upstream_TLs_East_SensorR". */
    public c2jEnum M_Barrier_Upstream_TLs_East_SensorR_;

    /** Discrete variable "M.Barrier_Upstream_TLs_West_Actuator". */
    public c2jEnum M_Barrier_Upstream_TLs_West_Actuator_;

    /** Discrete variable "M.Barrier_Upstream_TLs_West_SensorG". */
    public c2jEnum M_Barrier_Upstream_TLs_West_SensorG_;

    /** Discrete variable "M.Barrier_Upstream_TLs_West_SensorR". */
    public c2jEnum M_Barrier_Upstream_TLs_West_SensorR_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_East_Actuator". */
    public c2jEnum M_North_Downstream_EnteringTLs_East_Actuator_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_East_SensorG". */
    public c2jEnum M_North_Downstream_EnteringTLs_East_SensorG_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_East_SensorR1". */
    public c2jEnum M_North_Downstream_EnteringTLs_East_SensorR1_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_East_SensorR2". */
    public c2jEnum M_North_Downstream_EnteringTLs_East_SensorR2_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_West_Actuator". */
    public c2jEnum M_North_Downstream_EnteringTLs_West_Actuator_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_West_SensorG". */
    public c2jEnum M_North_Downstream_EnteringTLs_West_SensorG_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_West_SensorR1". */
    public c2jEnum M_North_Downstream_EnteringTLs_West_SensorR1_;

    /** Discrete variable "M.North_Downstream_EnteringTLs_West_SensorR2". */
    public c2jEnum M_North_Downstream_EnteringTLs_West_SensorR2_;

    /** Discrete variable "M.North_Downstream_EqualWaterSensor". */
    public c2jEnum M_North_Downstream_EqualWaterSensor_;

    /** Discrete variable "M.North_Downstream_Gates_East_Actuator". */
    public c2jEnum M_North_Downstream_Gates_East_Actuator_;

    /** Discrete variable "M.North_Downstream_Gates_East_Sensor". */
    public c2jEnum M_North_Downstream_Gates_East_Sensor_;

    /** Discrete variable "M.North_Downstream_Gates_West_Actuator". */
    public c2jEnum M_North_Downstream_Gates_West_Actuator_;

    /** Discrete variable "M.North_Downstream_Gates_West_Sensor". */
    public c2jEnum M_North_Downstream_Gates_West_Sensor_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_East_Actuator". */
    public c2jEnum M_North_Downstream_LeavingTLs_East_Actuator_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_East_SensorG". */
    public c2jEnum M_North_Downstream_LeavingTLs_East_SensorG_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_East_SensorR". */
    public c2jEnum M_North_Downstream_LeavingTLs_East_SensorR_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_West_Actuator". */
    public c2jEnum M_North_Downstream_LeavingTLs_West_Actuator_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_West_SensorG". */
    public c2jEnum M_North_Downstream_LeavingTLs_West_SensorG_;

    /** Discrete variable "M.North_Downstream_LeavingTLs_West_SensorR". */
    public c2jEnum M_North_Downstream_LeavingTLs_West_SensorR_;

    /** Discrete variable "M.North_Downstream_Paddles_East_Actuator". */
    public c2jEnum M_North_Downstream_Paddles_East_Actuator_;

    /** Discrete variable "M.North_Downstream_Paddles_East_Sensor". */
    public c2jEnum M_North_Downstream_Paddles_East_Sensor_;

    /** Discrete variable "M.North_Downstream_Paddles_West_Actuator". */
    public c2jEnum M_North_Downstream_Paddles_West_Actuator_;

    /** Discrete variable "M.North_Downstream_Paddles_West_Sensor". */
    public c2jEnum M_North_Downstream_Paddles_West_Sensor_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_East_Red". */
    public boolean M_North_HW_EnteringTL_BNH_East_Red_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_East_Green". */
    public boolean M_North_HW_EnteringTL_BNH_East_Green_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_East_RedRed". */
    public boolean M_North_HW_EnteringTL_BNH_East_RedRed_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_West_Red". */
    public boolean M_North_HW_EnteringTL_BNH_West_Red_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_West_Green". */
    public boolean M_North_HW_EnteringTL_BNH_West_Green_;

    /** Discrete variable "M.North_HW_EnteringTL_BNH_West_RedRed". */
    public boolean M_North_HW_EnteringTL_BNH_West_RedRed_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_East_Red". */
    public boolean M_North_HW_EnteringTL_BVH_East_Red_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_East_Green". */
    public boolean M_North_HW_EnteringTL_BVH_East_Green_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_East_RedRed". */
    public boolean M_North_HW_EnteringTL_BVH_East_RedRed_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_West_Red". */
    public boolean M_North_HW_EnteringTL_BVH_West_Red_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_West_Green". */
    public boolean M_North_HW_EnteringTL_BVH_West_Green_;

    /** Discrete variable "M.North_HW_EnteringTL_BVH_West_RedRed". */
    public boolean M_North_HW_EnteringTL_BVH_West_RedRed_;

    /** Discrete variable "M.North_HW_EqualWaterSensor_BNH_Equal". */
    public boolean M_North_HW_EqualWaterSensor_BNH_Equal_;

    /** Discrete variable "M.North_HW_EqualWaterSensor_BVH_Equal". */
    public boolean M_North_HW_EqualWaterSensor_BVH_Equal_;

    /** Discrete variable "M.North_HW_Gate_BNH_East_Open". */
    public boolean M_North_HW_Gate_BNH_East_Open_;

    /** Discrete variable "M.North_HW_Gate_BNH_East_Closed". */
    public boolean M_North_HW_Gate_BNH_East_Closed_;

    /** Discrete variable "M.North_HW_Gate_BNH_West_Open". */
    public boolean M_North_HW_Gate_BNH_West_Open_;

    /** Discrete variable "M.North_HW_Gate_BNH_West_Closed". */
    public boolean M_North_HW_Gate_BNH_West_Closed_;

    /** Discrete variable "M.North_HW_Gate_BVH_East_Open". */
    public boolean M_North_HW_Gate_BVH_East_Open_;

    /** Discrete variable "M.North_HW_Gate_BVH_East_Closed". */
    public boolean M_North_HW_Gate_BVH_East_Closed_;

    /** Discrete variable "M.North_HW_Gate_BVH_West_Open". */
    public boolean M_North_HW_Gate_BVH_West_Open_;

    /** Discrete variable "M.North_HW_Gate_BVH_West_Closed". */
    public boolean M_North_HW_Gate_BVH_West_Closed_;

    /** Discrete variable "M.North_HW_LeavingTL_BNH_East_Red". */
    public boolean M_North_HW_LeavingTL_BNH_East_Red_;

    /** Discrete variable "M.North_HW_LeavingTL_BNH_East_Green". */
    public boolean M_North_HW_LeavingTL_BNH_East_Green_;

    /** Discrete variable "M.North_HW_LeavingTL_BNH_West_Red". */
    public boolean M_North_HW_LeavingTL_BNH_West_Red_;

    /** Discrete variable "M.North_HW_LeavingTL_BNH_West_Green". */
    public boolean M_North_HW_LeavingTL_BNH_West_Green_;

    /** Discrete variable "M.North_HW_LeavingTL_BVH_East_Red". */
    public boolean M_North_HW_LeavingTL_BVH_East_Red_;

    /** Discrete variable "M.North_HW_LeavingTL_BVH_East_Green". */
    public boolean M_North_HW_LeavingTL_BVH_East_Green_;

    /** Discrete variable "M.North_HW_LeavingTL_BVH_West_Red". */
    public boolean M_North_HW_LeavingTL_BVH_West_Red_;

    /** Discrete variable "M.North_HW_LeavingTL_BVH_West_Green". */
    public boolean M_North_HW_LeavingTL_BVH_West_Green_;

    /** Discrete variable "M.North_HW_Paddle_BNH_East_Open". */
    public boolean M_North_HW_Paddle_BNH_East_Open_;

    /** Discrete variable "M.North_HW_Paddle_BNH_East_Closed". */
    public boolean M_North_HW_Paddle_BNH_East_Closed_;

    /** Discrete variable "M.North_HW_Paddle_BNH_West_Open". */
    public boolean M_North_HW_Paddle_BNH_West_Open_;

    /** Discrete variable "M.North_HW_Paddle_BNH_West_Closed". */
    public boolean M_North_HW_Paddle_BNH_West_Closed_;

    /** Discrete variable "M.North_HW_Paddle_BVH_East_Open". */
    public boolean M_North_HW_Paddle_BVH_East_Open_;

    /** Discrete variable "M.North_HW_Paddle_BVH_East_Closed". */
    public boolean M_North_HW_Paddle_BVH_East_Closed_;

    /** Discrete variable "M.North_HW_Paddle_BVH_West_Open". */
    public boolean M_North_HW_Paddle_BVH_West_Open_;

    /** Discrete variable "M.North_HW_Paddle_BVH_West_Closed". */
    public boolean M_North_HW_Paddle_BVH_West_Closed_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_East_Actuator". */
    public c2jEnum M_North_Upstream_EnteringTLs_East_Actuator_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_East_SensorG". */
    public c2jEnum M_North_Upstream_EnteringTLs_East_SensorG_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_East_SensorR1". */
    public c2jEnum M_North_Upstream_EnteringTLs_East_SensorR1_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_East_SensorR2". */
    public c2jEnum M_North_Upstream_EnteringTLs_East_SensorR2_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_West_Actuator". */
    public c2jEnum M_North_Upstream_EnteringTLs_West_Actuator_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_West_SensorG". */
    public c2jEnum M_North_Upstream_EnteringTLs_West_SensorG_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_West_SensorR1". */
    public c2jEnum M_North_Upstream_EnteringTLs_West_SensorR1_;

    /** Discrete variable "M.North_Upstream_EnteringTLs_West_SensorR2". */
    public c2jEnum M_North_Upstream_EnteringTLs_West_SensorR2_;

    /** Discrete variable "M.North_Upstream_EqualWaterSensor". */
    public c2jEnum M_North_Upstream_EqualWaterSensor_;

    /** Discrete variable "M.North_Upstream_Gates_East_Actuator". */
    public c2jEnum M_North_Upstream_Gates_East_Actuator_;

    /** Discrete variable "M.North_Upstream_Gates_East_Sensor". */
    public c2jEnum M_North_Upstream_Gates_East_Sensor_;

    /** Discrete variable "M.North_Upstream_Gates_West_Actuator". */
    public c2jEnum M_North_Upstream_Gates_West_Actuator_;

    /** Discrete variable "M.North_Upstream_Gates_West_Sensor". */
    public c2jEnum M_North_Upstream_Gates_West_Sensor_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_East_Actuator". */
    public c2jEnum M_North_Upstream_LeavingTLs_East_Actuator_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_East_SensorG". */
    public c2jEnum M_North_Upstream_LeavingTLs_East_SensorG_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_East_SensorR". */
    public c2jEnum M_North_Upstream_LeavingTLs_East_SensorR_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_West_Actuator". */
    public c2jEnum M_North_Upstream_LeavingTLs_West_Actuator_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_West_SensorG". */
    public c2jEnum M_North_Upstream_LeavingTLs_West_SensorG_;

    /** Discrete variable "M.North_Upstream_LeavingTLs_West_SensorR". */
    public c2jEnum M_North_Upstream_LeavingTLs_West_SensorR_;

    /** Discrete variable "M.North_Upstream_Paddles_East_Actuator". */
    public c2jEnum M_North_Upstream_Paddles_East_Actuator_;

    /** Discrete variable "M.North_Upstream_Paddles_East_Sensor". */
    public c2jEnum M_North_Upstream_Paddles_East_Sensor_;

    /** Discrete variable "M.North_Upstream_Paddles_West_Actuator". */
    public c2jEnum M_North_Upstream_Paddles_West_Actuator_;

    /** Discrete variable "M.North_Upstream_Paddles_West_Sensor". */
    public c2jEnum M_North_Upstream_Paddles_West_Sensor_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_East_Actuator". */
    public c2jEnum M_South_Downstream_EnteringTLs_East_Actuator_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_East_SensorG". */
    public c2jEnum M_South_Downstream_EnteringTLs_East_SensorG_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_East_SensorR1". */
    public c2jEnum M_South_Downstream_EnteringTLs_East_SensorR1_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_East_SensorR2". */
    public c2jEnum M_South_Downstream_EnteringTLs_East_SensorR2_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_West_Actuator". */
    public c2jEnum M_South_Downstream_EnteringTLs_West_Actuator_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_West_SensorG". */
    public c2jEnum M_South_Downstream_EnteringTLs_West_SensorG_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_West_SensorR1". */
    public c2jEnum M_South_Downstream_EnteringTLs_West_SensorR1_;

    /** Discrete variable "M.South_Downstream_EnteringTLs_West_SensorR2". */
    public c2jEnum M_South_Downstream_EnteringTLs_West_SensorR2_;

    /** Discrete variable "M.South_Downstream_EqualWaterSensor". */
    public c2jEnum M_South_Downstream_EqualWaterSensor_;

    /** Discrete variable "M.South_Downstream_Gates_East_Actuator". */
    public c2jEnum M_South_Downstream_Gates_East_Actuator_;

    /** Discrete variable "M.South_Downstream_Gates_East_Sensor". */
    public c2jEnum M_South_Downstream_Gates_East_Sensor_;

    /** Discrete variable "M.South_Downstream_Gates_West_Actuator". */
    public c2jEnum M_South_Downstream_Gates_West_Actuator_;

    /** Discrete variable "M.South_Downstream_Gates_West_Sensor". */
    public c2jEnum M_South_Downstream_Gates_West_Sensor_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_East_Actuator". */
    public c2jEnum M_South_Downstream_LeavingTLs_East_Actuator_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_East_SensorG". */
    public c2jEnum M_South_Downstream_LeavingTLs_East_SensorG_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_East_SensorR". */
    public c2jEnum M_South_Downstream_LeavingTLs_East_SensorR_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_West_Actuator". */
    public c2jEnum M_South_Downstream_LeavingTLs_West_Actuator_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_West_SensorG". */
    public c2jEnum M_South_Downstream_LeavingTLs_West_SensorG_;

    /** Discrete variable "M.South_Downstream_LeavingTLs_West_SensorR". */
    public c2jEnum M_South_Downstream_LeavingTLs_West_SensorR_;

    /** Discrete variable "M.South_Downstream_Paddles_East_Actuator". */
    public c2jEnum M_South_Downstream_Paddles_East_Actuator_;

    /** Discrete variable "M.South_Downstream_Paddles_East_Sensor". */
    public c2jEnum M_South_Downstream_Paddles_East_Sensor_;

    /** Discrete variable "M.South_Downstream_Paddles_West_Actuator". */
    public c2jEnum M_South_Downstream_Paddles_West_Actuator_;

    /** Discrete variable "M.South_Downstream_Paddles_West_Sensor". */
    public c2jEnum M_South_Downstream_Paddles_West_Sensor_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_East_Red". */
    public boolean M_South_HW_EnteringTL_BNH_East_Red_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_East_Green". */
    public boolean M_South_HW_EnteringTL_BNH_East_Green_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_East_RedRed". */
    public boolean M_South_HW_EnteringTL_BNH_East_RedRed_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_West_Red". */
    public boolean M_South_HW_EnteringTL_BNH_West_Red_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_West_Green". */
    public boolean M_South_HW_EnteringTL_BNH_West_Green_;

    /** Discrete variable "M.South_HW_EnteringTL_BNH_West_RedRed". */
    public boolean M_South_HW_EnteringTL_BNH_West_RedRed_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_East_Red". */
    public boolean M_South_HW_EnteringTL_BVH_East_Red_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_East_Green". */
    public boolean M_South_HW_EnteringTL_BVH_East_Green_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_East_RedRed". */
    public boolean M_South_HW_EnteringTL_BVH_East_RedRed_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_West_Red". */
    public boolean M_South_HW_EnteringTL_BVH_West_Red_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_West_Green". */
    public boolean M_South_HW_EnteringTL_BVH_West_Green_;

    /** Discrete variable "M.South_HW_EnteringTL_BVH_West_RedRed". */
    public boolean M_South_HW_EnteringTL_BVH_West_RedRed_;

    /** Discrete variable "M.South_HW_EqualWaterSensor_BNH_Equal". */
    public boolean M_South_HW_EqualWaterSensor_BNH_Equal_;

    /** Discrete variable "M.South_HW_EqualWaterSensor_BVH_Equal". */
    public boolean M_South_HW_EqualWaterSensor_BVH_Equal_;

    /** Discrete variable "M.South_HW_Gate_BNH_East_Open". */
    public boolean M_South_HW_Gate_BNH_East_Open_;

    /** Discrete variable "M.South_HW_Gate_BNH_East_Closed". */
    public boolean M_South_HW_Gate_BNH_East_Closed_;

    /** Discrete variable "M.South_HW_Gate_BNH_West_Open". */
    public boolean M_South_HW_Gate_BNH_West_Open_;

    /** Discrete variable "M.South_HW_Gate_BNH_West_Closed". */
    public boolean M_South_HW_Gate_BNH_West_Closed_;

    /** Discrete variable "M.South_HW_Gate_BVH_East_Open". */
    public boolean M_South_HW_Gate_BVH_East_Open_;

    /** Discrete variable "M.South_HW_Gate_BVH_East_Closed". */
    public boolean M_South_HW_Gate_BVH_East_Closed_;

    /** Discrete variable "M.South_HW_Gate_BVH_West_Open". */
    public boolean M_South_HW_Gate_BVH_West_Open_;

    /** Discrete variable "M.South_HW_Gate_BVH_West_Closed". */
    public boolean M_South_HW_Gate_BVH_West_Closed_;

    /** Discrete variable "M.South_HW_LeavingTL_BNH_East_Red". */
    public boolean M_South_HW_LeavingTL_BNH_East_Red_;

    /** Discrete variable "M.South_HW_LeavingTL_BNH_East_Green". */
    public boolean M_South_HW_LeavingTL_BNH_East_Green_;

    /** Discrete variable "M.South_HW_LeavingTL_BNH_West_Red". */
    public boolean M_South_HW_LeavingTL_BNH_West_Red_;

    /** Discrete variable "M.South_HW_LeavingTL_BNH_West_Green". */
    public boolean M_South_HW_LeavingTL_BNH_West_Green_;

    /** Discrete variable "M.South_HW_LeavingTL_BVH_East_Red". */
    public boolean M_South_HW_LeavingTL_BVH_East_Red_;

    /** Discrete variable "M.South_HW_LeavingTL_BVH_East_Green". */
    public boolean M_South_HW_LeavingTL_BVH_East_Green_;

    /** Discrete variable "M.South_HW_LeavingTL_BVH_West_Red". */
    public boolean M_South_HW_LeavingTL_BVH_West_Red_;

    /** Discrete variable "M.South_HW_LeavingTL_BVH_West_Green". */
    public boolean M_South_HW_LeavingTL_BVH_West_Green_;

    /** Discrete variable "M.South_HW_Paddle_BNH_East_Open". */
    public boolean M_South_HW_Paddle_BNH_East_Open_;

    /** Discrete variable "M.South_HW_Paddle_BNH_East_Closed". */
    public boolean M_South_HW_Paddle_BNH_East_Closed_;

    /** Discrete variable "M.South_HW_Paddle_BNH_West_Open". */
    public boolean M_South_HW_Paddle_BNH_West_Open_;

    /** Discrete variable "M.South_HW_Paddle_BNH_West_Closed". */
    public boolean M_South_HW_Paddle_BNH_West_Closed_;

    /** Discrete variable "M.South_HW_Paddle_BVH_East_Open". */
    public boolean M_South_HW_Paddle_BVH_East_Open_;

    /** Discrete variable "M.South_HW_Paddle_BVH_East_Closed". */
    public boolean M_South_HW_Paddle_BVH_East_Closed_;

    /** Discrete variable "M.South_HW_Paddle_BVH_West_Open". */
    public boolean M_South_HW_Paddle_BVH_West_Open_;

    /** Discrete variable "M.South_HW_Paddle_BVH_West_Closed". */
    public boolean M_South_HW_Paddle_BVH_West_Closed_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_East_Actuator". */
    public c2jEnum M_South_Upstream_EnteringTLs_East_Actuator_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_East_SensorG". */
    public c2jEnum M_South_Upstream_EnteringTLs_East_SensorG_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_East_SensorR1". */
    public c2jEnum M_South_Upstream_EnteringTLs_East_SensorR1_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_East_SensorR2". */
    public c2jEnum M_South_Upstream_EnteringTLs_East_SensorR2_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_West_Actuator". */
    public c2jEnum M_South_Upstream_EnteringTLs_West_Actuator_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_West_SensorG". */
    public c2jEnum M_South_Upstream_EnteringTLs_West_SensorG_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_West_SensorR1". */
    public c2jEnum M_South_Upstream_EnteringTLs_West_SensorR1_;

    /** Discrete variable "M.South_Upstream_EnteringTLs_West_SensorR2". */
    public c2jEnum M_South_Upstream_EnteringTLs_West_SensorR2_;

    /** Discrete variable "M.South_Upstream_EqualWaterSensor". */
    public c2jEnum M_South_Upstream_EqualWaterSensor_;

    /** Discrete variable "M.South_Upstream_Gates_East_Actuator". */
    public c2jEnum M_South_Upstream_Gates_East_Actuator_;

    /** Discrete variable "M.South_Upstream_Gates_East_Sensor". */
    public c2jEnum M_South_Upstream_Gates_East_Sensor_;

    /** Discrete variable "M.South_Upstream_Gates_West_Actuator". */
    public c2jEnum M_South_Upstream_Gates_West_Actuator_;

    /** Discrete variable "M.South_Upstream_Gates_West_Sensor". */
    public c2jEnum M_South_Upstream_Gates_West_Sensor_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_East_Actuator". */
    public c2jEnum M_South_Upstream_LeavingTLs_East_Actuator_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_East_SensorG". */
    public c2jEnum M_South_Upstream_LeavingTLs_East_SensorG_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_East_SensorR". */
    public c2jEnum M_South_Upstream_LeavingTLs_East_SensorR_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_West_Actuator". */
    public c2jEnum M_South_Upstream_LeavingTLs_West_Actuator_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_West_SensorG". */
    public c2jEnum M_South_Upstream_LeavingTLs_West_SensorG_;

    /** Discrete variable "M.South_Upstream_LeavingTLs_West_SensorR". */
    public c2jEnum M_South_Upstream_LeavingTLs_West_SensorR_;

    /** Discrete variable "M.South_Upstream_Paddles_East_Actuator". */
    public c2jEnum M_South_Upstream_Paddles_East_Actuator_;

    /** Discrete variable "M.South_Upstream_Paddles_East_Sensor". */
    public c2jEnum M_South_Upstream_Paddles_East_Sensor_;

    /** Discrete variable "M.South_Upstream_Paddles_West_Actuator". */
    public c2jEnum M_South_Upstream_Paddles_West_Actuator_;

    /** Discrete variable "M.South_Upstream_Paddles_West_Sensor". */
    public c2jEnum M_South_Upstream_Paddles_West_Sensor_;

    /** Discrete variable "M.Wh". */
    public c2jEnum M_Wh_;

    /** Discrete variable "M". */
    public c2jEnum M_;

    /** Input variable "M.Barrier_HW_Barrier_BVH_East_Q_Open". */
    public boolean M_Barrier_HW_Barrier_BVH_East_Q_Open_;

    /** Input variable "M.Barrier_HW_Barrier_BVH_East_Q_Close". */
    public boolean M_Barrier_HW_Barrier_BVH_East_Q_Close_;

    /** Input variable "M.Barrier_HW_TL_BNH_East_Q_Red". */
    public boolean M_Barrier_HW_TL_BNH_East_Q_Red_;

    /** Input variable "M.Barrier_HW_TL_BNH_East_Q_Green". */
    public boolean M_Barrier_HW_TL_BNH_East_Q_Green_;

    /** Input variable "M.Barrier_HW_TL_BNH_West_Q_Red". */
    public boolean M_Barrier_HW_TL_BNH_West_Q_Red_;

    /** Input variable "M.Barrier_HW_TL_BNH_West_Q_Green". */
    public boolean M_Barrier_HW_TL_BNH_West_Q_Green_;

    /** Input variable "M.Barrier_HW_TL_BVH_East_Q_Red". */
    public boolean M_Barrier_HW_TL_BVH_East_Q_Red_;

    /** Input variable "M.Barrier_HW_TL_BVH_East_Q_Green". */
    public boolean M_Barrier_HW_TL_BVH_East_Q_Green_;

    /** Input variable "M.Barrier_HW_TL_BVH_West_Q_Red". */
    public boolean M_Barrier_HW_TL_BVH_West_Q_Red_;

    /** Input variable "M.Barrier_HW_TL_BVH_West_Q_Green". */
    public boolean M_Barrier_HW_TL_BVH_West_Q_Green_;

    /** Input variable "M.HW_Wh_HighWater". */
    public boolean M_HW_Wh_HighWater_;

    /** Input variable "M.North_HW_EnteringTL_BNH_East_Q_Red". */
    public boolean M_North_HW_EnteringTL_BNH_East_Q_Red_;

    /** Input variable "M.North_HW_EnteringTL_BNH_East_Q_Green". */
    public boolean M_North_HW_EnteringTL_BNH_East_Q_Green_;

    /** Input variable "M.North_HW_EnteringTL_BNH_East_Q_RedRed". */
    public boolean M_North_HW_EnteringTL_BNH_East_Q_RedRed_;

    /** Input variable "M.North_HW_EnteringTL_BNH_West_Q_Red". */
    public boolean M_North_HW_EnteringTL_BNH_West_Q_Red_;

    /** Input variable "M.North_HW_EnteringTL_BNH_West_Q_Green". */
    public boolean M_North_HW_EnteringTL_BNH_West_Q_Green_;

    /** Input variable "M.North_HW_EnteringTL_BNH_West_Q_RedRed". */
    public boolean M_North_HW_EnteringTL_BNH_West_Q_RedRed_;

    /** Input variable "M.North_HW_EnteringTL_BVH_East_Q_Red". */
    public boolean M_North_HW_EnteringTL_BVH_East_Q_Red_;

    /** Input variable "M.North_HW_EnteringTL_BVH_East_Q_Green". */
    public boolean M_North_HW_EnteringTL_BVH_East_Q_Green_;

    /** Input variable "M.North_HW_EnteringTL_BVH_East_Q_RedRed". */
    public boolean M_North_HW_EnteringTL_BVH_East_Q_RedRed_;

    /** Input variable "M.North_HW_EnteringTL_BVH_West_Q_Red". */
    public boolean M_North_HW_EnteringTL_BVH_West_Q_Red_;

    /** Input variable "M.North_HW_EnteringTL_BVH_West_Q_Green". */
    public boolean M_North_HW_EnteringTL_BVH_West_Q_Green_;

    /** Input variable "M.North_HW_EnteringTL_BVH_West_Q_RedRed". */
    public boolean M_North_HW_EnteringTL_BVH_West_Q_RedRed_;

    /** Input variable "M.North_HW_Gate_BNH_East_Q_Open". */
    public boolean M_North_HW_Gate_BNH_East_Q_Open_;

    /** Input variable "M.North_HW_Gate_BNH_East_Q_Close". */
    public boolean M_North_HW_Gate_BNH_East_Q_Close_;

    /** Input variable "M.North_HW_Gate_BNH_West_Q_Open". */
    public boolean M_North_HW_Gate_BNH_West_Q_Open_;

    /** Input variable "M.North_HW_Gate_BNH_West_Q_Close". */
    public boolean M_North_HW_Gate_BNH_West_Q_Close_;

    /** Input variable "M.North_HW_Gate_BVH_East_Q_Open". */
    public boolean M_North_HW_Gate_BVH_East_Q_Open_;

    /** Input variable "M.North_HW_Gate_BVH_East_Q_Close". */
    public boolean M_North_HW_Gate_BVH_East_Q_Close_;

    /** Input variable "M.North_HW_Gate_BVH_West_Q_Open". */
    public boolean M_North_HW_Gate_BVH_West_Q_Open_;

    /** Input variable "M.North_HW_Gate_BVH_West_Q_Close". */
    public boolean M_North_HW_Gate_BVH_West_Q_Close_;

    /** Input variable "M.North_HW_LeavingTL_BNH_East_Q_Red". */
    public boolean M_North_HW_LeavingTL_BNH_East_Q_Red_;

    /** Input variable "M.North_HW_LeavingTL_BNH_East_Q_Green". */
    public boolean M_North_HW_LeavingTL_BNH_East_Q_Green_;

    /** Input variable "M.North_HW_LeavingTL_BNH_West_Q_Red". */
    public boolean M_North_HW_LeavingTL_BNH_West_Q_Red_;

    /** Input variable "M.North_HW_LeavingTL_BNH_West_Q_Green". */
    public boolean M_North_HW_LeavingTL_BNH_West_Q_Green_;

    /** Input variable "M.North_HW_LeavingTL_BVH_East_Q_Red". */
    public boolean M_North_HW_LeavingTL_BVH_East_Q_Red_;

    /** Input variable "M.North_HW_LeavingTL_BVH_East_Q_Green". */
    public boolean M_North_HW_LeavingTL_BVH_East_Q_Green_;

    /** Input variable "M.North_HW_LeavingTL_BVH_West_Q_Red". */
    public boolean M_North_HW_LeavingTL_BVH_West_Q_Red_;

    /** Input variable "M.North_HW_LeavingTL_BVH_West_Q_Green". */
    public boolean M_North_HW_LeavingTL_BVH_West_Q_Green_;

    /** Input variable "M.North_HW_Paddle_BNH_East_Q_Open". */
    public boolean M_North_HW_Paddle_BNH_East_Q_Open_;

    /** Input variable "M.North_HW_Paddle_BNH_East_Q_Close". */
    public boolean M_North_HW_Paddle_BNH_East_Q_Close_;

    /** Input variable "M.North_HW_Paddle_BNH_West_Q_Open". */
    public boolean M_North_HW_Paddle_BNH_West_Q_Open_;

    /** Input variable "M.North_HW_Paddle_BNH_West_Q_Close". */
    public boolean M_North_HW_Paddle_BNH_West_Q_Close_;

    /** Input variable "M.North_HW_Paddle_BVH_East_Q_Open". */
    public boolean M_North_HW_Paddle_BVH_East_Q_Open_;

    /** Input variable "M.North_HW_Paddle_BVH_East_Q_Close". */
    public boolean M_North_HW_Paddle_BVH_East_Q_Close_;

    /** Input variable "M.North_HW_Paddle_BVH_West_Q_Open". */
    public boolean M_North_HW_Paddle_BVH_West_Q_Open_;

    /** Input variable "M.North_HW_Paddle_BVH_West_Q_Close". */
    public boolean M_North_HW_Paddle_BVH_West_Q_Close_;

    /** Input variable "M.South_HW_EnteringTL_BNH_East_Q_Red". */
    public boolean M_South_HW_EnteringTL_BNH_East_Q_Red_;

    /** Input variable "M.South_HW_EnteringTL_BNH_East_Q_Green". */
    public boolean M_South_HW_EnteringTL_BNH_East_Q_Green_;

    /** Input variable "M.South_HW_EnteringTL_BNH_East_Q_RedRed". */
    public boolean M_South_HW_EnteringTL_BNH_East_Q_RedRed_;

    /** Input variable "M.South_HW_EnteringTL_BNH_West_Q_Red". */
    public boolean M_South_HW_EnteringTL_BNH_West_Q_Red_;

    /** Input variable "M.South_HW_EnteringTL_BNH_West_Q_Green". */
    public boolean M_South_HW_EnteringTL_BNH_West_Q_Green_;

    /** Input variable "M.South_HW_EnteringTL_BNH_West_Q_RedRed". */
    public boolean M_South_HW_EnteringTL_BNH_West_Q_RedRed_;

    /** Input variable "M.South_HW_EnteringTL_BVH_East_Q_Red". */
    public boolean M_South_HW_EnteringTL_BVH_East_Q_Red_;

    /** Input variable "M.South_HW_EnteringTL_BVH_East_Q_Green". */
    public boolean M_South_HW_EnteringTL_BVH_East_Q_Green_;

    /** Input variable "M.South_HW_EnteringTL_BVH_East_Q_RedRed". */
    public boolean M_South_HW_EnteringTL_BVH_East_Q_RedRed_;

    /** Input variable "M.South_HW_EnteringTL_BVH_West_Q_Red". */
    public boolean M_South_HW_EnteringTL_BVH_West_Q_Red_;

    /** Input variable "M.South_HW_EnteringTL_BVH_West_Q_Green". */
    public boolean M_South_HW_EnteringTL_BVH_West_Q_Green_;

    /** Input variable "M.South_HW_EnteringTL_BVH_West_Q_RedRed". */
    public boolean M_South_HW_EnteringTL_BVH_West_Q_RedRed_;

    /** Input variable "M.South_HW_Gate_BNH_East_Q_Open". */
    public boolean M_South_HW_Gate_BNH_East_Q_Open_;

    /** Input variable "M.South_HW_Gate_BNH_East_Q_Close". */
    public boolean M_South_HW_Gate_BNH_East_Q_Close_;

    /** Input variable "M.South_HW_Gate_BNH_West_Q_Open". */
    public boolean M_South_HW_Gate_BNH_West_Q_Open_;

    /** Input variable "M.South_HW_Gate_BNH_West_Q_Close". */
    public boolean M_South_HW_Gate_BNH_West_Q_Close_;

    /** Input variable "M.South_HW_Gate_BVH_East_Q_Open". */
    public boolean M_South_HW_Gate_BVH_East_Q_Open_;

    /** Input variable "M.South_HW_Gate_BVH_East_Q_Close". */
    public boolean M_South_HW_Gate_BVH_East_Q_Close_;

    /** Input variable "M.South_HW_Gate_BVH_West_Q_Open". */
    public boolean M_South_HW_Gate_BVH_West_Q_Open_;

    /** Input variable "M.South_HW_Gate_BVH_West_Q_Close". */
    public boolean M_South_HW_Gate_BVH_West_Q_Close_;

    /** Input variable "M.South_HW_LeavingTL_BNH_East_Q_Red". */
    public boolean M_South_HW_LeavingTL_BNH_East_Q_Red_;

    /** Input variable "M.South_HW_LeavingTL_BNH_East_Q_Green". */
    public boolean M_South_HW_LeavingTL_BNH_East_Q_Green_;

    /** Input variable "M.South_HW_LeavingTL_BNH_West_Q_Red". */
    public boolean M_South_HW_LeavingTL_BNH_West_Q_Red_;

    /** Input variable "M.South_HW_LeavingTL_BNH_West_Q_Green". */
    public boolean M_South_HW_LeavingTL_BNH_West_Q_Green_;

    /** Input variable "M.South_HW_LeavingTL_BVH_East_Q_Red". */
    public boolean M_South_HW_LeavingTL_BVH_East_Q_Red_;

    /** Input variable "M.South_HW_LeavingTL_BVH_East_Q_Green". */
    public boolean M_South_HW_LeavingTL_BVH_East_Q_Green_;

    /** Input variable "M.South_HW_LeavingTL_BVH_West_Q_Red". */
    public boolean M_South_HW_LeavingTL_BVH_West_Q_Red_;

    /** Input variable "M.South_HW_LeavingTL_BVH_West_Q_Green". */
    public boolean M_South_HW_LeavingTL_BVH_West_Q_Green_;

    /** Input variable "M.South_HW_Paddle_BNH_East_Q_Open". */
    public boolean M_South_HW_Paddle_BNH_East_Q_Open_;

    /** Input variable "M.South_HW_Paddle_BNH_East_Q_Close". */
    public boolean M_South_HW_Paddle_BNH_East_Q_Close_;

    /** Input variable "M.South_HW_Paddle_BNH_West_Q_Open". */
    public boolean M_South_HW_Paddle_BNH_West_Q_Open_;

    /** Input variable "M.South_HW_Paddle_BNH_West_Q_Close". */
    public boolean M_South_HW_Paddle_BNH_West_Q_Close_;

    /** Input variable "M.South_HW_Paddle_BVH_East_Q_Open". */
    public boolean M_South_HW_Paddle_BVH_East_Q_Open_;

    /** Input variable "M.South_HW_Paddle_BVH_East_Q_Close". */
    public boolean M_South_HW_Paddle_BVH_East_Q_Close_;

    /** Input variable "M.South_HW_Paddle_BVH_West_Q_Open". */
    public boolean M_South_HW_Paddle_BVH_West_Q_Open_;

    /** Input variable "M.South_HW_Paddle_BVH_West_Q_Close". */
    public boolean M_South_HW_Paddle_BVH_West_Q_Close_;

    /** Constructor for the {@link c2j} class. */
    public c2j() {
        firstExec = true;
        this.time = 0.0;
    }

    /**
     * Execute the code once. Inputs are read, transitions are executed until
     * none are possible, outputs are written, etc.
     *
     * @param newTime The time in seconds, since the start of the first
     *      execution.
     * @throws c2jException In case of a runtime error caused by code
     *      generated from the CIF model.
     */
    public void execOnce(double newTime) {
        // Pre execution notification.
        preExec();

        // Update values of input variables.
        updateInputs();

        // Initialize the state.
        if (firstExec) {
            initState();
        }

        // Calculate time delta.
        double delta = newTime - time;

        // Update values of continuous variables.
        if (!firstExec) {
            double deriv0 = North_Upstream_Gates_East_Degree_deriv();
            double deriv1 = North_Upstream_Gates_West_Degree_deriv();
            double deriv2 = North_Upstream_Paddles_East_Degree_deriv();
            double deriv3 = North_Upstream_Paddles_West_Degree_deriv();
            double deriv4 = North_Downstream_Gates_East_Degree_deriv();
            double deriv5 = North_Downstream_Gates_West_Degree_deriv();
            double deriv6 = North_Downstream_Paddles_East_Degree_deriv();
            double deriv7 = North_Downstream_Paddles_West_Degree_deriv();
            double deriv8 = North_Water_H_Chamber_deriv();
            double deriv9 = South_Upstream_Gates_East_Degree_deriv();
            double deriv10 = South_Upstream_Gates_West_Degree_deriv();
            double deriv11 = South_Upstream_Paddles_East_Degree_deriv();
            double deriv12 = South_Upstream_Paddles_West_Degree_deriv();
            double deriv13 = South_Downstream_Gates_East_Degree_deriv();
            double deriv14 = South_Downstream_Gates_West_Degree_deriv();
            double deriv15 = South_Downstream_Paddles_East_Degree_deriv();
            double deriv16 = South_Downstream_Paddles_West_Degree_deriv();
            double deriv17 = South_Water_H_Chamber_deriv();
            double deriv18 = Barrier_Barrier_Degree_deriv();

            North_Upstream_Gates_East_Degree_ = North_Upstream_Gates_East_Degree_ + delta * deriv0;
            checkDouble(North_Upstream_Gates_East_Degree_, "North_Upstream_Gates_East_Degree");
            if (North_Upstream_Gates_East_Degree_ == -0.0) North_Upstream_Gates_East_Degree_ = 0.0;
            North_Upstream_Gates_West_Degree_ = North_Upstream_Gates_West_Degree_ + delta * deriv1;
            checkDouble(North_Upstream_Gates_West_Degree_, "North_Upstream_Gates_West_Degree");
            if (North_Upstream_Gates_West_Degree_ == -0.0) North_Upstream_Gates_West_Degree_ = 0.0;
            North_Upstream_Paddles_East_Degree_ = North_Upstream_Paddles_East_Degree_ + delta * deriv2;
            checkDouble(North_Upstream_Paddles_East_Degree_, "North_Upstream_Paddles_East_Degree");
            if (North_Upstream_Paddles_East_Degree_ == -0.0) North_Upstream_Paddles_East_Degree_ = 0.0;
            North_Upstream_Paddles_West_Degree_ = North_Upstream_Paddles_West_Degree_ + delta * deriv3;
            checkDouble(North_Upstream_Paddles_West_Degree_, "North_Upstream_Paddles_West_Degree");
            if (North_Upstream_Paddles_West_Degree_ == -0.0) North_Upstream_Paddles_West_Degree_ = 0.0;
            North_Downstream_Gates_East_Degree_ = North_Downstream_Gates_East_Degree_ + delta * deriv4;
            checkDouble(North_Downstream_Gates_East_Degree_, "North_Downstream_Gates_East_Degree");
            if (North_Downstream_Gates_East_Degree_ == -0.0) North_Downstream_Gates_East_Degree_ = 0.0;
            North_Downstream_Gates_West_Degree_ = North_Downstream_Gates_West_Degree_ + delta * deriv5;
            checkDouble(North_Downstream_Gates_West_Degree_, "North_Downstream_Gates_West_Degree");
            if (North_Downstream_Gates_West_Degree_ == -0.0) North_Downstream_Gates_West_Degree_ = 0.0;
            North_Downstream_Paddles_East_Degree_ = North_Downstream_Paddles_East_Degree_ + delta * deriv6;
            checkDouble(North_Downstream_Paddles_East_Degree_, "North_Downstream_Paddles_East_Degree");
            if (North_Downstream_Paddles_East_Degree_ == -0.0) North_Downstream_Paddles_East_Degree_ = 0.0;
            North_Downstream_Paddles_West_Degree_ = North_Downstream_Paddles_West_Degree_ + delta * deriv7;
            checkDouble(North_Downstream_Paddles_West_Degree_, "North_Downstream_Paddles_West_Degree");
            if (North_Downstream_Paddles_West_Degree_ == -0.0) North_Downstream_Paddles_West_Degree_ = 0.0;
            North_Water_H_Chamber_ = North_Water_H_Chamber_ + delta * deriv8;
            checkDouble(North_Water_H_Chamber_, "North_Water_H_Chamber");
            if (North_Water_H_Chamber_ == -0.0) North_Water_H_Chamber_ = 0.0;
            South_Upstream_Gates_East_Degree_ = South_Upstream_Gates_East_Degree_ + delta * deriv9;
            checkDouble(South_Upstream_Gates_East_Degree_, "South_Upstream_Gates_East_Degree");
            if (South_Upstream_Gates_East_Degree_ == -0.0) South_Upstream_Gates_East_Degree_ = 0.0;
            South_Upstream_Gates_West_Degree_ = South_Upstream_Gates_West_Degree_ + delta * deriv10;
            checkDouble(South_Upstream_Gates_West_Degree_, "South_Upstream_Gates_West_Degree");
            if (South_Upstream_Gates_West_Degree_ == -0.0) South_Upstream_Gates_West_Degree_ = 0.0;
            South_Upstream_Paddles_East_Degree_ = South_Upstream_Paddles_East_Degree_ + delta * deriv11;
            checkDouble(South_Upstream_Paddles_East_Degree_, "South_Upstream_Paddles_East_Degree");
            if (South_Upstream_Paddles_East_Degree_ == -0.0) South_Upstream_Paddles_East_Degree_ = 0.0;
            South_Upstream_Paddles_West_Degree_ = South_Upstream_Paddles_West_Degree_ + delta * deriv12;
            checkDouble(South_Upstream_Paddles_West_Degree_, "South_Upstream_Paddles_West_Degree");
            if (South_Upstream_Paddles_West_Degree_ == -0.0) South_Upstream_Paddles_West_Degree_ = 0.0;
            South_Downstream_Gates_East_Degree_ = South_Downstream_Gates_East_Degree_ + delta * deriv13;
            checkDouble(South_Downstream_Gates_East_Degree_, "South_Downstream_Gates_East_Degree");
            if (South_Downstream_Gates_East_Degree_ == -0.0) South_Downstream_Gates_East_Degree_ = 0.0;
            South_Downstream_Gates_West_Degree_ = South_Downstream_Gates_West_Degree_ + delta * deriv14;
            checkDouble(South_Downstream_Gates_West_Degree_, "South_Downstream_Gates_West_Degree");
            if (South_Downstream_Gates_West_Degree_ == -0.0) South_Downstream_Gates_West_Degree_ = 0.0;
            South_Downstream_Paddles_East_Degree_ = South_Downstream_Paddles_East_Degree_ + delta * deriv15;
            checkDouble(South_Downstream_Paddles_East_Degree_, "South_Downstream_Paddles_East_Degree");
            if (South_Downstream_Paddles_East_Degree_ == -0.0) South_Downstream_Paddles_East_Degree_ = 0.0;
            South_Downstream_Paddles_West_Degree_ = South_Downstream_Paddles_West_Degree_ + delta * deriv16;
            checkDouble(South_Downstream_Paddles_West_Degree_, "South_Downstream_Paddles_West_Degree");
            if (South_Downstream_Paddles_West_Degree_ == -0.0) South_Downstream_Paddles_West_Degree_ = 0.0;
            South_Water_H_Chamber_ = South_Water_H_Chamber_ + delta * deriv17;
            checkDouble(South_Water_H_Chamber_, "South_Water_H_Chamber");
            if (South_Water_H_Chamber_ == -0.0) South_Water_H_Chamber_ = 0.0;
            Barrier_Barrier_Degree_ = Barrier_Barrier_Degree_ + delta * deriv18;
            checkDouble(Barrier_Barrier_Degree_, "Barrier_Barrier_Degree");
            if (Barrier_Barrier_Degree_ == -0.0) Barrier_Barrier_Degree_ = 0.0;
        }

        // Update time.
        time = newTime;

        // Apply print declarations.
        if (firstExec) {
            // For 'initial' transition.
            if (doInfoPrintOutput) printOutput(-3, true);
            if (doInfoPrintOutput) printOutput(-3, false);

        } else {
            // For 'post' of time transition.
            if (doInfoPrintOutput) printOutput(-2, false);
        }

        // Execute events as long as they are possible.
        int i;
        for (i=0; i<=100; i++) {
            // Event "M.Barrier_Barrier_Actuator_c_close".
            if (execEvent0()) continue;

            // Event "M.Barrier_Barrier_Actuator_c_emergencyStop".
            if (execEvent1()) continue;

            // Event "M.Barrier_Barrier_Actuator_c_endStopClosing".
            if (execEvent2()) continue;

            // Event "M.Barrier_Barrier_Actuator_c_endStopOpening".
            if (execEvent3()) continue;

            // Event "M.Barrier_Barrier_Actuator_c_open".
            if (execEvent4()) continue;

            // Event "M.Barrier_Barrier_Sensor_u_closed_off".
            if (execEvent5()) continue;

            // Event "M.Barrier_Barrier_Sensor_u_closed_on".
            if (execEvent6()) continue;

            // Event "M.Barrier_Barrier_Sensor_u_open_off".
            if (execEvent7()) continue;

            // Event "M.Barrier_Barrier_Sensor_u_open_on".
            if (execEvent8()) continue;

            // Event "M.Barrier_Downstream_TLs_East_Actuator_c_g".
            if (execEvent9()) continue;

            // Event "M.Barrier_Downstream_TLs_East_Actuator_c_r".
            if (execEvent10()) continue;

            // Event "M.Barrier_Downstream_TLs_East_SensorG_u_off".
            if (execEvent11()) continue;

            // Event "M.Barrier_Downstream_TLs_East_SensorG_u_on".
            if (execEvent12()) continue;

            // Event "M.Barrier_Downstream_TLs_East_SensorR_u_off".
            if (execEvent13()) continue;

            // Event "M.Barrier_Downstream_TLs_East_SensorR_u_on".
            if (execEvent14()) continue;

            // Event "M.Barrier_Downstream_TLs_West_Actuator_c_g".
            if (execEvent15()) continue;

            // Event "M.Barrier_Downstream_TLs_West_Actuator_c_r".
            if (execEvent16()) continue;

            // Event "M.Barrier_Downstream_TLs_West_SensorG_u_off".
            if (execEvent17()) continue;

            // Event "M.Barrier_Downstream_TLs_West_SensorG_u_on".
            if (execEvent18()) continue;

            // Event "M.Barrier_Downstream_TLs_West_SensorR_u_off".
            if (execEvent19()) continue;

            // Event "M.Barrier_Downstream_TLs_West_SensorR_u_on".
            if (execEvent20()) continue;

            // Event "M.Barrier_Upstream_TLs_East_Actuator_c_g".
            if (execEvent21()) continue;

            // Event "M.Barrier_Upstream_TLs_East_Actuator_c_r".
            if (execEvent22()) continue;

            // Event "M.Barrier_Upstream_TLs_East_SensorG_u_off".
            if (execEvent23()) continue;

            // Event "M.Barrier_Upstream_TLs_East_SensorG_u_on".
            if (execEvent24()) continue;

            // Event "M.Barrier_Upstream_TLs_East_SensorR_u_off".
            if (execEvent25()) continue;

            // Event "M.Barrier_Upstream_TLs_East_SensorR_u_on".
            if (execEvent26()) continue;

            // Event "M.Barrier_Upstream_TLs_West_Actuator_c_g".
            if (execEvent27()) continue;

            // Event "M.Barrier_Upstream_TLs_West_Actuator_c_r".
            if (execEvent28()) continue;

            // Event "M.Barrier_Upstream_TLs_West_SensorG_u_off".
            if (execEvent29()) continue;

            // Event "M.Barrier_Upstream_TLs_West_SensorG_u_on".
            if (execEvent30()) continue;

            // Event "M.Barrier_Upstream_TLs_West_SensorR_u_off".
            if (execEvent31()) continue;

            // Event "M.Barrier_Upstream_TLs_West_SensorR_u_on".
            if (execEvent32()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_Actuator_c_g".
            if (execEvent33()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_Actuator_c_r".
            if (execEvent34()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_Actuator_c_rg".
            if (execEvent35()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_Actuator_c_rr".
            if (execEvent36()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorG_u_off".
            if (execEvent37()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorG_u_on".
            if (execEvent38()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorR1_u_off".
            if (execEvent39()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorR1_u_on".
            if (execEvent40()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorR2_u_off".
            if (execEvent41()) continue;

            // Event "M.North_Downstream_EnteringTLs_East_SensorR2_u_on".
            if (execEvent42()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_Actuator_c_g".
            if (execEvent43()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_Actuator_c_r".
            if (execEvent44()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_Actuator_c_rg".
            if (execEvent45()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_Actuator_c_rr".
            if (execEvent46()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorG_u_off".
            if (execEvent47()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorG_u_on".
            if (execEvent48()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorR1_u_off".
            if (execEvent49()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorR1_u_on".
            if (execEvent50()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorR2_u_off".
            if (execEvent51()) continue;

            // Event "M.North_Downstream_EnteringTLs_West_SensorR2_u_on".
            if (execEvent52()) continue;

            // Event "M.North_Downstream_EqualWaterSensor_u_off".
            if (execEvent53()) continue;

            // Event "M.North_Downstream_EqualWaterSensor_u_on".
            if (execEvent54()) continue;

            // Event "M.North_Downstream_Gates_East_Actuator_c_close".
            if (execEvent55()) continue;

            // Event "M.North_Downstream_Gates_East_Actuator_c_emergencyStop".
            if (execEvent56()) continue;

            // Event "M.North_Downstream_Gates_East_Actuator_c_endStopClosing".
            if (execEvent57()) continue;

            // Event "M.North_Downstream_Gates_East_Actuator_c_endStopOpening".
            if (execEvent58()) continue;

            // Event "M.North_Downstream_Gates_East_Actuator_c_open".
            if (execEvent59()) continue;

            // Event "M.North_Downstream_Gates_East_Sensor_u_closed_off".
            if (execEvent60()) continue;

            // Event "M.North_Downstream_Gates_East_Sensor_u_closed_on".
            if (execEvent61()) continue;

            // Event "M.North_Downstream_Gates_East_Sensor_u_open_off".
            if (execEvent62()) continue;

            // Event "M.North_Downstream_Gates_East_Sensor_u_open_on".
            if (execEvent63()) continue;

            // Event "M.North_Downstream_Gates_West_Actuator_c_close".
            if (execEvent64()) continue;

            // Event "M.North_Downstream_Gates_West_Actuator_c_emergencyStop".
            if (execEvent65()) continue;

            // Event "M.North_Downstream_Gates_West_Actuator_c_endStopClosing".
            if (execEvent66()) continue;

            // Event "M.North_Downstream_Gates_West_Actuator_c_endStopOpening".
            if (execEvent67()) continue;

            // Event "M.North_Downstream_Gates_West_Actuator_c_open".
            if (execEvent68()) continue;

            // Event "M.North_Downstream_Gates_West_Sensor_u_closed_off".
            if (execEvent69()) continue;

            // Event "M.North_Downstream_Gates_West_Sensor_u_closed_on".
            if (execEvent70()) continue;

            // Event "M.North_Downstream_Gates_West_Sensor_u_open_off".
            if (execEvent71()) continue;

            // Event "M.North_Downstream_Gates_West_Sensor_u_open_on".
            if (execEvent72()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_Actuator_c_g".
            if (execEvent73()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_Actuator_c_r".
            if (execEvent74()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_SensorG_u_off".
            if (execEvent75()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_SensorG_u_on".
            if (execEvent76()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_SensorR_u_off".
            if (execEvent77()) continue;

            // Event "M.North_Downstream_LeavingTLs_East_SensorR_u_on".
            if (execEvent78()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_Actuator_c_g".
            if (execEvent79()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_Actuator_c_r".
            if (execEvent80()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_SensorG_u_off".
            if (execEvent81()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_SensorG_u_on".
            if (execEvent82()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_SensorR_u_off".
            if (execEvent83()) continue;

            // Event "M.North_Downstream_LeavingTLs_West_SensorR_u_on".
            if (execEvent84()) continue;

            // Event "M.North_Downstream_Paddles_East_Actuator_c_close".
            if (execEvent85()) continue;

            // Event "M.North_Downstream_Paddles_East_Actuator_c_emergencyStop".
            if (execEvent86()) continue;

            // Event "M.North_Downstream_Paddles_East_Actuator_c_endStopClosing".
            if (execEvent87()) continue;

            // Event "M.North_Downstream_Paddles_East_Actuator_c_endStopOpening".
            if (execEvent88()) continue;

            // Event "M.North_Downstream_Paddles_East_Actuator_c_open".
            if (execEvent89()) continue;

            // Event "M.North_Downstream_Paddles_East_Sensor_u_closed_off".
            if (execEvent90()) continue;

            // Event "M.North_Downstream_Paddles_East_Sensor_u_closed_on".
            if (execEvent91()) continue;

            // Event "M.North_Downstream_Paddles_East_Sensor_u_open_off".
            if (execEvent92()) continue;

            // Event "M.North_Downstream_Paddles_East_Sensor_u_open_on".
            if (execEvent93()) continue;

            // Event "M.North_Downstream_Paddles_West_Actuator_c_close".
            if (execEvent94()) continue;

            // Event "M.North_Downstream_Paddles_West_Actuator_c_emergencyStop".
            if (execEvent95()) continue;

            // Event "M.North_Downstream_Paddles_West_Actuator_c_endStopClosing".
            if (execEvent96()) continue;

            // Event "M.North_Downstream_Paddles_West_Actuator_c_endStopOpening".
            if (execEvent97()) continue;

            // Event "M.North_Downstream_Paddles_West_Actuator_c_open".
            if (execEvent98()) continue;

            // Event "M.North_Downstream_Paddles_West_Sensor_u_closed_off".
            if (execEvent99()) continue;

            // Event "M.North_Downstream_Paddles_West_Sensor_u_closed_on".
            if (execEvent100()) continue;

            // Event "M.North_Downstream_Paddles_West_Sensor_u_open_off".
            if (execEvent101()) continue;

            // Event "M.North_Downstream_Paddles_West_Sensor_u_open_on".
            if (execEvent102()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_Actuator_c_g".
            if (execEvent103()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_Actuator_c_r".
            if (execEvent104()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_Actuator_c_rg".
            if (execEvent105()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_Actuator_c_rr".
            if (execEvent106()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorG_u_off".
            if (execEvent107()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorG_u_on".
            if (execEvent108()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorR1_u_off".
            if (execEvent109()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorR1_u_on".
            if (execEvent110()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorR2_u_off".
            if (execEvent111()) continue;

            // Event "M.North_Upstream_EnteringTLs_East_SensorR2_u_on".
            if (execEvent112()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_Actuator_c_g".
            if (execEvent113()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_Actuator_c_r".
            if (execEvent114()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_Actuator_c_rg".
            if (execEvent115()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_Actuator_c_rr".
            if (execEvent116()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorG_u_off".
            if (execEvent117()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorG_u_on".
            if (execEvent118()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorR1_u_off".
            if (execEvent119()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorR1_u_on".
            if (execEvent120()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorR2_u_off".
            if (execEvent121()) continue;

            // Event "M.North_Upstream_EnteringTLs_West_SensorR2_u_on".
            if (execEvent122()) continue;

            // Event "M.North_Upstream_EqualWaterSensor_u_off".
            if (execEvent123()) continue;

            // Event "M.North_Upstream_EqualWaterSensor_u_on".
            if (execEvent124()) continue;

            // Event "M.North_Upstream_Gates_East_Actuator_c_close".
            if (execEvent125()) continue;

            // Event "M.North_Upstream_Gates_East_Actuator_c_emergencyStop".
            if (execEvent126()) continue;

            // Event "M.North_Upstream_Gates_East_Actuator_c_endStopClosing".
            if (execEvent127()) continue;

            // Event "M.North_Upstream_Gates_East_Actuator_c_endStopOpening".
            if (execEvent128()) continue;

            // Event "M.North_Upstream_Gates_East_Actuator_c_open".
            if (execEvent129()) continue;

            // Event "M.North_Upstream_Gates_East_Sensor_u_closed_off".
            if (execEvent130()) continue;

            // Event "M.North_Upstream_Gates_East_Sensor_u_closed_on".
            if (execEvent131()) continue;

            // Event "M.North_Upstream_Gates_East_Sensor_u_open_off".
            if (execEvent132()) continue;

            // Event "M.North_Upstream_Gates_East_Sensor_u_open_on".
            if (execEvent133()) continue;

            // Event "M.North_Upstream_Gates_West_Actuator_c_close".
            if (execEvent134()) continue;

            // Event "M.North_Upstream_Gates_West_Actuator_c_emergencyStop".
            if (execEvent135()) continue;

            // Event "M.North_Upstream_Gates_West_Actuator_c_endStopClosing".
            if (execEvent136()) continue;

            // Event "M.North_Upstream_Gates_West_Actuator_c_endStopOpening".
            if (execEvent137()) continue;

            // Event "M.North_Upstream_Gates_West_Actuator_c_open".
            if (execEvent138()) continue;

            // Event "M.North_Upstream_Gates_West_Sensor_u_closed_off".
            if (execEvent139()) continue;

            // Event "M.North_Upstream_Gates_West_Sensor_u_closed_on".
            if (execEvent140()) continue;

            // Event "M.North_Upstream_Gates_West_Sensor_u_open_off".
            if (execEvent141()) continue;

            // Event "M.North_Upstream_Gates_West_Sensor_u_open_on".
            if (execEvent142()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_Actuator_c_g".
            if (execEvent143()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_Actuator_c_r".
            if (execEvent144()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_SensorG_u_off".
            if (execEvent145()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_SensorG_u_on".
            if (execEvent146()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_SensorR_u_off".
            if (execEvent147()) continue;

            // Event "M.North_Upstream_LeavingTLs_East_SensorR_u_on".
            if (execEvent148()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_Actuator_c_g".
            if (execEvent149()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_Actuator_c_r".
            if (execEvent150()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_SensorG_u_off".
            if (execEvent151()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_SensorG_u_on".
            if (execEvent152()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_SensorR_u_off".
            if (execEvent153()) continue;

            // Event "M.North_Upstream_LeavingTLs_West_SensorR_u_on".
            if (execEvent154()) continue;

            // Event "M.North_Upstream_Paddles_East_Actuator_c_close".
            if (execEvent155()) continue;

            // Event "M.North_Upstream_Paddles_East_Actuator_c_emergencyStop".
            if (execEvent156()) continue;

            // Event "M.North_Upstream_Paddles_East_Actuator_c_endStopClosing".
            if (execEvent157()) continue;

            // Event "M.North_Upstream_Paddles_East_Actuator_c_endStopOpening".
            if (execEvent158()) continue;

            // Event "M.North_Upstream_Paddles_East_Actuator_c_open".
            if (execEvent159()) continue;

            // Event "M.North_Upstream_Paddles_East_Sensor_u_closed_off".
            if (execEvent160()) continue;

            // Event "M.North_Upstream_Paddles_East_Sensor_u_closed_on".
            if (execEvent161()) continue;

            // Event "M.North_Upstream_Paddles_East_Sensor_u_open_off".
            if (execEvent162()) continue;

            // Event "M.North_Upstream_Paddles_East_Sensor_u_open_on".
            if (execEvent163()) continue;

            // Event "M.North_Upstream_Paddles_West_Actuator_c_close".
            if (execEvent164()) continue;

            // Event "M.North_Upstream_Paddles_West_Actuator_c_emergencyStop".
            if (execEvent165()) continue;

            // Event "M.North_Upstream_Paddles_West_Actuator_c_endStopClosing".
            if (execEvent166()) continue;

            // Event "M.North_Upstream_Paddles_West_Actuator_c_endStopOpening".
            if (execEvent167()) continue;

            // Event "M.North_Upstream_Paddles_West_Actuator_c_open".
            if (execEvent168()) continue;

            // Event "M.North_Upstream_Paddles_West_Sensor_u_closed_off".
            if (execEvent169()) continue;

            // Event "M.North_Upstream_Paddles_West_Sensor_u_closed_on".
            if (execEvent170()) continue;

            // Event "M.North_Upstream_Paddles_West_Sensor_u_open_off".
            if (execEvent171()) continue;

            // Event "M.North_Upstream_Paddles_West_Sensor_u_open_on".
            if (execEvent172()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_Actuator_c_g".
            if (execEvent173()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_Actuator_c_r".
            if (execEvent174()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_Actuator_c_rg".
            if (execEvent175()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_Actuator_c_rr".
            if (execEvent176()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorG_u_off".
            if (execEvent177()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorG_u_on".
            if (execEvent178()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorR1_u_off".
            if (execEvent179()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorR1_u_on".
            if (execEvent180()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorR2_u_off".
            if (execEvent181()) continue;

            // Event "M.South_Downstream_EnteringTLs_East_SensorR2_u_on".
            if (execEvent182()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_Actuator_c_g".
            if (execEvent183()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_Actuator_c_r".
            if (execEvent184()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_Actuator_c_rg".
            if (execEvent185()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_Actuator_c_rr".
            if (execEvent186()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorG_u_off".
            if (execEvent187()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorG_u_on".
            if (execEvent188()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorR1_u_off".
            if (execEvent189()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorR1_u_on".
            if (execEvent190()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorR2_u_off".
            if (execEvent191()) continue;

            // Event "M.South_Downstream_EnteringTLs_West_SensorR2_u_on".
            if (execEvent192()) continue;

            // Event "M.South_Downstream_EqualWaterSensor_u_off".
            if (execEvent193()) continue;

            // Event "M.South_Downstream_EqualWaterSensor_u_on".
            if (execEvent194()) continue;

            // Event "M.South_Downstream_Gates_East_Actuator_c_close".
            if (execEvent195()) continue;

            // Event "M.South_Downstream_Gates_East_Actuator_c_emergencyStop".
            if (execEvent196()) continue;

            // Event "M.South_Downstream_Gates_East_Actuator_c_endStopClosing".
            if (execEvent197()) continue;

            // Event "M.South_Downstream_Gates_East_Actuator_c_endStopOpening".
            if (execEvent198()) continue;

            // Event "M.South_Downstream_Gates_East_Actuator_c_open".
            if (execEvent199()) continue;

            // Event "M.South_Downstream_Gates_East_Sensor_u_closed_off".
            if (execEvent200()) continue;

            // Event "M.South_Downstream_Gates_East_Sensor_u_closed_on".
            if (execEvent201()) continue;

            // Event "M.South_Downstream_Gates_East_Sensor_u_open_off".
            if (execEvent202()) continue;

            // Event "M.South_Downstream_Gates_East_Sensor_u_open_on".
            if (execEvent203()) continue;

            // Event "M.South_Downstream_Gates_West_Actuator_c_close".
            if (execEvent204()) continue;

            // Event "M.South_Downstream_Gates_West_Actuator_c_emergencyStop".
            if (execEvent205()) continue;

            // Event "M.South_Downstream_Gates_West_Actuator_c_endStopClosing".
            if (execEvent206()) continue;

            // Event "M.South_Downstream_Gates_West_Actuator_c_endStopOpening".
            if (execEvent207()) continue;

            // Event "M.South_Downstream_Gates_West_Actuator_c_open".
            if (execEvent208()) continue;

            // Event "M.South_Downstream_Gates_West_Sensor_u_closed_off".
            if (execEvent209()) continue;

            // Event "M.South_Downstream_Gates_West_Sensor_u_closed_on".
            if (execEvent210()) continue;

            // Event "M.South_Downstream_Gates_West_Sensor_u_open_off".
            if (execEvent211()) continue;

            // Event "M.South_Downstream_Gates_West_Sensor_u_open_on".
            if (execEvent212()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_Actuator_c_g".
            if (execEvent213()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_Actuator_c_r".
            if (execEvent214()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_SensorG_u_off".
            if (execEvent215()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_SensorG_u_on".
            if (execEvent216()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_SensorR_u_off".
            if (execEvent217()) continue;

            // Event "M.South_Downstream_LeavingTLs_East_SensorR_u_on".
            if (execEvent218()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_Actuator_c_g".
            if (execEvent219()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_Actuator_c_r".
            if (execEvent220()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_SensorG_u_off".
            if (execEvent221()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_SensorG_u_on".
            if (execEvent222()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_SensorR_u_off".
            if (execEvent223()) continue;

            // Event "M.South_Downstream_LeavingTLs_West_SensorR_u_on".
            if (execEvent224()) continue;

            // Event "M.South_Downstream_Paddles_East_Actuator_c_close".
            if (execEvent225()) continue;

            // Event "M.South_Downstream_Paddles_East_Actuator_c_emergencyStop".
            if (execEvent226()) continue;

            // Event "M.South_Downstream_Paddles_East_Actuator_c_endStopClosing".
            if (execEvent227()) continue;

            // Event "M.South_Downstream_Paddles_East_Actuator_c_endStopOpening".
            if (execEvent228()) continue;

            // Event "M.South_Downstream_Paddles_East_Actuator_c_open".
            if (execEvent229()) continue;

            // Event "M.South_Downstream_Paddles_East_Sensor_u_closed_off".
            if (execEvent230()) continue;

            // Event "M.South_Downstream_Paddles_East_Sensor_u_closed_on".
            if (execEvent231()) continue;

            // Event "M.South_Downstream_Paddles_East_Sensor_u_open_off".
            if (execEvent232()) continue;

            // Event "M.South_Downstream_Paddles_East_Sensor_u_open_on".
            if (execEvent233()) continue;

            // Event "M.South_Downstream_Paddles_West_Actuator_c_close".
            if (execEvent234()) continue;

            // Event "M.South_Downstream_Paddles_West_Actuator_c_emergencyStop".
            if (execEvent235()) continue;

            // Event "M.South_Downstream_Paddles_West_Actuator_c_endStopClosing".
            if (execEvent236()) continue;

            // Event "M.South_Downstream_Paddles_West_Actuator_c_endStopOpening".
            if (execEvent237()) continue;

            // Event "M.South_Downstream_Paddles_West_Actuator_c_open".
            if (execEvent238()) continue;

            // Event "M.South_Downstream_Paddles_West_Sensor_u_closed_off".
            if (execEvent239()) continue;

            // Event "M.South_Downstream_Paddles_West_Sensor_u_closed_on".
            if (execEvent240()) continue;

            // Event "M.South_Downstream_Paddles_West_Sensor_u_open_off".
            if (execEvent241()) continue;

            // Event "M.South_Downstream_Paddles_West_Sensor_u_open_on".
            if (execEvent242()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_Actuator_c_g".
            if (execEvent243()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_Actuator_c_r".
            if (execEvent244()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_Actuator_c_rg".
            if (execEvent245()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_Actuator_c_rr".
            if (execEvent246()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorG_u_off".
            if (execEvent247()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorG_u_on".
            if (execEvent248()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorR1_u_off".
            if (execEvent249()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorR1_u_on".
            if (execEvent250()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorR2_u_off".
            if (execEvent251()) continue;

            // Event "M.South_Upstream_EnteringTLs_East_SensorR2_u_on".
            if (execEvent252()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_Actuator_c_g".
            if (execEvent253()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_Actuator_c_r".
            if (execEvent254()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_Actuator_c_rg".
            if (execEvent255()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_Actuator_c_rr".
            if (execEvent256()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorG_u_off".
            if (execEvent257()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorG_u_on".
            if (execEvent258()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorR1_u_off".
            if (execEvent259()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorR1_u_on".
            if (execEvent260()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorR2_u_off".
            if (execEvent261()) continue;

            // Event "M.South_Upstream_EnteringTLs_West_SensorR2_u_on".
            if (execEvent262()) continue;

            // Event "M.South_Upstream_EqualWaterSensor_u_off".
            if (execEvent263()) continue;

            // Event "M.South_Upstream_EqualWaterSensor_u_on".
            if (execEvent264()) continue;

            // Event "M.South_Upstream_Gates_East_Actuator_c_close".
            if (execEvent265()) continue;

            // Event "M.South_Upstream_Gates_East_Actuator_c_emergencyStop".
            if (execEvent266()) continue;

            // Event "M.South_Upstream_Gates_East_Actuator_c_endStopClosing".
            if (execEvent267()) continue;

            // Event "M.South_Upstream_Gates_East_Actuator_c_endStopOpening".
            if (execEvent268()) continue;

            // Event "M.South_Upstream_Gates_East_Actuator_c_open".
            if (execEvent269()) continue;

            // Event "M.South_Upstream_Gates_East_Sensor_u_closed_off".
            if (execEvent270()) continue;

            // Event "M.South_Upstream_Gates_East_Sensor_u_closed_on".
            if (execEvent271()) continue;

            // Event "M.South_Upstream_Gates_East_Sensor_u_open_off".
            if (execEvent272()) continue;

            // Event "M.South_Upstream_Gates_East_Sensor_u_open_on".
            if (execEvent273()) continue;

            // Event "M.South_Upstream_Gates_West_Actuator_c_close".
            if (execEvent274()) continue;

            // Event "M.South_Upstream_Gates_West_Actuator_c_emergencyStop".
            if (execEvent275()) continue;

            // Event "M.South_Upstream_Gates_West_Actuator_c_endStopClosing".
            if (execEvent276()) continue;

            // Event "M.South_Upstream_Gates_West_Actuator_c_endStopOpening".
            if (execEvent277()) continue;

            // Event "M.South_Upstream_Gates_West_Actuator_c_open".
            if (execEvent278()) continue;

            // Event "M.South_Upstream_Gates_West_Sensor_u_closed_off".
            if (execEvent279()) continue;

            // Event "M.South_Upstream_Gates_West_Sensor_u_closed_on".
            if (execEvent280()) continue;

            // Event "M.South_Upstream_Gates_West_Sensor_u_open_off".
            if (execEvent281()) continue;

            // Event "M.South_Upstream_Gates_West_Sensor_u_open_on".
            if (execEvent282()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_Actuator_c_g".
            if (execEvent283()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_Actuator_c_r".
            if (execEvent284()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_SensorG_u_off".
            if (execEvent285()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_SensorG_u_on".
            if (execEvent286()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_SensorR_u_off".
            if (execEvent287()) continue;

            // Event "M.South_Upstream_LeavingTLs_East_SensorR_u_on".
            if (execEvent288()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_Actuator_c_g".
            if (execEvent289()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_Actuator_c_r".
            if (execEvent290()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_SensorG_u_off".
            if (execEvent291()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_SensorG_u_on".
            if (execEvent292()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_SensorR_u_off".
            if (execEvent293()) continue;

            // Event "M.South_Upstream_LeavingTLs_West_SensorR_u_on".
            if (execEvent294()) continue;

            // Event "M.South_Upstream_Paddles_East_Actuator_c_close".
            if (execEvent295()) continue;

            // Event "M.South_Upstream_Paddles_East_Actuator_c_emergencyStop".
            if (execEvent296()) continue;

            // Event "M.South_Upstream_Paddles_East_Actuator_c_endStopClosing".
            if (execEvent297()) continue;

            // Event "M.South_Upstream_Paddles_East_Actuator_c_endStopOpening".
            if (execEvent298()) continue;

            // Event "M.South_Upstream_Paddles_East_Actuator_c_open".
            if (execEvent299()) continue;

            // Event "M.South_Upstream_Paddles_East_Sensor_u_closed_off".
            if (execEvent300()) continue;

            // Event "M.South_Upstream_Paddles_East_Sensor_u_closed_on".
            if (execEvent301()) continue;

            // Event "M.South_Upstream_Paddles_East_Sensor_u_open_off".
            if (execEvent302()) continue;

            // Event "M.South_Upstream_Paddles_East_Sensor_u_open_on".
            if (execEvent303()) continue;

            // Event "M.South_Upstream_Paddles_West_Actuator_c_close".
            if (execEvent304()) continue;

            // Event "M.South_Upstream_Paddles_West_Actuator_c_emergencyStop".
            if (execEvent305()) continue;

            // Event "M.South_Upstream_Paddles_West_Actuator_c_endStopClosing".
            if (execEvent306()) continue;

            // Event "M.South_Upstream_Paddles_West_Actuator_c_endStopOpening".
            if (execEvent307()) continue;

            // Event "M.South_Upstream_Paddles_West_Actuator_c_open".
            if (execEvent308()) continue;

            // Event "M.South_Upstream_Paddles_West_Sensor_u_closed_off".
            if (execEvent309()) continue;

            // Event "M.South_Upstream_Paddles_West_Sensor_u_closed_on".
            if (execEvent310()) continue;

            // Event "M.South_Upstream_Paddles_West_Sensor_u_open_off".
            if (execEvent311()) continue;

            // Event "M.South_Upstream_Paddles_West_Sensor_u_open_on".
            if (execEvent312()) continue;

            // Event "M.Wh_high".
            if (execEvent313()) continue;

            // Event "M.Wh_low".
            if (execEvent314()) continue;

            break;
        }
        if (i == 100) infoPrintOutput("Loop Killed",":stderr");

        // Apply print declarations for 'pre' of time transition.
        if (doInfoPrintOutput) printOutput(-2, true);

        // Post execution notification.
        postExec();

        // Done.
        firstExec = false;
    }

    /**
     * Repeatedly {@link #execOnce executes the code}.
     *
     * @param frequency The frequency in times per second, that the code should
     *      be executed (if positive), or execute as fast as possible, that is
     *      as many times per second as possible (if negative or zero).
     * @throws c2jException In case of a runtime error caused by code
     *      generated from the CIF model.
     */
    public void execInfinite(long frequency) {
        // Initialize.
        boolean first = true;
        long cycleNano = (frequency <= 0) ? -1 : 1000 * 1000 * 1000 / frequency;
        long startNano = System.nanoTime();
        long targetNano = startNano;

        // Execute repeatedly.
        while (true) {
            // Pre execution timing.
            long preNano = first ? startNano : System.nanoTime();
            first = false;
            long timeNano = preNano - startNano;
            double time = timeNano / 1e9;

            // Execute once.
            execOnce(time);

            // Post execution timing.
            long postNano = System.nanoTime();
            long duration = postNano - preNano;
            if (doInfoExec) infoExec(duration, cycleNano);

            // Ensure frequency.
            if (frequency > 0) {
                targetNano += cycleNano;
                if (postNano < targetNano) {
                    try {
                        long remainderNano = targetNano - postNano;
                        long remainderMilli = remainderNano / 1000 / 1000;
                        Thread.sleep(remainderMilli);

                    } catch (InterruptedException ex) {
                        throw new RuntimeException("Thread interrupted.", ex);
                    }
                }
            }
        }
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent0() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Rest)) && (equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(1, true);
        if (doInfoEvent) infoEvent(1, true);

        M_Barrier_Barrier_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(1, false);
        if (doInfoPrintOutput) printOutput(1, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent1() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Opening)) || (equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Close_, false)) && (equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(2, true);
        if (doInfoEvent) infoEvent(2, true);

        if (equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Opening)) {
            M_Barrier_Barrier_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Closing)) {
            M_Barrier_Barrier_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(2, false);
        if (doInfoPrintOutput) printOutput(2, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent2() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Closing)) && (equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(3, true);
        if (doInfoEvent) infoEvent(3, true);

        M_Barrier_Barrier_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(3, false);
        if (doInfoPrintOutput) printOutput(3, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent3() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Opening)) && (equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(4, true);
        if (doInfoEvent) infoEvent(4, true);

        M_Barrier_Barrier_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(4, false);
        if (doInfoPrintOutput) printOutput(4, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent4() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Rest)) && (equalObjs(M_Barrier_HW_Barrier_BVH_East_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(0, true);
        if (doInfoEvent) infoEvent(0, true);

        M_Barrier_Barrier_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(0, false);
        if (doInfoPrintOutput) printOutput(0, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent5() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((Barrier_Barrier_Degree_) < (90.0)) && (equalObjs(M_Barrier_Barrier_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(8, true);
        if (doInfoEvent) infoEvent(8, true);

        M_Barrier_Barrier_Sensor_ = c2jEnum._Intermediate;
        M_Barrier_HW_Barrier_BVH_East_Closed_ = false;

        if (doInfoEvent) infoEvent(8, false);
        if (doInfoPrintOutput) printOutput(8, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent6() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((Barrier_Barrier_Degree_) <= (0.0)) && (equalObjs(M_Barrier_Barrier_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(7, true);
        if (doInfoEvent) infoEvent(7, true);

        M_Barrier_Barrier_Sensor_ = c2jEnum._Closed;
        M_Barrier_HW_Barrier_BVH_East_Closed_ = true;

        if (doInfoEvent) infoEvent(7, false);
        if (doInfoPrintOutput) printOutput(7, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent7() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((Barrier_Barrier_Degree_) > (0.0)) && (equalObjs(M_Barrier_Barrier_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(6, true);
        if (doInfoEvent) infoEvent(6, true);

        M_Barrier_Barrier_Sensor_ = c2jEnum._Intermediate;
        M_Barrier_HW_Barrier_BVH_East_Open_ = false;

        if (doInfoEvent) infoEvent(6, false);
        if (doInfoPrintOutput) printOutput(6, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Barrier_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent8() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((Barrier_Barrier_Degree_) >= (90.0)) && (equalObjs(M_Barrier_Barrier_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(5, true);
        if (doInfoEvent) infoEvent(5, true);

        M_Barrier_Barrier_Sensor_ = c2jEnum._Open;
        M_Barrier_HW_Barrier_BVH_East_Open_ = true;

        if (doInfoEvent) infoEvent(5, false);
        if (doInfoPrintOutput) printOutput(5, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent9() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Red))) && ((equalObjs(M_Barrier_HW_TL_BNH_East_Q_Red_, false)) && (equalObjs(M_Barrier_HW_TL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(10, true);
        if (doInfoEvent) infoEvent(10, true);

        M_Barrier_Downstream_TLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(10, false);
        if (doInfoPrintOutput) printOutput(10, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent10() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Green))) && ((equalObjs(M_Barrier_HW_TL_BNH_East_Q_Red_, true)) && (equalObjs(M_Barrier_HW_TL_BNH_East_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(9, true);
        if (doInfoEvent) infoEvent(9, true);

        M_Barrier_Downstream_TLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(9, false);
        if (doInfoPrintOutput) printOutput(9, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent11() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Downstream_TLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(12, true);
        if (doInfoEvent) infoEvent(12, true);

        M_Barrier_Downstream_TLs_East_SensorG_ = c2jEnum._Off;
        M_Barrier_HW_TL_BNH_East_Green_ = false;

        if (doInfoEvent) infoEvent(12, false);
        if (doInfoPrintOutput) printOutput(12, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent12() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Downstream_TLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(11, true);
        if (doInfoEvent) infoEvent(11, true);

        M_Barrier_Downstream_TLs_East_SensorG_ = c2jEnum._On;
        M_Barrier_HW_TL_BNH_East_Green_ = true;

        if (doInfoEvent) infoEvent(11, false);
        if (doInfoPrintOutput) printOutput(11, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent13() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Downstream_TLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(14, true);
        if (doInfoEvent) infoEvent(14, true);

        M_Barrier_Downstream_TLs_East_SensorR_ = c2jEnum._Off;
        M_Barrier_HW_TL_BNH_East_Red_ = false;

        if (doInfoEvent) infoEvent(14, false);
        if (doInfoPrintOutput) printOutput(14, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent14() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Downstream_TLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Downstream_TLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(13, true);
        if (doInfoEvent) infoEvent(13, true);

        M_Barrier_Downstream_TLs_East_SensorR_ = c2jEnum._On;
        M_Barrier_HW_TL_BNH_East_Red_ = true;

        if (doInfoEvent) infoEvent(13, false);
        if (doInfoPrintOutput) printOutput(13, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent15() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Red))) && ((equalObjs(M_Barrier_HW_TL_BNH_West_Q_Red_, false)) && (equalObjs(M_Barrier_HW_TL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(16, true);
        if (doInfoEvent) infoEvent(16, true);

        M_Barrier_Downstream_TLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(16, false);
        if (doInfoPrintOutput) printOutput(16, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent16() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Green))) && ((equalObjs(M_Barrier_HW_TL_BNH_West_Q_Red_, true)) && (equalObjs(M_Barrier_HW_TL_BNH_West_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(15, true);
        if (doInfoEvent) infoEvent(15, true);

        M_Barrier_Downstream_TLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(15, false);
        if (doInfoPrintOutput) printOutput(15, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent17() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Downstream_TLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(18, true);
        if (doInfoEvent) infoEvent(18, true);

        M_Barrier_Downstream_TLs_West_SensorG_ = c2jEnum._Off;
        M_Barrier_HW_TL_BNH_West_Green_ = false;

        if (doInfoEvent) infoEvent(18, false);
        if (doInfoPrintOutput) printOutput(18, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent18() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Downstream_TLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(17, true);
        if (doInfoEvent) infoEvent(17, true);

        M_Barrier_Downstream_TLs_West_SensorG_ = c2jEnum._On;
        M_Barrier_HW_TL_BNH_West_Green_ = true;

        if (doInfoEvent) infoEvent(17, false);
        if (doInfoPrintOutput) printOutput(17, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent19() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Downstream_TLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(20, true);
        if (doInfoEvent) infoEvent(20, true);

        M_Barrier_Downstream_TLs_West_SensorR_ = c2jEnum._Off;
        M_Barrier_HW_TL_BNH_West_Red_ = false;

        if (doInfoEvent) infoEvent(20, false);
        if (doInfoPrintOutput) printOutput(20, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Downstream_TLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent20() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Downstream_TLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Downstream_TLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(19, true);
        if (doInfoEvent) infoEvent(19, true);

        M_Barrier_Downstream_TLs_West_SensorR_ = c2jEnum._On;
        M_Barrier_HW_TL_BNH_West_Red_ = true;

        if (doInfoEvent) infoEvent(19, false);
        if (doInfoPrintOutput) printOutput(19, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent21() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_HW_TL_BVH_East_Q_Red_, false))) && ((equalObjs(M_Barrier_HW_TL_BVH_East_Q_Green_, true)) && (equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(22, true);
        if (doInfoEvent) infoEvent(22, true);

        M_Barrier_Upstream_TLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(22, false);
        if (doInfoPrintOutput) printOutput(22, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent22() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_HW_TL_BVH_East_Q_Red_, true))) && ((equalObjs(M_Barrier_HW_TL_BVH_East_Q_Green_, false)) && (equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(21, true);
        if (doInfoEvent) infoEvent(21, true);

        M_Barrier_Upstream_TLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(21, false);
        if (doInfoPrintOutput) printOutput(21, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent23() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Upstream_TLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(24, true);
        if (doInfoEvent) infoEvent(24, true);

        M_Barrier_HW_TL_BVH_East_Green_ = false;
        M_Barrier_Upstream_TLs_East_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(24, false);
        if (doInfoPrintOutput) printOutput(24, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent24() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Upstream_TLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(23, true);
        if (doInfoEvent) infoEvent(23, true);

        M_Barrier_HW_TL_BVH_East_Green_ = true;
        M_Barrier_Upstream_TLs_East_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(23, false);
        if (doInfoPrintOutput) printOutput(23, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent25() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Upstream_TLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(26, true);
        if (doInfoEvent) infoEvent(26, true);

        M_Barrier_HW_TL_BVH_East_Red_ = false;
        M_Barrier_Upstream_TLs_East_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(26, false);
        if (doInfoPrintOutput) printOutput(26, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent26() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Upstream_TLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Upstream_TLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(25, true);
        if (doInfoEvent) infoEvent(25, true);

        M_Barrier_HW_TL_BVH_East_Red_ = true;
        M_Barrier_Upstream_TLs_East_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(25, false);
        if (doInfoPrintOutput) printOutput(25, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent27() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_HW_TL_BVH_West_Q_Red_, false))) && ((equalObjs(M_Barrier_HW_TL_BVH_West_Q_Green_, true)) && (equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(28, true);
        if (doInfoEvent) infoEvent(28, true);

        M_Barrier_Upstream_TLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(28, false);
        if (doInfoPrintOutput) printOutput(28, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent28() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_Barrier_HW_TL_BVH_West_Q_Red_, true))) && ((equalObjs(M_Barrier_HW_TL_BVH_West_Q_Green_, false)) && (equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(27, true);
        if (doInfoEvent) infoEvent(27, true);

        M_Barrier_Upstream_TLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(27, false);
        if (doInfoPrintOutput) printOutput(27, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent29() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Upstream_TLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(30, true);
        if (doInfoEvent) infoEvent(30, true);

        M_Barrier_HW_TL_BVH_West_Green_ = false;
        M_Barrier_Upstream_TLs_West_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(30, false);
        if (doInfoPrintOutput) printOutput(30, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent30() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_Barrier_Upstream_TLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(29, true);
        if (doInfoEvent) infoEvent(29, true);

        M_Barrier_HW_TL_BVH_West_Green_ = true;
        M_Barrier_Upstream_TLs_West_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(29, false);
        if (doInfoPrintOutput) printOutput(29, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent31() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Upstream_TLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(32, true);
        if (doInfoEvent) infoEvent(32, true);

        M_Barrier_HW_TL_BVH_West_Red_ = false;
        M_Barrier_Upstream_TLs_West_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(32, false);
        if (doInfoPrintOutput) printOutput(32, false);
        return true;
    }

    /**
     * Execute code for event "M.Barrier_Upstream_TLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent32() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_Barrier_Upstream_TLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_Barrier_Upstream_TLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(31, true);
        if (doInfoEvent) infoEvent(31, true);

        M_Barrier_HW_TL_BVH_West_Red_ = true;
        M_Barrier_Upstream_TLs_West_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(31, false);
        if (doInfoPrintOutput) printOutput(31, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent33() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) && (equalObjs(M_North_HW_EnteringTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(36, true);
        if (doInfoEvent) infoEvent(36, true);

        M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(36, false);
        if (doInfoPrintOutput) printOutput(36, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent34() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green))))) && ((equalObjs(M_North_HW_EnteringTL_BNH_East_Q_Red_, true)) && ((equalObjs(M_North_HW_EnteringTL_BNH_East_Q_Green_, false)) && (equalObjs(M_North_HW_EnteringTL_BNH_East_Q_RedRed_, false))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(33, true);
        if (doInfoEvent) infoEvent(33, true);

        if (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) {
            M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) {
            M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) {
            M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(33, false);
        if (doInfoPrintOutput) printOutput(33, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent35() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red))) && ((equalObjs(M_North_HW_EnteringTL_BNH_East_Q_Red_, true)) && (equalObjs(M_North_HW_EnteringTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(35, true);
        if (doInfoEvent) infoEvent(35, true);

        M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(35, false);
        if (doInfoPrintOutput) printOutput(35, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent36() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_HW_EnteringTL_BNH_East_Q_RedRed_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(34, true);
        if (doInfoEvent) infoEvent(34, true);

        M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(34, false);
        if (doInfoPrintOutput) printOutput(34, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent37() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) || (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(38, true);
        if (doInfoEvent) infoEvent(38, true);

        M_North_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_East_Green_ = false;

        if (doInfoEvent) infoEvent(38, false);
        if (doInfoPrintOutput) printOutput(38, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent38() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) || (equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(37, true);
        if (doInfoEvent) infoEvent(37, true);

        M_North_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_East_Green_ = true;

        if (doInfoEvent) infoEvent(37, false);
        if (doInfoPrintOutput) printOutput(37, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent39() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(40, true);
        if (doInfoEvent) infoEvent(40, true);

        M_North_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_East_Red_ = false;

        if (doInfoEvent) infoEvent(40, false);
        if (doInfoPrintOutput) printOutput(40, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent40() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(39, true);
        if (doInfoEvent) infoEvent(39, true);

        M_North_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_East_Red_ = true;

        if (doInfoEvent) infoEvent(39, false);
        if (doInfoPrintOutput) printOutput(39, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent41() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(42, true);
        if (doInfoEvent) infoEvent(42, true);

        M_North_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_East_RedRed_ = false;

        if (doInfoEvent) infoEvent(42, false);
        if (doInfoPrintOutput) printOutput(42, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_East_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent42() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Downstream_EnteringTLs_East_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(41, true);
        if (doInfoEvent) infoEvent(41, true);

        M_North_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_East_RedRed_ = true;

        if (doInfoEvent) infoEvent(41, false);
        if (doInfoPrintOutput) printOutput(41, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent43() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) && (equalObjs(M_North_HW_EnteringTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(46, true);
        if (doInfoEvent) infoEvent(46, true);

        M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(46, false);
        if (doInfoPrintOutput) printOutput(46, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent44() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green))))) && ((equalObjs(M_North_HW_EnteringTL_BNH_West_Q_Red_, true)) && ((equalObjs(M_North_HW_EnteringTL_BNH_West_Q_Green_, false)) && (equalObjs(M_North_HW_EnteringTL_BNH_West_Q_RedRed_, false))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(43, true);
        if (doInfoEvent) infoEvent(43, true);

        if (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) {
            M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) {
            M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) {
            M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(43, false);
        if (doInfoPrintOutput) printOutput(43, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent45() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red))) && ((equalObjs(M_North_HW_EnteringTL_BNH_West_Q_Red_, true)) && (equalObjs(M_North_HW_EnteringTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(45, true);
        if (doInfoEvent) infoEvent(45, true);

        M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(45, false);
        if (doInfoPrintOutput) printOutput(45, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent46() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_HW_EnteringTL_BNH_West_Q_RedRed_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(44, true);
        if (doInfoEvent) infoEvent(44, true);

        M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(44, false);
        if (doInfoPrintOutput) printOutput(44, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent47() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) || (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(48, true);
        if (doInfoEvent) infoEvent(48, true);

        M_North_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_West_Green_ = false;

        if (doInfoEvent) infoEvent(48, false);
        if (doInfoPrintOutput) printOutput(48, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent48() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) || (equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(47, true);
        if (doInfoEvent) infoEvent(47, true);

        M_North_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_West_Green_ = true;

        if (doInfoEvent) infoEvent(47, false);
        if (doInfoPrintOutput) printOutput(47, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent49() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(50, true);
        if (doInfoEvent) infoEvent(50, true);

        M_North_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_West_Red_ = false;

        if (doInfoEvent) infoEvent(50, false);
        if (doInfoPrintOutput) printOutput(50, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent50() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(49, true);
        if (doInfoEvent) infoEvent(49, true);

        M_North_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_West_Red_ = true;

        if (doInfoEvent) infoEvent(49, false);
        if (doInfoPrintOutput) printOutput(49, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent51() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(52, true);
        if (doInfoEvent) infoEvent(52, true);

        M_North_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_North_HW_EnteringTL_BNH_West_RedRed_ = false;

        if (doInfoEvent) infoEvent(52, false);
        if (doInfoPrintOutput) printOutput(52, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EnteringTLs_West_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent52() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Downstream_EnteringTLs_West_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(51, true);
        if (doInfoEvent) infoEvent(51, true);

        M_North_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._On;
        M_North_HW_EnteringTL_BNH_West_RedRed_ = true;

        if (doInfoEvent) infoEvent(51, false);
        if (doInfoPrintOutput) printOutput(51, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EqualWaterSensor_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent53() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EqualWaterSensor_, c2jEnum._Equal)) && ((North_Water_H_Chamber_) > (4.6)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(54, true);
        if (doInfoEvent) infoEvent(54, true);

        M_North_Downstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_North_HW_EqualWaterSensor_BNH_Equal_ = false;

        if (doInfoEvent) infoEvent(54, false);
        if (doInfoPrintOutput) printOutput(54, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_EqualWaterSensor_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent54() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_EqualWaterSensor_, c2jEnum._Unequal)) && ((North_Water_H_Chamber_) <= (4.6)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(53, true);
        if (doInfoEvent) infoEvent(53, true);

        M_North_Downstream_EqualWaterSensor_ = c2jEnum._Equal;
        M_North_HW_EqualWaterSensor_BNH_Equal_ = true;

        if (doInfoEvent) infoEvent(53, false);
        if (doInfoPrintOutput) printOutput(53, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent55() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Gate_BNH_East_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(56, true);
        if (doInfoEvent) infoEvent(56, true);

        M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(56, false);
        if (doInfoPrintOutput) printOutput(56, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent56() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_North_HW_Gate_BNH_East_Q_Close_, false)) && (equalObjs(M_North_HW_Gate_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(57, true);
        if (doInfoEvent) infoEvent(57, true);

        if (equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) {
            M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) {
            M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(57, false);
        if (doInfoPrintOutput) printOutput(57, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent57() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) && (equalObjs(M_North_HW_Gate_BNH_East_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(58, true);
        if (doInfoEvent) infoEvent(58, true);

        M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(58, false);
        if (doInfoPrintOutput) printOutput(58, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent58() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) && (equalObjs(M_North_HW_Gate_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(59, true);
        if (doInfoEvent) infoEvent(59, true);

        M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(59, false);
        if (doInfoPrintOutput) printOutput(59, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent59() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Gate_BNH_East_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(55, true);
        if (doInfoEvent) infoEvent(55, true);

        M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(55, false);
        if (doInfoPrintOutput) printOutput(55, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent60() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_East_Degree_) < (90.0)) && (equalObjs(M_North_Downstream_Gates_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(63, true);
        if (doInfoEvent) infoEvent(63, true);

        M_North_Downstream_Gates_East_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Gate_BNH_East_Closed_ = false;

        if (doInfoEvent) infoEvent(63, false);
        if (doInfoPrintOutput) printOutput(63, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent61() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_East_Degree_) <= (0.0)) && (equalObjs(M_North_Downstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(62, true);
        if (doInfoEvent) infoEvent(62, true);

        M_North_Downstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_North_HW_Gate_BNH_East_Closed_ = true;

        if (doInfoEvent) infoEvent(62, false);
        if (doInfoPrintOutput) printOutput(62, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent62() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_East_Degree_) > (0.0)) && (equalObjs(M_North_Downstream_Gates_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(61, true);
        if (doInfoEvent) infoEvent(61, true);

        M_North_Downstream_Gates_East_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Gate_BNH_East_Open_ = false;

        if (doInfoEvent) infoEvent(61, false);
        if (doInfoPrintOutput) printOutput(61, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent63() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_East_Degree_) >= (90.0)) && (equalObjs(M_North_Downstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(60, true);
        if (doInfoEvent) infoEvent(60, true);

        M_North_Downstream_Gates_East_Sensor_ = c2jEnum._Open;
        M_North_HW_Gate_BNH_East_Open_ = true;

        if (doInfoEvent) infoEvent(60, false);
        if (doInfoPrintOutput) printOutput(60, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent64() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Gate_BNH_West_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(65, true);
        if (doInfoEvent) infoEvent(65, true);

        M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(65, false);
        if (doInfoPrintOutput) printOutput(65, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent65() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_North_HW_Gate_BNH_West_Q_Close_, false)) && (equalObjs(M_North_HW_Gate_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(66, true);
        if (doInfoEvent) infoEvent(66, true);

        if (equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) {
            M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) {
            M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(66, false);
        if (doInfoPrintOutput) printOutput(66, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent66() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) && (equalObjs(M_North_HW_Gate_BNH_West_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(67, true);
        if (doInfoEvent) infoEvent(67, true);

        M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(67, false);
        if (doInfoPrintOutput) printOutput(67, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent67() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) && (equalObjs(M_North_HW_Gate_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(68, true);
        if (doInfoEvent) infoEvent(68, true);

        M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(68, false);
        if (doInfoPrintOutput) printOutput(68, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent68() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Gate_BNH_West_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(64, true);
        if (doInfoEvent) infoEvent(64, true);

        M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(64, false);
        if (doInfoPrintOutput) printOutput(64, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent69() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_West_Degree_) < (90.0)) && (equalObjs(M_North_Downstream_Gates_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(72, true);
        if (doInfoEvent) infoEvent(72, true);

        M_North_Downstream_Gates_West_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Gate_BNH_West_Closed_ = false;

        if (doInfoEvent) infoEvent(72, false);
        if (doInfoPrintOutput) printOutput(72, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent70() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_West_Degree_) <= (0.0)) && (equalObjs(M_North_Downstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(71, true);
        if (doInfoEvent) infoEvent(71, true);

        M_North_Downstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_North_HW_Gate_BNH_West_Closed_ = true;

        if (doInfoEvent) infoEvent(71, false);
        if (doInfoPrintOutput) printOutput(71, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent71() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_West_Degree_) > (0.0)) && (equalObjs(M_North_Downstream_Gates_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(70, true);
        if (doInfoEvent) infoEvent(70, true);

        M_North_Downstream_Gates_West_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Gate_BNH_West_Open_ = false;

        if (doInfoEvent) infoEvent(70, false);
        if (doInfoPrintOutput) printOutput(70, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Gates_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent72() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Gates_West_Degree_) >= (90.0)) && (equalObjs(M_North_Downstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(69, true);
        if (doInfoEvent) infoEvent(69, true);

        M_North_Downstream_Gates_West_Sensor_ = c2jEnum._Open;
        M_North_HW_Gate_BNH_West_Open_ = true;

        if (doInfoEvent) infoEvent(69, false);
        if (doInfoPrintOutput) printOutput(69, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent73() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red))) && ((equalObjs(M_North_HW_LeavingTL_BNH_East_Q_Red_, false)) && (equalObjs(M_North_HW_LeavingTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(74, true);
        if (doInfoEvent) infoEvent(74, true);

        M_North_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(74, false);
        if (doInfoPrintOutput) printOutput(74, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent74() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green))) && ((equalObjs(M_North_HW_LeavingTL_BNH_East_Q_Red_, true)) && (equalObjs(M_North_HW_LeavingTL_BNH_East_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(73, true);
        if (doInfoEvent) infoEvent(73, true);

        M_North_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(73, false);
        if (doInfoPrintOutput) printOutput(73, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent75() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Downstream_LeavingTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(76, true);
        if (doInfoEvent) infoEvent(76, true);

        M_North_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_North_HW_LeavingTL_BNH_East_Green_ = false;

        if (doInfoEvent) infoEvent(76, false);
        if (doInfoPrintOutput) printOutput(76, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent76() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Downstream_LeavingTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(75, true);
        if (doInfoEvent) infoEvent(75, true);

        M_North_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._On;
        M_North_HW_LeavingTL_BNH_East_Green_ = true;

        if (doInfoEvent) infoEvent(75, false);
        if (doInfoPrintOutput) printOutput(75, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent77() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_LeavingTLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(78, true);
        if (doInfoEvent) infoEvent(78, true);

        M_North_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._Off;
        M_North_HW_LeavingTL_BNH_East_Red_ = false;

        if (doInfoEvent) infoEvent(78, false);
        if (doInfoPrintOutput) printOutput(78, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent78() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_LeavingTLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(77, true);
        if (doInfoEvent) infoEvent(77, true);

        M_North_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_North_HW_LeavingTL_BNH_East_Red_ = true;

        if (doInfoEvent) infoEvent(77, false);
        if (doInfoPrintOutput) printOutput(77, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent79() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red))) && ((equalObjs(M_North_HW_LeavingTL_BNH_West_Q_Red_, false)) && (equalObjs(M_North_HW_LeavingTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(80, true);
        if (doInfoEvent) infoEvent(80, true);

        M_North_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(80, false);
        if (doInfoPrintOutput) printOutput(80, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent80() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green))) && ((equalObjs(M_North_HW_LeavingTL_BNH_West_Q_Red_, true)) && (equalObjs(M_North_HW_LeavingTL_BNH_West_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(79, true);
        if (doInfoEvent) infoEvent(79, true);

        M_North_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(79, false);
        if (doInfoPrintOutput) printOutput(79, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent81() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Downstream_LeavingTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(82, true);
        if (doInfoEvent) infoEvent(82, true);

        M_North_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_North_HW_LeavingTL_BNH_West_Green_ = false;

        if (doInfoEvent) infoEvent(82, false);
        if (doInfoPrintOutput) printOutput(82, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent82() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Downstream_LeavingTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(81, true);
        if (doInfoEvent) infoEvent(81, true);

        M_North_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._On;
        M_North_HW_LeavingTL_BNH_West_Green_ = true;

        if (doInfoEvent) infoEvent(81, false);
        if (doInfoPrintOutput) printOutput(81, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent83() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_LeavingTLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(84, true);
        if (doInfoEvent) infoEvent(84, true);

        M_North_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._Off;
        M_North_HW_LeavingTL_BNH_West_Red_ = false;

        if (doInfoEvent) infoEvent(84, false);
        if (doInfoPrintOutput) printOutput(84, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_LeavingTLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent84() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Downstream_LeavingTLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(83, true);
        if (doInfoEvent) infoEvent(83, true);

        M_North_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_North_HW_LeavingTL_BNH_West_Red_ = true;

        if (doInfoEvent) infoEvent(83, false);
        if (doInfoPrintOutput) printOutput(83, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent85() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Paddle_BNH_East_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(86, true);
        if (doInfoEvent) infoEvent(86, true);

        M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(86, false);
        if (doInfoPrintOutput) printOutput(86, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent86() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_North_HW_Paddle_BNH_East_Q_Close_, false)) && (equalObjs(M_North_HW_Paddle_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(87, true);
        if (doInfoEvent) infoEvent(87, true);

        if (equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) {
            M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) {
            M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(87, false);
        if (doInfoPrintOutput) printOutput(87, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent87() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) && (equalObjs(M_North_HW_Paddle_BNH_East_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(88, true);
        if (doInfoEvent) infoEvent(88, true);

        M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(88, false);
        if (doInfoPrintOutput) printOutput(88, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent88() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) && (equalObjs(M_North_HW_Paddle_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(89, true);
        if (doInfoEvent) infoEvent(89, true);

        M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(89, false);
        if (doInfoPrintOutput) printOutput(89, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent89() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Paddle_BNH_East_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(85, true);
        if (doInfoEvent) infoEvent(85, true);

        M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(85, false);
        if (doInfoPrintOutput) printOutput(85, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent90() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_East_Degree_) < (90.0)) && (equalObjs(M_North_Downstream_Paddles_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(93, true);
        if (doInfoEvent) infoEvent(93, true);

        M_North_Downstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Paddle_BNH_East_Closed_ = false;

        if (doInfoEvent) infoEvent(93, false);
        if (doInfoPrintOutput) printOutput(93, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent91() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_East_Degree_) <= (0.0)) && (equalObjs(M_North_Downstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(92, true);
        if (doInfoEvent) infoEvent(92, true);

        M_North_Downstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_North_HW_Paddle_BNH_East_Closed_ = true;

        if (doInfoEvent) infoEvent(92, false);
        if (doInfoPrintOutput) printOutput(92, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent92() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_East_Degree_) > (0.0)) && (equalObjs(M_North_Downstream_Paddles_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(91, true);
        if (doInfoEvent) infoEvent(91, true);

        M_North_Downstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Paddle_BNH_East_Open_ = false;

        if (doInfoEvent) infoEvent(91, false);
        if (doInfoPrintOutput) printOutput(91, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent93() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_East_Degree_) >= (90.0)) && (equalObjs(M_North_Downstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(90, true);
        if (doInfoEvent) infoEvent(90, true);

        M_North_Downstream_Paddles_East_Sensor_ = c2jEnum._Open;
        M_North_HW_Paddle_BNH_East_Open_ = true;

        if (doInfoEvent) infoEvent(90, false);
        if (doInfoPrintOutput) printOutput(90, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent94() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Paddle_BNH_West_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(95, true);
        if (doInfoEvent) infoEvent(95, true);

        M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(95, false);
        if (doInfoPrintOutput) printOutput(95, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent95() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_North_HW_Paddle_BNH_West_Q_Close_, false)) && (equalObjs(M_North_HW_Paddle_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(96, true);
        if (doInfoEvent) infoEvent(96, true);

        if (equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) {
            M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) {
            M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(96, false);
        if (doInfoPrintOutput) printOutput(96, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent96() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) && (equalObjs(M_North_HW_Paddle_BNH_West_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(97, true);
        if (doInfoEvent) infoEvent(97, true);

        M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(97, false);
        if (doInfoPrintOutput) printOutput(97, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent97() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) && (equalObjs(M_North_HW_Paddle_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(98, true);
        if (doInfoEvent) infoEvent(98, true);

        M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(98, false);
        if (doInfoPrintOutput) printOutput(98, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent98() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_North_HW_Paddle_BNH_West_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(94, true);
        if (doInfoEvent) infoEvent(94, true);

        M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(94, false);
        if (doInfoPrintOutput) printOutput(94, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent99() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_West_Degree_) < (90.0)) && (equalObjs(M_North_Downstream_Paddles_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(102, true);
        if (doInfoEvent) infoEvent(102, true);

        M_North_Downstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Paddle_BNH_West_Closed_ = false;

        if (doInfoEvent) infoEvent(102, false);
        if (doInfoPrintOutput) printOutput(102, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent100() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_West_Degree_) <= (0.0)) && (equalObjs(M_North_Downstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(101, true);
        if (doInfoEvent) infoEvent(101, true);

        M_North_Downstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_North_HW_Paddle_BNH_West_Closed_ = true;

        if (doInfoEvent) infoEvent(101, false);
        if (doInfoPrintOutput) printOutput(101, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent101() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_West_Degree_) > (0.0)) && (equalObjs(M_North_Downstream_Paddles_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(100, true);
        if (doInfoEvent) infoEvent(100, true);

        M_North_Downstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;
        M_North_HW_Paddle_BNH_West_Open_ = false;

        if (doInfoEvent) infoEvent(100, false);
        if (doInfoPrintOutput) printOutput(100, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Downstream_Paddles_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent102() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Downstream_Paddles_West_Degree_) >= (90.0)) && (equalObjs(M_North_Downstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(99, true);
        if (doInfoEvent) infoEvent(99, true);

        M_North_Downstream_Paddles_West_Sensor_ = c2jEnum._Open;
        M_North_HW_Paddle_BNH_West_Open_ = true;

        if (doInfoEvent) infoEvent(99, false);
        if (doInfoPrintOutput) printOutput(99, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent103() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_EnteringTL_BVH_East_Q_Green_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(106, true);
        if (doInfoEvent) infoEvent(106, true);

        M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(106, false);
        if (doInfoPrintOutput) printOutput(106, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent104() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_EnteringTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_North_HW_EnteringTL_BVH_East_Q_Green_, false)) && ((equalObjs(M_North_HW_EnteringTL_BVH_East_Q_RedRed_, false)) && ((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green))))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(103, true);
        if (doInfoEvent) infoEvent(103, true);

        if (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) {
            M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) {
            M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) {
            M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(103, false);
        if (doInfoPrintOutput) printOutput(103, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent105() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_EnteringTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_North_HW_EnteringTL_BVH_East_Q_Green_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(105, true);
        if (doInfoEvent) infoEvent(105, true);

        M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(105, false);
        if (doInfoPrintOutput) printOutput(105, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent106() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_EnteringTL_BVH_East_Q_RedRed_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(104, true);
        if (doInfoEvent) infoEvent(104, true);

        M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(104, false);
        if (doInfoPrintOutput) printOutput(104, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent107() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) || (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(108, true);
        if (doInfoEvent) infoEvent(108, true);

        M_North_HW_EnteringTL_BVH_East_Green_ = false;
        M_North_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(108, false);
        if (doInfoPrintOutput) printOutput(108, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent108() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) || (equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(107, true);
        if (doInfoEvent) infoEvent(107, true);

        M_North_HW_EnteringTL_BVH_East_Green_ = true;
        M_North_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(107, false);
        if (doInfoPrintOutput) printOutput(107, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent109() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(110, true);
        if (doInfoEvent) infoEvent(110, true);

        M_North_HW_EnteringTL_BVH_East_Red_ = false;
        M_North_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(110, false);
        if (doInfoPrintOutput) printOutput(110, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent110() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(109, true);
        if (doInfoEvent) infoEvent(109, true);

        M_North_HW_EnteringTL_BVH_East_Red_ = true;
        M_North_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(109, false);
        if (doInfoPrintOutput) printOutput(109, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent111() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(112, true);
        if (doInfoEvent) infoEvent(112, true);

        M_North_HW_EnteringTL_BVH_East_RedRed_ = false;
        M_North_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(112, false);
        if (doInfoPrintOutput) printOutput(112, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_East_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent112() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Upstream_EnteringTLs_East_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(111, true);
        if (doInfoEvent) infoEvent(111, true);

        M_North_HW_EnteringTL_BVH_East_RedRed_ = true;
        M_North_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(111, false);
        if (doInfoPrintOutput) printOutput(111, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent113() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_EnteringTL_BVH_West_Q_Green_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(116, true);
        if (doInfoEvent) infoEvent(116, true);

        M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(116, false);
        if (doInfoPrintOutput) printOutput(116, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent114() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_EnteringTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_North_HW_EnteringTL_BVH_West_Q_Green_, false)) && ((equalObjs(M_North_HW_EnteringTL_BVH_West_Q_RedRed_, false)) && ((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green))))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(113, true);
        if (doInfoEvent) infoEvent(113, true);

        if (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) {
            M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) {
            M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) {
            M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(113, false);
        if (doInfoPrintOutput) printOutput(113, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent115() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_EnteringTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_North_HW_EnteringTL_BVH_West_Q_Green_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(115, true);
        if (doInfoEvent) infoEvent(115, true);

        M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(115, false);
        if (doInfoPrintOutput) printOutput(115, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent116() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_EnteringTL_BVH_West_Q_RedRed_, true)) && (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(114, true);
        if (doInfoEvent) infoEvent(114, true);

        M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(114, false);
        if (doInfoPrintOutput) printOutput(114, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent117() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) || (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(118, true);
        if (doInfoEvent) infoEvent(118, true);

        M_North_HW_EnteringTL_BVH_West_Green_ = false;
        M_North_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(118, false);
        if (doInfoPrintOutput) printOutput(118, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent118() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) || (equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(117, true);
        if (doInfoEvent) infoEvent(117, true);

        M_North_HW_EnteringTL_BVH_West_Green_ = true;
        M_North_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(117, false);
        if (doInfoPrintOutput) printOutput(117, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent119() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(120, true);
        if (doInfoEvent) infoEvent(120, true);

        M_North_HW_EnteringTL_BVH_West_Red_ = false;
        M_North_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(120, false);
        if (doInfoPrintOutput) printOutput(120, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent120() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(119, true);
        if (doInfoEvent) infoEvent(119, true);

        M_North_HW_EnteringTL_BVH_West_Red_ = true;
        M_North_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(119, false);
        if (doInfoPrintOutput) printOutput(119, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent121() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(122, true);
        if (doInfoEvent) infoEvent(122, true);

        M_North_HW_EnteringTL_BVH_West_RedRed_ = false;
        M_North_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(122, false);
        if (doInfoPrintOutput) printOutput(122, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EnteringTLs_West_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent122() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_North_Upstream_EnteringTLs_West_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(121, true);
        if (doInfoEvent) infoEvent(121, true);

        M_North_HW_EnteringTL_BVH_West_RedRed_ = true;
        M_North_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(121, false);
        if (doInfoPrintOutput) printOutput(121, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EqualWaterSensor_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent123() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EqualWaterSensor_, c2jEnum._Equal)) && ((North_Water_H_Chamber_) < ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(124, true);
        if (doInfoEvent) infoEvent(124, true);

        M_North_HW_EqualWaterSensor_BVH_Equal_ = false;
        M_North_Upstream_EqualWaterSensor_ = c2jEnum._Unequal;

        if (doInfoEvent) infoEvent(124, false);
        if (doInfoPrintOutput) printOutput(124, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_EqualWaterSensor_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent124() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_EqualWaterSensor_, c2jEnum._Unequal)) && ((North_Water_H_Chamber_) >= ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(123, true);
        if (doInfoEvent) infoEvent(123, true);

        M_North_HW_EqualWaterSensor_BVH_Equal_ = true;
        M_North_Upstream_EqualWaterSensor_ = c2jEnum._Equal;

        if (doInfoEvent) infoEvent(123, false);
        if (doInfoPrintOutput) printOutput(123, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent125() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_East_Q_Close_, true)) && (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(126, true);
        if (doInfoEvent) infoEvent(126, true);

        M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(126, false);
        if (doInfoPrintOutput) printOutput(126, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent126() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_Gate_BVH_East_Q_Close_, false))) && ((equalObjs(M_North_HW_Gate_BVH_East_Q_Open_, false)) && ((equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(127, true);
        if (doInfoEvent) infoEvent(127, true);

        if (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) {
            M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Closing)) {
            M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(127, false);
        if (doInfoPrintOutput) printOutput(127, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent127() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_East_Q_Close_, false)) && (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(128, true);
        if (doInfoEvent) infoEvent(128, true);

        M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(128, false);
        if (doInfoPrintOutput) printOutput(128, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent128() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_East_Q_Open_, false)) && (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(129, true);
        if (doInfoEvent) infoEvent(129, true);

        M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(129, false);
        if (doInfoPrintOutput) printOutput(129, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent129() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_East_Q_Open_, true)) && (equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(125, true);
        if (doInfoEvent) infoEvent(125, true);

        M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(125, false);
        if (doInfoPrintOutput) printOutput(125, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent130() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_East_Degree_) < (90.0)) && (equalObjs(M_North_Upstream_Gates_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(133, true);
        if (doInfoEvent) infoEvent(133, true);

        M_North_HW_Gate_BVH_East_Closed_ = false;
        M_North_Upstream_Gates_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(133, false);
        if (doInfoPrintOutput) printOutput(133, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent131() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_East_Degree_) <= (0.0)) && (equalObjs(M_North_Upstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(132, true);
        if (doInfoEvent) infoEvent(132, true);

        M_North_HW_Gate_BVH_East_Closed_ = true;
        M_North_Upstream_Gates_East_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(132, false);
        if (doInfoPrintOutput) printOutput(132, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent132() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_East_Degree_) > (0.0)) && (equalObjs(M_North_Upstream_Gates_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(131, true);
        if (doInfoEvent) infoEvent(131, true);

        M_North_HW_Gate_BVH_East_Open_ = false;
        M_North_Upstream_Gates_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(131, false);
        if (doInfoPrintOutput) printOutput(131, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent133() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_East_Degree_) >= (90.0)) && (equalObjs(M_North_Upstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(130, true);
        if (doInfoEvent) infoEvent(130, true);

        M_North_HW_Gate_BVH_East_Open_ = true;
        M_North_Upstream_Gates_East_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(130, false);
        if (doInfoPrintOutput) printOutput(130, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent134() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_West_Q_Close_, true)) && (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(135, true);
        if (doInfoEvent) infoEvent(135, true);

        M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(135, false);
        if (doInfoPrintOutput) printOutput(135, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent135() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_Gate_BVH_West_Q_Close_, false))) && ((equalObjs(M_North_HW_Gate_BVH_West_Q_Open_, false)) && ((equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(136, true);
        if (doInfoEvent) infoEvent(136, true);

        if (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) {
            M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Closing)) {
            M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(136, false);
        if (doInfoPrintOutput) printOutput(136, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent136() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_West_Q_Close_, false)) && (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(137, true);
        if (doInfoEvent) infoEvent(137, true);

        M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(137, false);
        if (doInfoPrintOutput) printOutput(137, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent137() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_West_Q_Open_, false)) && (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(138, true);
        if (doInfoEvent) infoEvent(138, true);

        M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(138, false);
        if (doInfoPrintOutput) printOutput(138, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent138() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Gate_BVH_West_Q_Open_, true)) && (equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(134, true);
        if (doInfoEvent) infoEvent(134, true);

        M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(134, false);
        if (doInfoPrintOutput) printOutput(134, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent139() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_West_Degree_) < (90.0)) && (equalObjs(M_North_Upstream_Gates_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(142, true);
        if (doInfoEvent) infoEvent(142, true);

        M_North_HW_Gate_BVH_West_Closed_ = false;
        M_North_Upstream_Gates_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(142, false);
        if (doInfoPrintOutput) printOutput(142, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent140() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_West_Degree_) <= (0.0)) && (equalObjs(M_North_Upstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(141, true);
        if (doInfoEvent) infoEvent(141, true);

        M_North_HW_Gate_BVH_West_Closed_ = true;
        M_North_Upstream_Gates_West_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(141, false);
        if (doInfoPrintOutput) printOutput(141, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent141() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_West_Degree_) > (0.0)) && (equalObjs(M_North_Upstream_Gates_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(140, true);
        if (doInfoEvent) infoEvent(140, true);

        M_North_HW_Gate_BVH_West_Open_ = false;
        M_North_Upstream_Gates_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(140, false);
        if (doInfoPrintOutput) printOutput(140, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Gates_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent142() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Gates_West_Degree_) >= (90.0)) && (equalObjs(M_North_Upstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(139, true);
        if (doInfoEvent) infoEvent(139, true);

        M_North_HW_Gate_BVH_West_Open_ = true;
        M_North_Upstream_Gates_West_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(139, false);
        if (doInfoPrintOutput) printOutput(139, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent143() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_LeavingTL_BVH_East_Q_Red_, false))) && ((equalObjs(M_North_HW_LeavingTL_BVH_East_Q_Green_, true)) && (equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(144, true);
        if (doInfoEvent) infoEvent(144, true);

        M_North_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(144, false);
        if (doInfoPrintOutput) printOutput(144, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent144() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_LeavingTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_North_HW_LeavingTL_BVH_East_Q_Green_, false)) && (equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(143, true);
        if (doInfoEvent) infoEvent(143, true);

        M_North_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(143, false);
        if (doInfoPrintOutput) printOutput(143, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent145() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Upstream_LeavingTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(146, true);
        if (doInfoEvent) infoEvent(146, true);

        M_North_HW_LeavingTL_BVH_East_Green_ = false;
        M_North_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(146, false);
        if (doInfoPrintOutput) printOutput(146, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent146() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Upstream_LeavingTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(145, true);
        if (doInfoEvent) infoEvent(145, true);

        M_North_HW_LeavingTL_BVH_East_Green_ = true;
        M_North_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(145, false);
        if (doInfoPrintOutput) printOutput(145, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent147() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_LeavingTLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(148, true);
        if (doInfoEvent) infoEvent(148, true);

        M_North_HW_LeavingTL_BVH_East_Red_ = false;
        M_North_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(148, false);
        if (doInfoPrintOutput) printOutput(148, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent148() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_LeavingTLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(147, true);
        if (doInfoEvent) infoEvent(147, true);

        M_North_HW_LeavingTL_BVH_East_Red_ = true;
        M_North_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(147, false);
        if (doInfoPrintOutput) printOutput(147, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent149() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_LeavingTL_BVH_West_Q_Red_, false))) && ((equalObjs(M_North_HW_LeavingTL_BVH_West_Q_Green_, true)) && (equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(150, true);
        if (doInfoEvent) infoEvent(150, true);

        M_North_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(150, false);
        if (doInfoPrintOutput) printOutput(150, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent150() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_LeavingTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_North_HW_LeavingTL_BVH_West_Q_Green_, false)) && (equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(149, true);
        if (doInfoEvent) infoEvent(149, true);

        M_North_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(149, false);
        if (doInfoPrintOutput) printOutput(149, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent151() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Upstream_LeavingTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(152, true);
        if (doInfoEvent) infoEvent(152, true);

        M_North_HW_LeavingTL_BVH_West_Green_ = false;
        M_North_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(152, false);
        if (doInfoPrintOutput) printOutput(152, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent152() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_North_Upstream_LeavingTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(151, true);
        if (doInfoEvent) infoEvent(151, true);

        M_North_HW_LeavingTL_BVH_West_Green_ = true;
        M_North_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(151, false);
        if (doInfoPrintOutput) printOutput(151, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent153() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_LeavingTLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(154, true);
        if (doInfoEvent) infoEvent(154, true);

        M_North_HW_LeavingTL_BVH_West_Red_ = false;
        M_North_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(154, false);
        if (doInfoPrintOutput) printOutput(154, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_LeavingTLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent154() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_North_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_North_Upstream_LeavingTLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(153, true);
        if (doInfoEvent) infoEvent(153, true);

        M_North_HW_LeavingTL_BVH_West_Red_ = true;
        M_North_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(153, false);
        if (doInfoPrintOutput) printOutput(153, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent155() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_East_Q_Close_, true)) && (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(156, true);
        if (doInfoEvent) infoEvent(156, true);

        M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(156, false);
        if (doInfoPrintOutput) printOutput(156, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent156() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_Paddle_BVH_East_Q_Close_, false))) && ((equalObjs(M_North_HW_Paddle_BVH_East_Q_Open_, false)) && ((equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(157, true);
        if (doInfoEvent) infoEvent(157, true);

        if (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) {
            M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)) {
            M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(157, false);
        if (doInfoPrintOutput) printOutput(157, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent157() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_East_Q_Close_, false)) && (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(158, true);
        if (doInfoEvent) infoEvent(158, true);

        M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(158, false);
        if (doInfoPrintOutput) printOutput(158, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent158() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_East_Q_Open_, false)) && (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(159, true);
        if (doInfoEvent) infoEvent(159, true);

        M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(159, false);
        if (doInfoPrintOutput) printOutput(159, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent159() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_East_Q_Open_, true)) && (equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(155, true);
        if (doInfoEvent) infoEvent(155, true);

        M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(155, false);
        if (doInfoPrintOutput) printOutput(155, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent160() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_East_Degree_) < (90.0)) && (equalObjs(M_North_Upstream_Paddles_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(163, true);
        if (doInfoEvent) infoEvent(163, true);

        M_North_HW_Paddle_BVH_East_Closed_ = false;
        M_North_Upstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(163, false);
        if (doInfoPrintOutput) printOutput(163, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent161() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_East_Degree_) <= (0.0)) && (equalObjs(M_North_Upstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(162, true);
        if (doInfoEvent) infoEvent(162, true);

        M_North_HW_Paddle_BVH_East_Closed_ = true;
        M_North_Upstream_Paddles_East_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(162, false);
        if (doInfoPrintOutput) printOutput(162, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent162() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_East_Degree_) > (0.0)) && (equalObjs(M_North_Upstream_Paddles_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(161, true);
        if (doInfoEvent) infoEvent(161, true);

        M_North_HW_Paddle_BVH_East_Open_ = false;
        M_North_Upstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(161, false);
        if (doInfoPrintOutput) printOutput(161, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent163() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_East_Degree_) >= (90.0)) && (equalObjs(M_North_Upstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(160, true);
        if (doInfoEvent) infoEvent(160, true);

        M_North_HW_Paddle_BVH_East_Open_ = true;
        M_North_Upstream_Paddles_East_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(160, false);
        if (doInfoPrintOutput) printOutput(160, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent164() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_West_Q_Close_, true)) && (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(165, true);
        if (doInfoEvent) infoEvent(165, true);

        M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(165, false);
        if (doInfoPrintOutput) printOutput(165, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent165() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_North_HW_Paddle_BVH_West_Q_Close_, false))) && ((equalObjs(M_North_HW_Paddle_BVH_West_Q_Open_, false)) && ((equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(166, true);
        if (doInfoEvent) infoEvent(166, true);

        if (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) {
            M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)) {
            M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(166, false);
        if (doInfoPrintOutput) printOutput(166, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent166() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_West_Q_Close_, false)) && (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(167, true);
        if (doInfoEvent) infoEvent(167, true);

        M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(167, false);
        if (doInfoPrintOutput) printOutput(167, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent167() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_West_Q_Open_, false)) && (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(168, true);
        if (doInfoEvent) infoEvent(168, true);

        M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(168, false);
        if (doInfoPrintOutput) printOutput(168, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent168() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_North_HW_Paddle_BVH_West_Q_Open_, true)) && (equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(164, true);
        if (doInfoEvent) infoEvent(164, true);

        M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(164, false);
        if (doInfoPrintOutput) printOutput(164, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent169() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_West_Degree_) < (90.0)) && (equalObjs(M_North_Upstream_Paddles_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(172, true);
        if (doInfoEvent) infoEvent(172, true);

        M_North_HW_Paddle_BVH_West_Closed_ = false;
        M_North_Upstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(172, false);
        if (doInfoPrintOutput) printOutput(172, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent170() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_West_Degree_) <= (0.0)) && (equalObjs(M_North_Upstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(171, true);
        if (doInfoEvent) infoEvent(171, true);

        M_North_HW_Paddle_BVH_West_Closed_ = true;
        M_North_Upstream_Paddles_West_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(171, false);
        if (doInfoPrintOutput) printOutput(171, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent171() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_West_Degree_) > (0.0)) && (equalObjs(M_North_Upstream_Paddles_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(170, true);
        if (doInfoEvent) infoEvent(170, true);

        M_North_HW_Paddle_BVH_West_Open_ = false;
        M_North_Upstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(170, false);
        if (doInfoPrintOutput) printOutput(170, false);
        return true;
    }

    /**
     * Execute code for event "M.North_Upstream_Paddles_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent172() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((North_Upstream_Paddles_West_Degree_) >= (90.0)) && (equalObjs(M_North_Upstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(169, true);
        if (doInfoEvent) infoEvent(169, true);

        M_North_HW_Paddle_BVH_West_Open_ = true;
        M_North_Upstream_Paddles_West_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(169, false);
        if (doInfoPrintOutput) printOutput(169, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent173() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) && (equalObjs(M_South_HW_EnteringTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(176, true);
        if (doInfoEvent) infoEvent(176, true);

        M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(176, false);
        if (doInfoPrintOutput) printOutput(176, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent174() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green))))) && ((equalObjs(M_South_HW_EnteringTL_BNH_East_Q_Red_, true)) && ((equalObjs(M_South_HW_EnteringTL_BNH_East_Q_Green_, false)) && (equalObjs(M_South_HW_EnteringTL_BNH_East_Q_RedRed_, false))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(173, true);
        if (doInfoEvent) infoEvent(173, true);

        if (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) {
            M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) {
            M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) {
            M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(173, false);
        if (doInfoPrintOutput) printOutput(173, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent175() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red))) && ((equalObjs(M_South_HW_EnteringTL_BNH_East_Q_Red_, true)) && (equalObjs(M_South_HW_EnteringTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(175, true);
        if (doInfoEvent) infoEvent(175, true);

        M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(175, false);
        if (doInfoPrintOutput) printOutput(175, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent176() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_HW_EnteringTL_BNH_East_Q_RedRed_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(174, true);
        if (doInfoEvent) infoEvent(174, true);

        M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(174, false);
        if (doInfoPrintOutput) printOutput(174, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent177() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) || (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(178, true);
        if (doInfoEvent) infoEvent(178, true);

        M_South_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_East_Green_ = false;

        if (doInfoEvent) infoEvent(178, false);
        if (doInfoPrintOutput) printOutput(178, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent178() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) || (equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(177, true);
        if (doInfoEvent) infoEvent(177, true);

        M_South_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_East_Green_ = true;

        if (doInfoEvent) infoEvent(177, false);
        if (doInfoPrintOutput) printOutput(177, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent179() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(180, true);
        if (doInfoEvent) infoEvent(180, true);

        M_South_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_East_Red_ = false;

        if (doInfoEvent) infoEvent(180, false);
        if (doInfoPrintOutput) printOutput(180, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent180() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(179, true);
        if (doInfoEvent) infoEvent(179, true);

        M_South_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_East_Red_ = true;

        if (doInfoEvent) infoEvent(179, false);
        if (doInfoPrintOutput) printOutput(179, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent181() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(182, true);
        if (doInfoEvent) infoEvent(182, true);

        M_South_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_East_RedRed_ = false;

        if (doInfoEvent) infoEvent(182, false);
        if (doInfoPrintOutput) printOutput(182, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_East_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent182() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Downstream_EnteringTLs_East_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(181, true);
        if (doInfoEvent) infoEvent(181, true);

        M_South_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_East_RedRed_ = true;

        if (doInfoEvent) infoEvent(181, false);
        if (doInfoPrintOutput) printOutput(181, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent183() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) && (equalObjs(M_South_HW_EnteringTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(186, true);
        if (doInfoEvent) infoEvent(186, true);

        M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(186, false);
        if (doInfoPrintOutput) printOutput(186, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent184() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green))))) && ((equalObjs(M_South_HW_EnteringTL_BNH_West_Q_Red_, true)) && ((equalObjs(M_South_HW_EnteringTL_BNH_West_Q_Green_, false)) && (equalObjs(M_South_HW_EnteringTL_BNH_West_Q_RedRed_, false))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(183, true);
        if (doInfoEvent) infoEvent(183, true);

        if (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) {
            M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) {
            M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) {
            M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(183, false);
        if (doInfoPrintOutput) printOutput(183, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent185() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red))) && ((equalObjs(M_South_HW_EnteringTL_BNH_West_Q_Red_, true)) && (equalObjs(M_South_HW_EnteringTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(185, true);
        if (doInfoEvent) infoEvent(185, true);

        M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(185, false);
        if (doInfoPrintOutput) printOutput(185, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent186() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_HW_EnteringTL_BNH_West_Q_RedRed_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(184, true);
        if (doInfoEvent) infoEvent(184, true);

        M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(184, false);
        if (doInfoPrintOutput) printOutput(184, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent187() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) || (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(188, true);
        if (doInfoEvent) infoEvent(188, true);

        M_South_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_West_Green_ = false;

        if (doInfoEvent) infoEvent(188, false);
        if (doInfoPrintOutput) printOutput(188, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent188() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) || (equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(187, true);
        if (doInfoEvent) infoEvent(187, true);

        M_South_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_West_Green_ = true;

        if (doInfoEvent) infoEvent(187, false);
        if (doInfoPrintOutput) printOutput(187, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent189() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(190, true);
        if (doInfoEvent) infoEvent(190, true);

        M_South_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_West_Red_ = false;

        if (doInfoEvent) infoEvent(190, false);
        if (doInfoPrintOutput) printOutput(190, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent190() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(189, true);
        if (doInfoEvent) infoEvent(189, true);

        M_South_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_West_Red_ = true;

        if (doInfoEvent) infoEvent(189, false);
        if (doInfoPrintOutput) printOutput(189, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent191() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(192, true);
        if (doInfoEvent) infoEvent(192, true);

        M_South_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_South_HW_EnteringTL_BNH_West_RedRed_ = false;

        if (doInfoEvent) infoEvent(192, false);
        if (doInfoPrintOutput) printOutput(192, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EnteringTLs_West_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent192() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Downstream_EnteringTLs_West_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(191, true);
        if (doInfoEvent) infoEvent(191, true);

        M_South_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._On;
        M_South_HW_EnteringTL_BNH_West_RedRed_ = true;

        if (doInfoEvent) infoEvent(191, false);
        if (doInfoPrintOutput) printOutput(191, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EqualWaterSensor_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent193() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EqualWaterSensor_, c2jEnum._Equal)) && ((South_Water_H_Chamber_) > (4.6)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(194, true);
        if (doInfoEvent) infoEvent(194, true);

        M_South_Downstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_South_HW_EqualWaterSensor_BNH_Equal_ = false;

        if (doInfoEvent) infoEvent(194, false);
        if (doInfoPrintOutput) printOutput(194, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_EqualWaterSensor_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent194() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_EqualWaterSensor_, c2jEnum._Unequal)) && ((South_Water_H_Chamber_) <= (4.6)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(193, true);
        if (doInfoEvent) infoEvent(193, true);

        M_South_Downstream_EqualWaterSensor_ = c2jEnum._Equal;
        M_South_HW_EqualWaterSensor_BNH_Equal_ = true;

        if (doInfoEvent) infoEvent(193, false);
        if (doInfoPrintOutput) printOutput(193, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent195() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Gate_BNH_East_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(196, true);
        if (doInfoEvent) infoEvent(196, true);

        M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(196, false);
        if (doInfoPrintOutput) printOutput(196, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent196() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_South_HW_Gate_BNH_East_Q_Close_, false)) && (equalObjs(M_South_HW_Gate_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(197, true);
        if (doInfoEvent) infoEvent(197, true);

        if (equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) {
            M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) {
            M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(197, false);
        if (doInfoPrintOutput) printOutput(197, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent197() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) && (equalObjs(M_South_HW_Gate_BNH_East_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(198, true);
        if (doInfoEvent) infoEvent(198, true);

        M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(198, false);
        if (doInfoPrintOutput) printOutput(198, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent198() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) && (equalObjs(M_South_HW_Gate_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(199, true);
        if (doInfoEvent) infoEvent(199, true);

        M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(199, false);
        if (doInfoPrintOutput) printOutput(199, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent199() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Gate_BNH_East_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(195, true);
        if (doInfoEvent) infoEvent(195, true);

        M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(195, false);
        if (doInfoPrintOutput) printOutput(195, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent200() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_East_Degree_) < (90.0)) && (equalObjs(M_South_Downstream_Gates_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(203, true);
        if (doInfoEvent) infoEvent(203, true);

        M_South_Downstream_Gates_East_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Gate_BNH_East_Closed_ = false;

        if (doInfoEvent) infoEvent(203, false);
        if (doInfoPrintOutput) printOutput(203, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent201() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_East_Degree_) <= (0.0)) && (equalObjs(M_South_Downstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(202, true);
        if (doInfoEvent) infoEvent(202, true);

        M_South_Downstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_South_HW_Gate_BNH_East_Closed_ = true;

        if (doInfoEvent) infoEvent(202, false);
        if (doInfoPrintOutput) printOutput(202, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent202() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_East_Degree_) > (0.0)) && (equalObjs(M_South_Downstream_Gates_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(201, true);
        if (doInfoEvent) infoEvent(201, true);

        M_South_Downstream_Gates_East_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Gate_BNH_East_Open_ = false;

        if (doInfoEvent) infoEvent(201, false);
        if (doInfoPrintOutput) printOutput(201, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent203() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_East_Degree_) >= (90.0)) && (equalObjs(M_South_Downstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(200, true);
        if (doInfoEvent) infoEvent(200, true);

        M_South_Downstream_Gates_East_Sensor_ = c2jEnum._Open;
        M_South_HW_Gate_BNH_East_Open_ = true;

        if (doInfoEvent) infoEvent(200, false);
        if (doInfoPrintOutput) printOutput(200, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent204() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Gate_BNH_West_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(205, true);
        if (doInfoEvent) infoEvent(205, true);

        M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(205, false);
        if (doInfoPrintOutput) printOutput(205, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent205() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_South_HW_Gate_BNH_West_Q_Close_, false)) && (equalObjs(M_South_HW_Gate_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(206, true);
        if (doInfoEvent) infoEvent(206, true);

        if (equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) {
            M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) {
            M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(206, false);
        if (doInfoPrintOutput) printOutput(206, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent206() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) && (equalObjs(M_South_HW_Gate_BNH_West_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(207, true);
        if (doInfoEvent) infoEvent(207, true);

        M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(207, false);
        if (doInfoPrintOutput) printOutput(207, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent207() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) && (equalObjs(M_South_HW_Gate_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(208, true);
        if (doInfoEvent) infoEvent(208, true);

        M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(208, false);
        if (doInfoPrintOutput) printOutput(208, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent208() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Gate_BNH_West_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(204, true);
        if (doInfoEvent) infoEvent(204, true);

        M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(204, false);
        if (doInfoPrintOutput) printOutput(204, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent209() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_West_Degree_) < (90.0)) && (equalObjs(M_South_Downstream_Gates_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(212, true);
        if (doInfoEvent) infoEvent(212, true);

        M_South_Downstream_Gates_West_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Gate_BNH_West_Closed_ = false;

        if (doInfoEvent) infoEvent(212, false);
        if (doInfoPrintOutput) printOutput(212, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent210() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_West_Degree_) <= (0.0)) && (equalObjs(M_South_Downstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(211, true);
        if (doInfoEvent) infoEvent(211, true);

        M_South_Downstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_South_HW_Gate_BNH_West_Closed_ = true;

        if (doInfoEvent) infoEvent(211, false);
        if (doInfoPrintOutput) printOutput(211, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent211() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_West_Degree_) > (0.0)) && (equalObjs(M_South_Downstream_Gates_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(210, true);
        if (doInfoEvent) infoEvent(210, true);

        M_South_Downstream_Gates_West_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Gate_BNH_West_Open_ = false;

        if (doInfoEvent) infoEvent(210, false);
        if (doInfoPrintOutput) printOutput(210, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Gates_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent212() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Gates_West_Degree_) >= (90.0)) && (equalObjs(M_South_Downstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(209, true);
        if (doInfoEvent) infoEvent(209, true);

        M_South_Downstream_Gates_West_Sensor_ = c2jEnum._Open;
        M_South_HW_Gate_BNH_West_Open_ = true;

        if (doInfoEvent) infoEvent(209, false);
        if (doInfoPrintOutput) printOutput(209, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent213() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red))) && ((equalObjs(M_South_HW_LeavingTL_BNH_East_Q_Red_, false)) && (equalObjs(M_South_HW_LeavingTL_BNH_East_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(214, true);
        if (doInfoEvent) infoEvent(214, true);

        M_South_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(214, false);
        if (doInfoPrintOutput) printOutput(214, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent214() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green))) && ((equalObjs(M_South_HW_LeavingTL_BNH_East_Q_Red_, true)) && (equalObjs(M_South_HW_LeavingTL_BNH_East_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(213, true);
        if (doInfoEvent) infoEvent(213, true);

        M_South_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(213, false);
        if (doInfoPrintOutput) printOutput(213, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent215() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Downstream_LeavingTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(216, true);
        if (doInfoEvent) infoEvent(216, true);

        M_South_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_South_HW_LeavingTL_BNH_East_Green_ = false;

        if (doInfoEvent) infoEvent(216, false);
        if (doInfoPrintOutput) printOutput(216, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent216() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Downstream_LeavingTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(215, true);
        if (doInfoEvent) infoEvent(215, true);

        M_South_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._On;
        M_South_HW_LeavingTL_BNH_East_Green_ = true;

        if (doInfoEvent) infoEvent(215, false);
        if (doInfoPrintOutput) printOutput(215, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent217() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_LeavingTLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(218, true);
        if (doInfoEvent) infoEvent(218, true);

        M_South_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._Off;
        M_South_HW_LeavingTL_BNH_East_Red_ = false;

        if (doInfoEvent) infoEvent(218, false);
        if (doInfoPrintOutput) printOutput(218, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent218() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_LeavingTLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(217, true);
        if (doInfoEvent) infoEvent(217, true);

        M_South_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_South_HW_LeavingTL_BNH_East_Red_ = true;

        if (doInfoEvent) infoEvent(217, false);
        if (doInfoPrintOutput) printOutput(217, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent219() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red))) && ((equalObjs(M_South_HW_LeavingTL_BNH_West_Q_Red_, false)) && (equalObjs(M_South_HW_LeavingTL_BNH_West_Q_Green_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(220, true);
        if (doInfoEvent) infoEvent(220, true);

        M_South_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(220, false);
        if (doInfoPrintOutput) printOutput(220, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent220() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green))) && ((equalObjs(M_South_HW_LeavingTL_BNH_West_Q_Red_, true)) && (equalObjs(M_South_HW_LeavingTL_BNH_West_Q_Green_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(219, true);
        if (doInfoEvent) infoEvent(219, true);

        M_South_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(219, false);
        if (doInfoPrintOutput) printOutput(219, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent221() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Downstream_LeavingTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(222, true);
        if (doInfoEvent) infoEvent(222, true);

        M_South_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_South_HW_LeavingTL_BNH_West_Green_ = false;

        if (doInfoEvent) infoEvent(222, false);
        if (doInfoPrintOutput) printOutput(222, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent222() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Downstream_LeavingTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(221, true);
        if (doInfoEvent) infoEvent(221, true);

        M_South_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._On;
        M_South_HW_LeavingTL_BNH_West_Green_ = true;

        if (doInfoEvent) infoEvent(221, false);
        if (doInfoPrintOutput) printOutput(221, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent223() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_LeavingTLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(224, true);
        if (doInfoEvent) infoEvent(224, true);

        M_South_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._Off;
        M_South_HW_LeavingTL_BNH_West_Red_ = false;

        if (doInfoEvent) infoEvent(224, false);
        if (doInfoPrintOutput) printOutput(224, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_LeavingTLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent224() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Downstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Downstream_LeavingTLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(223, true);
        if (doInfoEvent) infoEvent(223, true);

        M_South_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_South_HW_LeavingTL_BNH_West_Red_ = true;

        if (doInfoEvent) infoEvent(223, false);
        if (doInfoPrintOutput) printOutput(223, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent225() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Paddle_BNH_East_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(226, true);
        if (doInfoEvent) infoEvent(226, true);

        M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(226, false);
        if (doInfoPrintOutput) printOutput(226, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent226() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_South_HW_Paddle_BNH_East_Q_Close_, false)) && (equalObjs(M_South_HW_Paddle_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(227, true);
        if (doInfoEvent) infoEvent(227, true);

        if (equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) {
            M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) {
            M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(227, false);
        if (doInfoPrintOutput) printOutput(227, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent227() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) && (equalObjs(M_South_HW_Paddle_BNH_East_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(228, true);
        if (doInfoEvent) infoEvent(228, true);

        M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(228, false);
        if (doInfoPrintOutput) printOutput(228, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent228() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) && (equalObjs(M_South_HW_Paddle_BNH_East_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(229, true);
        if (doInfoEvent) infoEvent(229, true);

        M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(229, false);
        if (doInfoPrintOutput) printOutput(229, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent229() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Paddle_BNH_East_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(225, true);
        if (doInfoEvent) infoEvent(225, true);

        M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(225, false);
        if (doInfoPrintOutput) printOutput(225, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent230() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_East_Degree_) < (90.0)) && (equalObjs(M_South_Downstream_Paddles_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(233, true);
        if (doInfoEvent) infoEvent(233, true);

        M_South_Downstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Paddle_BNH_East_Closed_ = false;

        if (doInfoEvent) infoEvent(233, false);
        if (doInfoPrintOutput) printOutput(233, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent231() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_East_Degree_) <= (0.0)) && (equalObjs(M_South_Downstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(232, true);
        if (doInfoEvent) infoEvent(232, true);

        M_South_Downstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_South_HW_Paddle_BNH_East_Closed_ = true;

        if (doInfoEvent) infoEvent(232, false);
        if (doInfoPrintOutput) printOutput(232, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent232() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_East_Degree_) > (0.0)) && (equalObjs(M_South_Downstream_Paddles_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(231, true);
        if (doInfoEvent) infoEvent(231, true);

        M_South_Downstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Paddle_BNH_East_Open_ = false;

        if (doInfoEvent) infoEvent(231, false);
        if (doInfoPrintOutput) printOutput(231, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent233() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_East_Degree_) >= (90.0)) && (equalObjs(M_South_Downstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(230, true);
        if (doInfoEvent) infoEvent(230, true);

        M_South_Downstream_Paddles_East_Sensor_ = c2jEnum._Open;
        M_South_HW_Paddle_BNH_East_Open_ = true;

        if (doInfoEvent) infoEvent(230, false);
        if (doInfoPrintOutput) printOutput(230, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent234() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Paddle_BNH_West_Q_Close_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(235, true);
        if (doInfoEvent) infoEvent(235, true);

        M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(235, false);
        if (doInfoPrintOutput) printOutput(235, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent235() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)))) && ((equalObjs(M_South_HW_Paddle_BNH_West_Q_Close_, false)) && (equalObjs(M_South_HW_Paddle_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(236, true);
        if (doInfoEvent) infoEvent(236, true);

        if (equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) {
            M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) {
            M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(236, false);
        if (doInfoPrintOutput) printOutput(236, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent236() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) && (equalObjs(M_South_HW_Paddle_BNH_West_Q_Close_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(237, true);
        if (doInfoEvent) infoEvent(237, true);

        M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(237, false);
        if (doInfoPrintOutput) printOutput(237, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent237() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) && (equalObjs(M_South_HW_Paddle_BNH_West_Q_Open_, false)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(238, true);
        if (doInfoEvent) infoEvent(238, true);

        M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(238, false);
        if (doInfoPrintOutput) printOutput(238, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent238() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Rest)) && (equalObjs(M_South_HW_Paddle_BNH_West_Q_Open_, true)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(234, true);
        if (doInfoEvent) infoEvent(234, true);

        M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(234, false);
        if (doInfoPrintOutput) printOutput(234, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent239() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_West_Degree_) < (90.0)) && (equalObjs(M_South_Downstream_Paddles_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(242, true);
        if (doInfoEvent) infoEvent(242, true);

        M_South_Downstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Paddle_BNH_West_Closed_ = false;

        if (doInfoEvent) infoEvent(242, false);
        if (doInfoPrintOutput) printOutput(242, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent240() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_West_Degree_) <= (0.0)) && (equalObjs(M_South_Downstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(241, true);
        if (doInfoEvent) infoEvent(241, true);

        M_South_Downstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_South_HW_Paddle_BNH_West_Closed_ = true;

        if (doInfoEvent) infoEvent(241, false);
        if (doInfoPrintOutput) printOutput(241, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent241() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_West_Degree_) > (0.0)) && (equalObjs(M_South_Downstream_Paddles_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(240, true);
        if (doInfoEvent) infoEvent(240, true);

        M_South_Downstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;
        M_South_HW_Paddle_BNH_West_Open_ = false;

        if (doInfoEvent) infoEvent(240, false);
        if (doInfoPrintOutput) printOutput(240, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Downstream_Paddles_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent242() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Downstream_Paddles_West_Degree_) >= (90.0)) && (equalObjs(M_South_Downstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(239, true);
        if (doInfoEvent) infoEvent(239, true);

        M_South_Downstream_Paddles_West_Sensor_ = c2jEnum._Open;
        M_South_HW_Paddle_BNH_West_Open_ = true;

        if (doInfoEvent) infoEvent(239, false);
        if (doInfoPrintOutput) printOutput(239, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent243() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_EnteringTL_BVH_East_Q_Green_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(246, true);
        if (doInfoEvent) infoEvent(246, true);

        M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(246, false);
        if (doInfoPrintOutput) printOutput(246, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent244() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_EnteringTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_South_HW_EnteringTL_BVH_East_Q_Green_, false)) && ((equalObjs(M_South_HW_EnteringTL_BVH_East_Q_RedRed_, false)) && ((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green))))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(243, true);
        if (doInfoEvent) infoEvent(243, true);

        if (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) {
            M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen)) {
            M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) {
            M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(243, false);
        if (doInfoPrintOutput) printOutput(243, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent245() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_EnteringTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_South_HW_EnteringTL_BVH_East_Q_Green_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(245, true);
        if (doInfoEvent) infoEvent(245, true);

        M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(245, false);
        if (doInfoPrintOutput) printOutput(245, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent246() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_EnteringTL_BVH_East_Q_RedRed_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(244, true);
        if (doInfoEvent) infoEvent(244, true);

        M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(244, false);
        if (doInfoPrintOutput) printOutput(244, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent247() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Red)) || (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(248, true);
        if (doInfoEvent) infoEvent(248, true);

        M_South_HW_EnteringTL_BVH_East_Green_ = false;
        M_South_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(248, false);
        if (doInfoPrintOutput) printOutput(248, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent248() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) || (equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(247, true);
        if (doInfoEvent) infoEvent(247, true);

        M_South_HW_EnteringTL_BVH_East_Green_ = true;
        M_South_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(247, false);
        if (doInfoPrintOutput) printOutput(247, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent249() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(250, true);
        if (doInfoEvent) infoEvent(250, true);

        M_South_HW_EnteringTL_BVH_East_Red_ = false;
        M_South_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(250, false);
        if (doInfoPrintOutput) printOutput(250, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent250() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(249, true);
        if (doInfoEvent) infoEvent(249, true);

        M_South_HW_EnteringTL_BVH_East_Red_ = true;
        M_South_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(249, false);
        if (doInfoPrintOutput) printOutput(249, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent251() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(252, true);
        if (doInfoEvent) infoEvent(252, true);

        M_South_HW_EnteringTL_BVH_East_RedRed_ = false;
        M_South_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(252, false);
        if (doInfoPrintOutput) printOutput(252, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_East_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent252() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EnteringTLs_East_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Upstream_EnteringTLs_East_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(251, true);
        if (doInfoEvent) infoEvent(251, true);

        M_South_HW_EnteringTL_BVH_East_RedRed_ = true;
        M_South_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(251, false);
        if (doInfoPrintOutput) printOutput(251, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent253() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_EnteringTL_BVH_West_Q_Green_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(256, true);
        if (doInfoEvent) infoEvent(256, true);

        M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(256, false);
        if (doInfoPrintOutput) printOutput(256, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent254() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_EnteringTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_South_HW_EnteringTL_BVH_West_Q_Green_, false)) && ((equalObjs(M_South_HW_EnteringTL_BVH_West_Q_RedRed_, false)) && ((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) || ((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) || (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green))))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(253, true);
        if (doInfoEvent) infoEvent(253, true);

        if (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) {
            M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen)) {
            M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        } else if (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) {
            M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        }

        if (doInfoEvent) infoEvent(253, false);
        if (doInfoPrintOutput) printOutput(253, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_Actuator_c_rg".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent255() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_EnteringTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_South_HW_EnteringTL_BVH_West_Q_Green_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(255, true);
        if (doInfoEvent) infoEvent(255, true);

        M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._RedGreen;

        if (doInfoEvent) infoEvent(255, false);
        if (doInfoPrintOutput) printOutput(255, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_Actuator_c_rr".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent256() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_EnteringTL_BVH_West_Q_RedRed_, true)) && (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(254, true);
        if (doInfoEvent) infoEvent(254, true);

        M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._RedRed;

        if (doInfoEvent) infoEvent(254, false);
        if (doInfoPrintOutput) printOutput(254, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent257() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Red)) || (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed))) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(258, true);
        if (doInfoEvent) infoEvent(258, true);

        M_South_HW_EnteringTL_BVH_West_Green_ = false;
        M_South_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(258, false);
        if (doInfoPrintOutput) printOutput(258, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent258() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) || (equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedGreen))) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(257, true);
        if (doInfoEvent) infoEvent(257, true);

        M_South_HW_EnteringTL_BVH_West_Green_ = true;
        M_South_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(257, false);
        if (doInfoPrintOutput) printOutput(257, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorR1_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent259() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorR1_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(260, true);
        if (doInfoEvent) infoEvent(260, true);

        M_South_HW_EnteringTL_BVH_West_Red_ = false;
        M_South_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(260, false);
        if (doInfoPrintOutput) printOutput(260, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorR1_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent260() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorR1_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(259, true);
        if (doInfoEvent) infoEvent(259, true);

        M_South_HW_EnteringTL_BVH_West_Red_ = true;
        M_South_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(259, false);
        if (doInfoPrintOutput) printOutput(259, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorR2_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent261() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorR2_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(262, true);
        if (doInfoEvent) infoEvent(262, true);

        M_South_HW_EnteringTL_BVH_West_RedRed_ = false;
        M_South_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(262, false);
        if (doInfoPrintOutput) printOutput(262, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EnteringTLs_West_SensorR2_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent262() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EnteringTLs_West_Actuator_, c2jEnum._RedRed)) && (equalObjs(M_South_Upstream_EnteringTLs_West_SensorR2_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(261, true);
        if (doInfoEvent) infoEvent(261, true);

        M_South_HW_EnteringTL_BVH_West_RedRed_ = true;
        M_South_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(261, false);
        if (doInfoPrintOutput) printOutput(261, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EqualWaterSensor_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent263() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EqualWaterSensor_, c2jEnum._Equal)) && ((South_Water_H_Chamber_) < ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(264, true);
        if (doInfoEvent) infoEvent(264, true);

        M_South_HW_EqualWaterSensor_BVH_Equal_ = false;
        M_South_Upstream_EqualWaterSensor_ = c2jEnum._Unequal;

        if (doInfoEvent) infoEvent(264, false);
        if (doInfoPrintOutput) printOutput(264, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_EqualWaterSensor_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent264() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_EqualWaterSensor_, c2jEnum._Unequal)) && ((South_Water_H_Chamber_) >= ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(263, true);
        if (doInfoEvent) infoEvent(263, true);

        M_South_HW_EqualWaterSensor_BVH_Equal_ = true;
        M_South_Upstream_EqualWaterSensor_ = c2jEnum._Equal;

        if (doInfoEvent) infoEvent(263, false);
        if (doInfoPrintOutput) printOutput(263, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent265() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_East_Q_Close_, true)) && (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(266, true);
        if (doInfoEvent) infoEvent(266, true);

        M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(266, false);
        if (doInfoPrintOutput) printOutput(266, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent266() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_Gate_BVH_East_Q_Close_, false))) && ((equalObjs(M_South_HW_Gate_BVH_East_Q_Open_, false)) && ((equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(267, true);
        if (doInfoEvent) infoEvent(267, true);

        if (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) {
            M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Closing)) {
            M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(267, false);
        if (doInfoPrintOutput) printOutput(267, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent267() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_East_Q_Close_, false)) && (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(268, true);
        if (doInfoEvent) infoEvent(268, true);

        M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(268, false);
        if (doInfoPrintOutput) printOutput(268, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent268() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_East_Q_Open_, false)) && (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(269, true);
        if (doInfoEvent) infoEvent(269, true);

        M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(269, false);
        if (doInfoPrintOutput) printOutput(269, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent269() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_East_Q_Open_, true)) && (equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(265, true);
        if (doInfoEvent) infoEvent(265, true);

        M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(265, false);
        if (doInfoPrintOutput) printOutput(265, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent270() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_East_Degree_) < (90.0)) && (equalObjs(M_South_Upstream_Gates_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(273, true);
        if (doInfoEvent) infoEvent(273, true);

        M_South_HW_Gate_BVH_East_Closed_ = false;
        M_South_Upstream_Gates_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(273, false);
        if (doInfoPrintOutput) printOutput(273, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent271() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_East_Degree_) <= (0.0)) && (equalObjs(M_South_Upstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(272, true);
        if (doInfoEvent) infoEvent(272, true);

        M_South_HW_Gate_BVH_East_Closed_ = true;
        M_South_Upstream_Gates_East_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(272, false);
        if (doInfoPrintOutput) printOutput(272, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent272() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_East_Degree_) > (0.0)) && (equalObjs(M_South_Upstream_Gates_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(271, true);
        if (doInfoEvent) infoEvent(271, true);

        M_South_HW_Gate_BVH_East_Open_ = false;
        M_South_Upstream_Gates_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(271, false);
        if (doInfoPrintOutput) printOutput(271, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent273() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_East_Degree_) >= (90.0)) && (equalObjs(M_South_Upstream_Gates_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(270, true);
        if (doInfoEvent) infoEvent(270, true);

        M_South_HW_Gate_BVH_East_Open_ = true;
        M_South_Upstream_Gates_East_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(270, false);
        if (doInfoPrintOutput) printOutput(270, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent274() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_West_Q_Close_, true)) && (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(275, true);
        if (doInfoEvent) infoEvent(275, true);

        M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(275, false);
        if (doInfoPrintOutput) printOutput(275, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent275() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_Gate_BVH_West_Q_Close_, false))) && ((equalObjs(M_South_HW_Gate_BVH_West_Q_Open_, false)) && ((equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(276, true);
        if (doInfoEvent) infoEvent(276, true);

        if (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) {
            M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Closing)) {
            M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(276, false);
        if (doInfoPrintOutput) printOutput(276, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent276() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_West_Q_Close_, false)) && (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(277, true);
        if (doInfoEvent) infoEvent(277, true);

        M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(277, false);
        if (doInfoPrintOutput) printOutput(277, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent277() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_West_Q_Open_, false)) && (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(278, true);
        if (doInfoEvent) infoEvent(278, true);

        M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(278, false);
        if (doInfoPrintOutput) printOutput(278, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent278() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Gate_BVH_West_Q_Open_, true)) && (equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(274, true);
        if (doInfoEvent) infoEvent(274, true);

        M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(274, false);
        if (doInfoPrintOutput) printOutput(274, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent279() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_West_Degree_) < (90.0)) && (equalObjs(M_South_Upstream_Gates_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(282, true);
        if (doInfoEvent) infoEvent(282, true);

        M_South_HW_Gate_BVH_West_Closed_ = false;
        M_South_Upstream_Gates_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(282, false);
        if (doInfoPrintOutput) printOutput(282, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent280() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_West_Degree_) <= (0.0)) && (equalObjs(M_South_Upstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(281, true);
        if (doInfoEvent) infoEvent(281, true);

        M_South_HW_Gate_BVH_West_Closed_ = true;
        M_South_Upstream_Gates_West_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(281, false);
        if (doInfoPrintOutput) printOutput(281, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent281() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_West_Degree_) > (0.0)) && (equalObjs(M_South_Upstream_Gates_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(280, true);
        if (doInfoEvent) infoEvent(280, true);

        M_South_HW_Gate_BVH_West_Open_ = false;
        M_South_Upstream_Gates_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(280, false);
        if (doInfoPrintOutput) printOutput(280, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Gates_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent282() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Gates_West_Degree_) >= (90.0)) && (equalObjs(M_South_Upstream_Gates_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(279, true);
        if (doInfoEvent) infoEvent(279, true);

        M_South_HW_Gate_BVH_West_Open_ = true;
        M_South_Upstream_Gates_West_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(279, false);
        if (doInfoPrintOutput) printOutput(279, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent283() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_LeavingTL_BVH_East_Q_Red_, false))) && ((equalObjs(M_South_HW_LeavingTL_BVH_East_Q_Green_, true)) && (equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(284, true);
        if (doInfoEvent) infoEvent(284, true);

        M_South_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(284, false);
        if (doInfoPrintOutput) printOutput(284, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent284() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_LeavingTL_BVH_East_Q_Red_, true))) && ((equalObjs(M_South_HW_LeavingTL_BVH_East_Q_Green_, false)) && (equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(283, true);
        if (doInfoEvent) infoEvent(283, true);

        M_South_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(283, false);
        if (doInfoPrintOutput) printOutput(283, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent285() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Upstream_LeavingTLs_East_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(286, true);
        if (doInfoEvent) infoEvent(286, true);

        M_South_HW_LeavingTL_BVH_East_Green_ = false;
        M_South_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(286, false);
        if (doInfoPrintOutput) printOutput(286, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent286() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Upstream_LeavingTLs_East_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(285, true);
        if (doInfoEvent) infoEvent(285, true);

        M_South_HW_LeavingTL_BVH_East_Green_ = true;
        M_South_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(285, false);
        if (doInfoPrintOutput) printOutput(285, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent287() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_LeavingTLs_East_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(288, true);
        if (doInfoEvent) infoEvent(288, true);

        M_South_HW_LeavingTL_BVH_East_Red_ = false;
        M_South_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(288, false);
        if (doInfoPrintOutput) printOutput(288, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_East_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent288() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_LeavingTLs_East_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_LeavingTLs_East_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(287, true);
        if (doInfoEvent) infoEvent(287, true);

        M_South_HW_LeavingTL_BVH_East_Red_ = true;
        M_South_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(287, false);
        if (doInfoPrintOutput) printOutput(287, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_Actuator_c_g".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent289() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_LeavingTL_BVH_West_Q_Red_, false))) && ((equalObjs(M_South_HW_LeavingTL_BVH_West_Q_Green_, true)) && (equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(290, true);
        if (doInfoEvent) infoEvent(290, true);

        M_South_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Green;

        if (doInfoEvent) infoEvent(290, false);
        if (doInfoPrintOutput) printOutput(290, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_Actuator_c_r".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent290() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_LeavingTL_BVH_West_Q_Red_, true))) && ((equalObjs(M_South_HW_LeavingTL_BVH_West_Q_Green_, false)) && (equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(289, true);
        if (doInfoEvent) infoEvent(289, true);

        M_South_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;

        if (doInfoEvent) infoEvent(289, false);
        if (doInfoPrintOutput) printOutput(289, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_SensorG_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent291() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Upstream_LeavingTLs_West_SensorG_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(292, true);
        if (doInfoEvent) infoEvent(292, true);

        M_South_HW_LeavingTL_BVH_West_Green_ = false;
        M_South_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(292, false);
        if (doInfoPrintOutput) printOutput(292, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_SensorG_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent292() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Red)) && (equalObjs(M_South_Upstream_LeavingTLs_West_SensorG_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(291, true);
        if (doInfoEvent) infoEvent(291, true);

        M_South_HW_LeavingTL_BVH_West_Green_ = true;
        M_South_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(291, false);
        if (doInfoPrintOutput) printOutput(291, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_SensorR_u_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent293() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_LeavingTLs_West_SensorR_, c2jEnum._On)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(294, true);
        if (doInfoEvent) infoEvent(294, true);

        M_South_HW_LeavingTL_BVH_West_Red_ = false;
        M_South_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._Off;

        if (doInfoEvent) infoEvent(294, false);
        if (doInfoPrintOutput) printOutput(294, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_LeavingTLs_West_SensorR_u_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent294() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((!equalObjs(M_South_Upstream_LeavingTLs_West_Actuator_, c2jEnum._Green)) && (equalObjs(M_South_Upstream_LeavingTLs_West_SensorR_, c2jEnum._Off)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(293, true);
        if (doInfoEvent) infoEvent(293, true);

        M_South_HW_LeavingTL_BVH_West_Red_ = true;
        M_South_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._On;

        if (doInfoEvent) infoEvent(293, false);
        if (doInfoPrintOutput) printOutput(293, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent295() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_East_Q_Close_, true)) && (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(296, true);
        if (doInfoEvent) infoEvent(296, true);

        M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(296, false);
        if (doInfoPrintOutput) printOutput(296, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent296() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_Paddle_BVH_East_Q_Close_, false))) && ((equalObjs(M_South_HW_Paddle_BVH_East_Q_Open_, false)) && ((equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(297, true);
        if (doInfoEvent) infoEvent(297, true);

        if (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) {
            M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)) {
            M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(297, false);
        if (doInfoPrintOutput) printOutput(297, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent297() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_East_Q_Close_, false)) && (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(298, true);
        if (doInfoEvent) infoEvent(298, true);

        M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(298, false);
        if (doInfoPrintOutput) printOutput(298, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent298() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_East_Q_Open_, false)) && (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(299, true);
        if (doInfoEvent) infoEvent(299, true);

        M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(299, false);
        if (doInfoPrintOutput) printOutput(299, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent299() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_East_Q_Open_, true)) && (equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(295, true);
        if (doInfoEvent) infoEvent(295, true);

        M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(295, false);
        if (doInfoPrintOutput) printOutput(295, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent300() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_East_Degree_) < (90.0)) && (equalObjs(M_South_Upstream_Paddles_East_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(303, true);
        if (doInfoEvent) infoEvent(303, true);

        M_South_HW_Paddle_BVH_East_Closed_ = false;
        M_South_Upstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(303, false);
        if (doInfoPrintOutput) printOutput(303, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent301() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_East_Degree_) <= (0.0)) && (equalObjs(M_South_Upstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(302, true);
        if (doInfoEvent) infoEvent(302, true);

        M_South_HW_Paddle_BVH_East_Closed_ = true;
        M_South_Upstream_Paddles_East_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(302, false);
        if (doInfoPrintOutput) printOutput(302, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent302() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_East_Degree_) > (0.0)) && (equalObjs(M_South_Upstream_Paddles_East_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(301, true);
        if (doInfoEvent) infoEvent(301, true);

        M_South_HW_Paddle_BVH_East_Open_ = false;
        M_South_Upstream_Paddles_East_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(301, false);
        if (doInfoPrintOutput) printOutput(301, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_East_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent303() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_East_Degree_) >= (90.0)) && (equalObjs(M_South_Upstream_Paddles_East_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(300, true);
        if (doInfoEvent) infoEvent(300, true);

        M_South_HW_Paddle_BVH_East_Open_ = true;
        M_South_Upstream_Paddles_East_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(300, false);
        if (doInfoPrintOutput) printOutput(300, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Actuator_c_close".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent304() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_West_Q_Close_, true)) && (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(305, true);
        if (doInfoEvent) infoEvent(305, true);

        M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Closing;

        if (doInfoEvent) infoEvent(305, false);
        if (doInfoPrintOutput) printOutput(305, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Actuator_c_emergencyStop".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent305() {
        boolean guard = ((equalObjs(M_, c2jEnum._L)) && (equalObjs(M_South_HW_Paddle_BVH_West_Q_Close_, false))) && ((equalObjs(M_South_HW_Paddle_BVH_West_Q_Open_, false)) && ((equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) || (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Closing))));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(306, true);
        if (doInfoEvent) infoEvent(306, true);

        if (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) {
            M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        } else if (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)) {
            M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        }

        if (doInfoEvent) infoEvent(306, false);
        if (doInfoPrintOutput) printOutput(306, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Actuator_c_endStopClosing".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent306() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_West_Q_Close_, false)) && (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(307, true);
        if (doInfoEvent) infoEvent(307, true);

        M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(307, false);
        if (doInfoPrintOutput) printOutput(307, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Actuator_c_endStopOpening".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent307() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_West_Q_Open_, false)) && (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(308, true);
        if (doInfoEvent) infoEvent(308, true);

        M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;

        if (doInfoEvent) infoEvent(308, false);
        if (doInfoPrintOutput) printOutput(308, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Actuator_c_open".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent308() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && ((equalObjs(M_South_HW_Paddle_BVH_West_Q_Open_, true)) && (equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Rest)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(304, true);
        if (doInfoEvent) infoEvent(304, true);

        M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Opening;

        if (doInfoEvent) infoEvent(304, false);
        if (doInfoPrintOutput) printOutput(304, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Sensor_u_closed_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent309() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_West_Degree_) < (90.0)) && (equalObjs(M_South_Upstream_Paddles_West_Sensor_, c2jEnum._Closed)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(312, true);
        if (doInfoEvent) infoEvent(312, true);

        M_South_HW_Paddle_BVH_West_Closed_ = false;
        M_South_Upstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(312, false);
        if (doInfoPrintOutput) printOutput(312, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Sensor_u_closed_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent310() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_West_Degree_) <= (0.0)) && (equalObjs(M_South_Upstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(311, true);
        if (doInfoEvent) infoEvent(311, true);

        M_South_HW_Paddle_BVH_West_Closed_ = true;
        M_South_Upstream_Paddles_West_Sensor_ = c2jEnum._Closed;

        if (doInfoEvent) infoEvent(311, false);
        if (doInfoPrintOutput) printOutput(311, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Sensor_u_open_off".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent311() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_West_Degree_) > (0.0)) && (equalObjs(M_South_Upstream_Paddles_West_Sensor_, c2jEnum._Open)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(310, true);
        if (doInfoEvent) infoEvent(310, true);

        M_South_HW_Paddle_BVH_West_Open_ = false;
        M_South_Upstream_Paddles_West_Sensor_ = c2jEnum._Intermediate;

        if (doInfoEvent) infoEvent(310, false);
        if (doInfoPrintOutput) printOutput(310, false);
        return true;
    }

    /**
     * Execute code for event "M.South_Upstream_Paddles_West_Sensor_u_open_on".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent312() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (((South_Upstream_Paddles_West_Degree_) >= (90.0)) && (equalObjs(M_South_Upstream_Paddles_West_Sensor_, c2jEnum._Intermediate)));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(309, true);
        if (doInfoEvent) infoEvent(309, true);

        M_South_HW_Paddle_BVH_West_Open_ = true;
        M_South_Upstream_Paddles_West_Sensor_ = c2jEnum._Open;

        if (doInfoEvent) infoEvent(309, false);
        if (doInfoPrintOutput) printOutput(309, false);
        return true;
    }

    /**
     * Execute code for event "M.Wh_high".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent313() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (M_HW_Wh_HighWater_);
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(313, true);
        if (doInfoEvent) infoEvent(313, true);

        if (equalObjs(M_Wh_, c2jEnum._High)) {
            M_Wh_ = c2jEnum._High;
        } else if (equalObjs(M_Wh_, c2jEnum._Low)) {
            M_Wh_ = c2jEnum._High;
        }

        if (doInfoEvent) infoEvent(313, false);
        if (doInfoPrintOutput) printOutput(313, false);
        return true;
    }

    /**
     * Execute code for event "M.Wh_low".
     *
     * @return {@code true} if the event was executed, {@code false} otherwise.
     */
    private boolean execEvent314() {
        boolean guard = (equalObjs(M_, c2jEnum._L)) && (!(M_HW_Wh_HighWater_));
        if (!guard) return false;

        if (doInfoPrintOutput) printOutput(314, true);
        if (doInfoEvent) infoEvent(314, true);

        if (equalObjs(M_Wh_, c2jEnum._High)) {
            M_Wh_ = c2jEnum._Low;
        } else if (equalObjs(M_Wh_, c2jEnum._Low)) {
            M_Wh_ = c2jEnum._Low;
        }

        if (doInfoEvent) infoEvent(314, false);
        if (doInfoPrintOutput) printOutput(314, false);
        return true;
    }

    /** Initializes the state. */
    private void initState() {
        North_Upstream_Gates_East_Degree_ = 0.0;
        North_Upstream_Gates_West_Degree_ = 0.0;
        North_Upstream_Paddles_East_Degree_ = 0.0;
        North_Upstream_Paddles_West_Degree_ = 0.0;
        North_Downstream_Gates_East_Degree_ = 0.0;
        North_Downstream_Gates_West_Degree_ = 0.0;
        North_Downstream_Paddles_East_Degree_ = 0.0;
        North_Downstream_Paddles_West_Degree_ = 0.0;
        North_Water_H_Chamber_ = 4.6;
        South_Upstream_Gates_East_Degree_ = 0.0;
        South_Upstream_Gates_West_Degree_ = 0.0;
        South_Upstream_Paddles_East_Degree_ = 0.0;
        South_Upstream_Paddles_West_Degree_ = 0.0;
        South_Downstream_Gates_East_Degree_ = 0.0;
        South_Downstream_Gates_West_Degree_ = 0.0;
        South_Downstream_Paddles_East_Degree_ = 0.0;
        South_Downstream_Paddles_West_Degree_ = 0.0;
        South_Water_H_Chamber_ = 4.6;
        Barrier_Barrier_Degree_ = 0.0;
        M_Barrier_Barrier_Actuator_ = c2jEnum._Rest;
        M_Barrier_Barrier_Sensor_ = c2jEnum._Closed;
        M_Barrier_Downstream_TLs_East_Actuator_ = c2jEnum._Red;
        M_Barrier_Downstream_TLs_East_SensorG_ = c2jEnum._Off;
        M_Barrier_Downstream_TLs_East_SensorR_ = c2jEnum._On;
        M_Barrier_Downstream_TLs_West_Actuator_ = c2jEnum._Red;
        M_Barrier_Downstream_TLs_West_SensorG_ = c2jEnum._Off;
        M_Barrier_Downstream_TLs_West_SensorR_ = c2jEnum._On;
        M_Barrier_HW_Barrier_BVH_East_Open_ = false;
        M_Barrier_HW_Barrier_BVH_East_Closed_ = true;
        M_Barrier_HW_TL_BNH_East_Red_ = true;
        M_Barrier_HW_TL_BNH_East_Green_ = false;
        M_Barrier_HW_TL_BNH_West_Red_ = true;
        M_Barrier_HW_TL_BNH_West_Green_ = false;
        M_Barrier_HW_TL_BVH_East_Red_ = true;
        M_Barrier_HW_TL_BVH_East_Green_ = false;
        M_Barrier_HW_TL_BVH_West_Red_ = true;
        M_Barrier_HW_TL_BVH_West_Green_ = false;
        M_Barrier_Upstream_TLs_East_Actuator_ = c2jEnum._Red;
        M_Barrier_Upstream_TLs_East_SensorG_ = c2jEnum._Off;
        M_Barrier_Upstream_TLs_East_SensorR_ = c2jEnum._On;
        M_Barrier_Upstream_TLs_West_Actuator_ = c2jEnum._Red;
        M_Barrier_Upstream_TLs_West_SensorG_ = c2jEnum._Off;
        M_Barrier_Upstream_TLs_West_SensorR_ = c2jEnum._On;
        M_North_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        M_North_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_North_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_North_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_North_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        M_North_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_North_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_North_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_North_Downstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_North_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        M_North_Downstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_North_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        M_North_Downstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_North_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;
        M_North_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_North_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_North_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;
        M_North_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_North_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_North_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        M_North_Downstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_North_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        M_North_Downstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_North_HW_EnteringTL_BNH_East_Red_ = true;
        M_North_HW_EnteringTL_BNH_East_Green_ = false;
        M_North_HW_EnteringTL_BNH_East_RedRed_ = false;
        M_North_HW_EnteringTL_BNH_West_Red_ = true;
        M_North_HW_EnteringTL_BNH_West_Green_ = false;
        M_North_HW_EnteringTL_BNH_West_RedRed_ = false;
        M_North_HW_EnteringTL_BVH_East_Red_ = true;
        M_North_HW_EnteringTL_BVH_East_Green_ = false;
        M_North_HW_EnteringTL_BVH_East_RedRed_ = false;
        M_North_HW_EnteringTL_BVH_West_Red_ = true;
        M_North_HW_EnteringTL_BVH_West_Green_ = false;
        M_North_HW_EnteringTL_BVH_West_RedRed_ = false;
        M_North_HW_EqualWaterSensor_BNH_Equal_ = false;
        M_North_HW_EqualWaterSensor_BVH_Equal_ = false;
        M_North_HW_Gate_BNH_East_Open_ = false;
        M_North_HW_Gate_BNH_East_Closed_ = false;
        M_North_HW_Gate_BNH_West_Open_ = false;
        M_North_HW_Gate_BNH_West_Closed_ = false;
        M_North_HW_Gate_BVH_East_Open_ = false;
        M_North_HW_Gate_BVH_East_Closed_ = false;
        M_North_HW_Gate_BVH_West_Open_ = false;
        M_North_HW_Gate_BVH_West_Closed_ = false;
        M_North_HW_LeavingTL_BNH_East_Red_ = true;
        M_North_HW_LeavingTL_BNH_East_Green_ = false;
        M_North_HW_LeavingTL_BNH_West_Red_ = true;
        M_North_HW_LeavingTL_BNH_West_Green_ = false;
        M_North_HW_LeavingTL_BVH_East_Red_ = true;
        M_North_HW_LeavingTL_BVH_East_Green_ = false;
        M_North_HW_LeavingTL_BVH_West_Red_ = true;
        M_North_HW_LeavingTL_BVH_West_Green_ = false;
        M_North_HW_Paddle_BNH_East_Open_ = false;
        M_North_HW_Paddle_BNH_East_Closed_ = true;
        M_North_HW_Paddle_BNH_West_Open_ = false;
        M_North_HW_Paddle_BNH_West_Closed_ = true;
        M_North_HW_Paddle_BVH_East_Open_ = false;
        M_North_HW_Paddle_BVH_East_Closed_ = true;
        M_North_HW_Paddle_BVH_West_Open_ = false;
        M_North_HW_Paddle_BVH_West_Closed_ = true;
        M_North_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        M_North_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_North_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_North_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_North_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        M_North_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_North_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_North_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_North_Upstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_North_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        M_North_Upstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_North_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        M_North_Upstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_North_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;
        M_North_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_North_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_North_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;
        M_North_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_North_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_North_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        M_North_Upstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_North_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        M_North_Upstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_South_Downstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        M_South_Downstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_South_Downstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_South_Downstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_South_Downstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        M_South_Downstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_South_Downstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_South_Downstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_South_Downstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_South_Downstream_Gates_East_Actuator_ = c2jEnum._Rest;
        M_South_Downstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_South_Downstream_Gates_West_Actuator_ = c2jEnum._Rest;
        M_South_Downstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_South_Downstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;
        M_South_Downstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_South_Downstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_South_Downstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;
        M_South_Downstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_South_Downstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_South_Downstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        M_South_Downstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_South_Downstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        M_South_Downstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_South_HW_EnteringTL_BNH_East_Red_ = true;
        M_South_HW_EnteringTL_BNH_East_Green_ = false;
        M_South_HW_EnteringTL_BNH_East_RedRed_ = false;
        M_South_HW_EnteringTL_BNH_West_Red_ = true;
        M_South_HW_EnteringTL_BNH_West_Green_ = false;
        M_South_HW_EnteringTL_BNH_West_RedRed_ = false;
        M_South_HW_EnteringTL_BVH_East_Red_ = true;
        M_South_HW_EnteringTL_BVH_East_Green_ = false;
        M_South_HW_EnteringTL_BVH_East_RedRed_ = false;
        M_South_HW_EnteringTL_BVH_West_Red_ = true;
        M_South_HW_EnteringTL_BVH_West_Green_ = false;
        M_South_HW_EnteringTL_BVH_West_RedRed_ = false;
        M_South_HW_EqualWaterSensor_BNH_Equal_ = false;
        M_South_HW_EqualWaterSensor_BVH_Equal_ = false;
        M_South_HW_Gate_BNH_East_Open_ = false;
        M_South_HW_Gate_BNH_East_Closed_ = false;
        M_South_HW_Gate_BNH_West_Open_ = false;
        M_South_HW_Gate_BNH_West_Closed_ = false;
        M_South_HW_Gate_BVH_East_Open_ = false;
        M_South_HW_Gate_BVH_East_Closed_ = false;
        M_South_HW_Gate_BVH_West_Open_ = false;
        M_South_HW_Gate_BVH_West_Closed_ = false;
        M_South_HW_LeavingTL_BNH_East_Red_ = true;
        M_South_HW_LeavingTL_BNH_East_Green_ = false;
        M_South_HW_LeavingTL_BNH_West_Red_ = true;
        M_South_HW_LeavingTL_BNH_West_Green_ = false;
        M_South_HW_LeavingTL_BVH_East_Red_ = true;
        M_South_HW_LeavingTL_BVH_East_Green_ = false;
        M_South_HW_LeavingTL_BVH_West_Red_ = true;
        M_South_HW_LeavingTL_BVH_West_Green_ = false;
        M_South_HW_Paddle_BNH_East_Open_ = false;
        M_South_HW_Paddle_BNH_East_Closed_ = true;
        M_South_HW_Paddle_BNH_West_Open_ = false;
        M_South_HW_Paddle_BNH_West_Closed_ = true;
        M_South_HW_Paddle_BVH_East_Open_ = false;
        M_South_HW_Paddle_BVH_East_Closed_ = true;
        M_South_HW_Paddle_BVH_West_Open_ = false;
        M_South_HW_Paddle_BVH_West_Closed_ = true;
        M_South_Upstream_EnteringTLs_East_Actuator_ = c2jEnum._Red;
        M_South_Upstream_EnteringTLs_East_SensorG_ = c2jEnum._Off;
        M_South_Upstream_EnteringTLs_East_SensorR1_ = c2jEnum._On;
        M_South_Upstream_EnteringTLs_East_SensorR2_ = c2jEnum._Off;
        M_South_Upstream_EnteringTLs_West_Actuator_ = c2jEnum._Red;
        M_South_Upstream_EnteringTLs_West_SensorG_ = c2jEnum._Off;
        M_South_Upstream_EnteringTLs_West_SensorR1_ = c2jEnum._On;
        M_South_Upstream_EnteringTLs_West_SensorR2_ = c2jEnum._Off;
        M_South_Upstream_EqualWaterSensor_ = c2jEnum._Unequal;
        M_South_Upstream_Gates_East_Actuator_ = c2jEnum._Rest;
        M_South_Upstream_Gates_East_Sensor_ = c2jEnum._Closed;
        M_South_Upstream_Gates_West_Actuator_ = c2jEnum._Rest;
        M_South_Upstream_Gates_West_Sensor_ = c2jEnum._Closed;
        M_South_Upstream_LeavingTLs_East_Actuator_ = c2jEnum._Red;
        M_South_Upstream_LeavingTLs_East_SensorG_ = c2jEnum._Off;
        M_South_Upstream_LeavingTLs_East_SensorR_ = c2jEnum._On;
        M_South_Upstream_LeavingTLs_West_Actuator_ = c2jEnum._Red;
        M_South_Upstream_LeavingTLs_West_SensorG_ = c2jEnum._Off;
        M_South_Upstream_LeavingTLs_West_SensorR_ = c2jEnum._On;
        M_South_Upstream_Paddles_East_Actuator_ = c2jEnum._Rest;
        M_South_Upstream_Paddles_East_Sensor_ = c2jEnum._Closed;
        M_South_Upstream_Paddles_West_Actuator_ = c2jEnum._Rest;
        M_South_Upstream_Paddles_West_Sensor_ = c2jEnum._Closed;
        M_Wh_ = c2jEnum._High;
        M_ = c2jEnum._L;
    }

    /**
     * Updates the values of the input variables. Other variables from the
     * state may not be accessed or modified.
     */
    protected abstract void updateInputs();

    /**
     * Informs about the duration of a single execution.
     *
     * @param duration The duration of the execution, in nanoseconds.
     * @param cycleTime The desired maximum duration of the execution, in
     *      nanoseconds, or {@code -1} if not available.
     */
    protected abstract void infoExec(long duration, long cycleTime);

    /**
     * Informs that an event will be or has been executed.
     *
     * @param idx The 0-based index of the event, or {@code -1} for 'tau'.
     * @param pre Whether the event will be executed ({@code true}) or has
     *      been executed ({@code false}).
     */
    protected abstract void infoEvent(int idx, boolean pre);

    /**
     * Informs that the code is about to be executed. For the
     * {@link #firstExec} the state has not yet been initialized, except for
     * {@link #time}.
     */
    protected abstract void preExec();

    /** Informs that the code was just executed. */
    protected abstract void postExec();

    /**
     * Returns the name of an event.
     *
     * @param idx The 0-based index of the event, or {@code -1} for 'tau'.
     * @return The name of the event.
     */
    protected String getEventName(int idx) {
        if (idx == -1) return "tau";
        return EVENT_NAMES[idx];
    }


    /**
     * Evaluates derivative of continuous variable "North_Upstream_Gates_East_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Upstream_Gates_East_Degree_deriv() {
        return ((equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) && ((North_Upstream_Gates_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Upstream_Gates_East_Actuator_, c2jEnum._Closing)) && ((North_Upstream_Gates_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Upstream_Gates_West_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Upstream_Gates_West_Degree_deriv() {
        return ((equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) && ((North_Upstream_Gates_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Upstream_Gates_West_Actuator_, c2jEnum._Closing)) && ((North_Upstream_Gates_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Upstream_Paddles_East_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Upstream_Paddles_East_Degree_deriv() {
        return ((equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) && ((North_Upstream_Paddles_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)) && ((North_Upstream_Paddles_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Upstream_Paddles_West_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Upstream_Paddles_West_Degree_deriv() {
        return ((equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) && ((North_Upstream_Paddles_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)) && ((North_Upstream_Paddles_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Downstream_Gates_East_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Downstream_Gates_East_Degree_deriv() {
        return ((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) && ((North_Downstream_Gates_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) && ((North_Downstream_Gates_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Downstream_Gates_West_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Downstream_Gates_West_Degree_deriv() {
        return ((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) && ((North_Downstream_Gates_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) && ((North_Downstream_Gates_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Downstream_Paddles_East_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Downstream_Paddles_East_Degree_deriv() {
        return ((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) && ((North_Downstream_Paddles_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) && ((North_Downstream_Paddles_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Downstream_Paddles_West_Degree".
     *
     * @return The evaluation result.
     */
    public double North_Downstream_Paddles_West_Degree_deriv() {
        return ((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) && ((North_Downstream_Paddles_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_North_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) && ((North_Downstream_Paddles_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "North_Water_H_Chamber".
     *
     * @return The evaluation result.
     */
    public double North_Water_H_Chamber_deriv() {
        return (((equalObjs(M_North_Downstream_Paddles_East_Sensor_, c2jEnum._Open)) || (equalObjs(M_North_Downstream_Paddles_West_Sensor_, c2jEnum._Open))) && ((North_Water_H_Chamber_) > (4.6))) ? negate(0.5) : ((((equalObjs(M_North_Upstream_Paddles_East_Sensor_, c2jEnum._Open)) || (equalObjs(M_North_Upstream_Paddles_West_Sensor_, c2jEnum._Open))) && ((North_Water_H_Chamber_) < ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6)))) ? 0.5 : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Upstream_Gates_East_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Upstream_Gates_East_Degree_deriv() {
        return ((equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Opening)) && ((South_Upstream_Gates_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Upstream_Gates_East_Actuator_, c2jEnum._Closing)) && ((South_Upstream_Gates_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Upstream_Gates_West_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Upstream_Gates_West_Degree_deriv() {
        return ((equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Opening)) && ((South_Upstream_Gates_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Upstream_Gates_West_Actuator_, c2jEnum._Closing)) && ((South_Upstream_Gates_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Upstream_Paddles_East_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Upstream_Paddles_East_Degree_deriv() {
        return ((equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Opening)) && ((South_Upstream_Paddles_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Upstream_Paddles_East_Actuator_, c2jEnum._Closing)) && ((South_Upstream_Paddles_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Upstream_Paddles_West_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Upstream_Paddles_West_Degree_deriv() {
        return ((equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Opening)) && ((South_Upstream_Paddles_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Upstream_Paddles_West_Actuator_, c2jEnum._Closing)) && ((South_Upstream_Paddles_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Downstream_Gates_East_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Downstream_Gates_East_Degree_deriv() {
        return ((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Opening)) && ((South_Downstream_Gates_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Downstream_Gates_East_Actuator_, c2jEnum._Closing)) && ((South_Downstream_Gates_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Downstream_Gates_West_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Downstream_Gates_West_Degree_deriv() {
        return ((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Opening)) && ((South_Downstream_Gates_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Downstream_Gates_West_Actuator_, c2jEnum._Closing)) && ((South_Downstream_Gates_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Downstream_Paddles_East_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Downstream_Paddles_East_Degree_deriv() {
        return ((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Opening)) && ((South_Downstream_Paddles_East_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Downstream_Paddles_East_Actuator_, c2jEnum._Closing)) && ((South_Downstream_Paddles_East_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Downstream_Paddles_West_Degree".
     *
     * @return The evaluation result.
     */
    public double South_Downstream_Paddles_West_Degree_deriv() {
        return ((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Opening)) && ((South_Downstream_Paddles_West_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_South_Downstream_Paddles_West_Actuator_, c2jEnum._Closing)) && ((South_Downstream_Paddles_West_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "South_Water_H_Chamber".
     *
     * @return The evaluation result.
     */
    public double South_Water_H_Chamber_deriv() {
        return (((equalObjs(M_South_Downstream_Paddles_East_Sensor_, c2jEnum._Open)) || (equalObjs(M_South_Downstream_Paddles_West_Sensor_, c2jEnum._Open))) && ((South_Water_H_Chamber_) > (4.6))) ? negate(2.0) : ((((equalObjs(M_South_Upstream_Paddles_East_Sensor_, c2jEnum._Open)) || (equalObjs(M_South_Upstream_Paddles_West_Sensor_, c2jEnum._Open))) && ((South_Water_H_Chamber_) < ((equalObjs(M_Wh_, c2jEnum._High)) ? 5.8 : (4.6)))) ? 2.0 : (0.0));
    }

    /**
     * Evaluates derivative of continuous variable "Barrier_Barrier_Degree".
     *
     * @return The evaluation result.
     */
    public double Barrier_Barrier_Degree_deriv() {
        return ((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Opening)) && ((Barrier_Barrier_Degree_) < (90.0))) ? 30.0 : (((equalObjs(M_Barrier_Barrier_Actuator_, c2jEnum._Closing)) && ((Barrier_Barrier_Degree_) > (0.0))) ? negate(30.0) : (0.0));
    }


    /**
     * Interface for CIF tuples.
     *
     * @param <T> The concrete tuple type class.
     */
    public static abstract class CifTupleBase<T extends CifTupleBase<T>> {
        /**
         * Creates a shallow copy of this tuple.
         *
         * @return A shallow copy of this tuple.
         */
        public abstract T copy();

        @Override
        public abstract int hashCode();

        @Override
        public abstract boolean equals(Object other);

        @Override
        public abstract String toString();
    }


    /**
     * Print output for all relevant print declarations.
     *
     * @param idx The 0-based event index of the transition, or {@code -1} for
     *      'tau' transitions, {@code -2} for time transitions, or {@code -3}
     *      for the 'initial' transition.
     * @param pre Whether to print output for the pre/source state of the
     *      transition ({@code true}) or for the post/target state of the
     *      transition ({@code false}).
     */
    private void printOutput(int idx, boolean pre) {
        // No print declarations.
    }

    /**
     * Informs that new print output is available.
     *
     * @param text The text being printed.
     * @param target The file or special target to which text is to be printed.
     *      If printed to a file, an absolute or relative local file system
     *      path is given. Paths may contain both {@code "/"} and {@code "\\"}
     *      as path separators. Use {@link c2jUtils#normalizePrintTarget}
     *      to normalize the path to use path separators for the current
     *      platform. There are two special targets: {@code ":stdout"} to print
     *      to the standard output stream, and {@code ":stderr"} to print to
     *      the standard error stream.
     */
    protected abstract void infoPrintOutput(String text, String target);

    /** c2j enumeration. */
    public static enum c2jEnum {
        /** Closed */ _Closed,
        /** Closing */ _Closing,
        /** Equal */ _Equal,
        /** Green */ _Green,
        /** High */ _High,
        /** Intermediate */ _Intermediate,
        /** L */ _L,
        /** Low */ _Low,
        /** Off */ _Off,
        /** On */ _On,
        /** Open */ _Open,
        /** Opening */ _Opening,
        /** Red */ _Red,
        /** RedGreen */ _RedGreen,
        /** RedRed */ _RedRed,
        /** Rest */ _Rest,
        /** Unequal */ _Unequal,
        /** X */ _X;

        @Override
        public String toString() {
            return name().substring(1);
        }
    }

    /**
     * c2j exception.
     *
     * <p>Indices a runtime error while executing the generated code.</p>
     */
    public static class c2jException extends RuntimeException {
        /**
         * Constructor for the {@link c2jException} class.
         *
         * @param message The message describing the exception.
         */
        public c2jException(String message) {
            super(message);
        }

        /**
         * Constructor for the {@link c2jException} class.
         *
         * @param message The message describing the exception.
         * @param cause The root cause of the exception.
         */
        public c2jException(String message, Throwable cause) {
            super(message, cause);
        }

        @Override
        public String toString() {
            return getMessage();
        }
    }

    /** {@link c2j} utility code. */
    public static class c2jUtils {
        /** The path separator for the current platform. */
        private static final String PATH_SEPARATOR = System.getProperty("file.separator");

        /** Constructor for the {@link c2jUtils} class. */
        private c2jUtils() {
            // Static class.
        }

        /**
         * Returns the absolute value of an integer number.
         *
         * @param x The integer number.
         * @return {@code abs(x)}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int abs(int x) {
            if (x == Integer.MIN_VALUE) {
                String msg = fmt("Integer overflow: abs(%d).", x);
                throw new c2jException(msg);
            }
            return Math.abs(x);
        }

        /**
         * Returns the absolute value of a real number.
         *
         * @param x The real number.
         * @return {@code abs(x)}.
         */
        public static double abs(double x) {
            return Math.abs(x);
        }

        /**
         * Returns the arc cosine of a real number.
         *
         * @param x The real number.
         * @return {@code acos(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double acos(double x) {
            double rslt = Math.acos(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: acos(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: acos(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the arc sine of a real number.
         *
         * @param x The real number.
         * @return {@code asin(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double asin(double x) {
            double rslt = Math.asin(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: asin(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: asin(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the arc tangent of a real number.
         *
         * @param x The real number.
         * @return {@code atan(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double atan(double x) {
            double rslt = Math.atan(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: atan(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: atan(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the addition of two integer numbers.
         *
         * @param x The first integer number.
         * @param y The second integer number.
         * @return {@code x + y}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int addInt(int x, int y) {
            long rslt = (long)x + (long)y;
            if (Integer.MIN_VALUE <= rslt && rslt <= Integer.MAX_VALUE) {
                return (int)rslt;
            }

            String msg = fmt("Integer overflow: %d + %d.", x, y);
            throw new c2jException(msg);
        }

        /**
         * Returns the addition of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code x + y}.
         * @throws c2jException If the operation results in real overflow.
         */
        public static double addReal(double x, double y) {
            double rslt = x + y;
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: %s + %s.",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the addition of two strings.
         *
         * @param x The first string.
         * @param y The second string.
         * @return {@code x + y}.
         */
        public static String addString(String x, String y) {
            return x + y;
        }

        /**
         * Converts a Java {@link Boolean} to a CIF boolean value literal, in the
         * CIF ASCII representation.
         *
         * @param x The Java {@link Boolean} value.
         * @return The CIF boolean value literal, in the CIF ASCII representation.
         */
        public static String boolToStr(boolean x) {
            return x ? "true" : "false";
        }

        /**
         * Returns the cube root of a real number.
         *
         * @param x The real number.
         * @return {@code cbrt(x)}.
         */
        public static double cbrt(double x) {
            double rslt = Math.cbrt(x);
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the ceil of a real number.
         *
         * @param x The real number.
         * @return {@code ceil(x)}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int ceil(double x) {
            double rslt = Math.ceil(x);
            if (rslt < Integer.MIN_VALUE || rslt > Integer.MAX_VALUE) {
                String msg = fmt("Integer overflow: ceil(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (int)rslt;
        }

        /**
         * Checks a double value to ensure it is not NaN or infinite.
         *
         * @param value The double value to check.
         * @param name The name of the CIF variable that contains the value.
         */
        public static void checkDouble(double value, String name) {
            if (Double.isFinite(value)) return;

            String msg;
            if (Double.isNaN(value)) {
                msg = "NaN";
            } else if (value == Double.POSITIVE_INFINITY) {
                msg = "+inf";
            } else {
                msg = "-inf";
            }
            msg = fmt("The value of variable \"%s\" has become \"%s\".", name, msg);
            throw new c2jException(msg);
        }

        /**
         * Creates and returns a shallow copy of a list.
         *
         * @param <TI> The type of the elements of the input list.
         * @param <TR> The type of the elements of the copied list.
         * @param lst The list to copy.
         * @return The shallow copy of the list.
         */
        public static <TR, TI extends TR> List<TR> copy(List<TI> lst) {
            List<TR> rslt = new ArrayList<TR>(lst.size());
            for (TI elem: lst) {
                rslt.add(elem);
            }
            return rslt;
        }

        /**
         * Returns the cosine of a real number.
         *
         * @param x The real number.
         * @return {@code cos(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double cos(double x) {
            double rslt = Math.cos(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: cos(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: cos(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the integer division of two integer numbers.
         *
         * @param x The dividend.
         * @param y The divisor.
         * @return {@code x div y}.
         * @throws c2jException If the operation results in integer
         *      overflow, or division by zero.
         */
        public static int div(int x, int y) {
            if (y == 0) {
                String msg = fmt("Division by zero: %d div %d.", x, y);
                throw new c2jException(msg);
            }
            if (x == Integer.MIN_VALUE && y == -1) {
                String msg = fmt("Integer overflow: %d div %d.", x, y);
                throw new c2jException(msg);
            }
            return x / y;
        }

        /**
         * Returns the real division of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code x / y}.
         * @throws c2jException If the operation results in real overflow,
         *      or division by zero.
         */
        public static double divide(double x, double y) {
            if (y == 0.0) {
                String msg = fmt("Division by zero: %s / %s.",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            double rslt = x / y;
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: %s * %s.",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns {@code empty(x)} for the given list.
         *
         * @param x The list.
         * @return {@code empty(x)}
         */
        public static boolean empty(List<?> x) {
            return x.isEmpty();
        }

        /**
         * Returns {@code true} if the arguments are equal to each other and
         * {@code false} otherwise. Can handle {@code null} values.
         *
         * @param obj1 The first object.
         * @param obj2 The second object.
         * @return {@code true} if the arguments are equal to each other,
         *      {@code false} otherwise.
         */
        public static boolean equalObjs(Object obj1, Object obj2) {
            // Implementation copied from java.util.Objects.equals, available in
            // Java 7 and later.
            return (obj1 == obj2) || (obj1 != null && obj1.equals(obj2));
        }

        /**
         * Returns a backslash escaped version of the string. That is:
         * <ul>
         * <li>backslash ({@code "\\"}) becomes {@code "\\\\"}</li>
         * <li>new line ({@code "\n"}) becomes {@code "\\n"}</li>
         * <li>tab ({@code "\t"}) becomes {@code "\\t"}</li>
         * <li>double quotes ({@code "\""}) becomes {@code "\\\""}</li>
         * </ul>
         *
         * @param s The string value to escape.
         * @return The backslash escaped string value.
         */
        public static String escape(String s) {
            return s.replace("\\", "\\\\")
                    .replace("\n", "\\n")
                    .replace("\t", "\\t")
                    .replace("\"", "\\\"");
        }

        /**
         * Returns {@code e}<sup>{@code x}</sup> of a real number {@code x}.
         *
         * @param x The real number.
         * @return {@code exp(x)}.
         * @throws c2jException If the operation results in real overflow.
         */
        public static double exp(double x) {
            double rslt = Math.exp(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: exp(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the floor of a real number.
         *
         * @param x The real number.
         * @return {@code floor(x)}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int floor(double x) {
            double rslt = Math.floor(x);
            if (rslt < Integer.MIN_VALUE || rslt > Integer.MAX_VALUE) {
                String msg = fmt("Integer overflow: floor(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (int)rslt;
        }

        /**
         * Returns a formatted string using the specified format string and
         * arguments.
         *
         * <p>No localization is applied, which defaults to the US locale.</p>
         *
         * @param format A format/pattern string.
         * @param args The arguments referenced by the format specifiers in the
         *      format string.
         * @return A formatted string.
         */
        public static String fmt(String format, Object... args) {
            return String.format(null, format, args);
        }

       /**
        * Generates a hash code for a sequence of arguments. The hash code is
        * generated as if all the arguments were placed into an array, and that
        * array were hashed by calling {@link Arrays#hashCode(Object[])}.
        *
        * @param objs The objects for which to compute a hash code.
        * @return A hash value of the sequence of arguments.
        */
        public static int hashObjs(Object... objs) {
            return Arrays.hashCode(objs);
        }

        /**
         * Converts a Java {@link Integer} to a Java {@link Double}.
         *
         * @param x The Java {@link Integer} value.
         * @return The Java {@link Double} value.
         */
        public static double intToReal(int x) {
            // The 'int' to 'double' conversion is lossless. See
            //   https://www.securecoding.cert.org/confluence/display/java/
            //   NUM13-J.+Avoid+loss+of+precision+when+converting+primitive+
            //   integers+to+floating-point
            return x;
        }

        /**
         * Converts a Java {@link Integer} to a CIF integer value literal, in the
         * CIF ASCII representation.
         *
         * @param x The Java {@link Integer} value.
         * @return The CIF integer value literal, in the CIF ASCII representation.
         */
        public static String intToStr(int x) {
            return Integer.toString(x);
        }

        /**
         * Returns the natural logarithm of a real number.
         *
         * @param x The real number.
         * @return {@code ln(x)}.
         * @throws c2jException If the real number is non-positive.
         */
        public static double ln(double x) {
            if (x <= 0.0) {
                String msg = fmt("Invalid operation: ln(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return Math.log(x);
        }

        /**
         * Returns the logarithm (base 10) of a real number.
         *
         * @param x The real number.
         * @return {@code log(x)}.
         * @throws c2jException If the real number is non-positive.
         */
        public static double log(double x) {
            if (x <= 0.0) {
                String msg = fmt("Invalid operation: log(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return Math.log10(x);
        }

        /**
         * Fills the given empty list with the given elements, modifying the
         * list in-place, and returning that same list. This method is only used
         * for the construction of list literals.
         *
         * @param <T> The type of the elements of the list.
         * @param lst The list.
         * @param elems The elements.
         * @return The input list.
         */
        @SafeVarargs
        public static <T> List<T> makelist(List<T> lst, T... elems) {
            for (T elem: elems) {
                lst.add(elem);
            }
            return lst;
        }

        /**
         * Returns the maximum of two integer numbers.
         *
         * @param x The first integer number.
         * @param y The second integer number.
         * @return {@code max(x, y)}.
         */
        public static int max(int x, int y) {
            return Math.max(x, y);
        }

        /**
         * Returns the maximum of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code max(x, y)}.
         */
        public static double max(double x, double y) {
            return Math.max(x, y);
        }

        /**
         * Returns the minimum of two integer numbers.
         *
         * @param x The first integer number.
         * @param y The second integer number.
         * @return {@code min(x, y)}.
         */
        public static int min(int x, int y) {
            return Math.min(x, y);
        }

        /**
         * Returns the minimum of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code min(x, y)}.
         */
        public static double min(double x, double y) {
            // Assumes that the arguments are never -0.0.
            return Math.min(x, y);
        }

        /**
         * Returns the modulus of two integer numbers.
         *
         * @param x The dividend.
         * @param y The divisor.
         * @return {@code x mod y}.
         * @throws c2jException If the operation results in division by
         *      zero.
         */
        public static int mod(int x, int y) {
            if (y == 0) {
                String msg = fmt("Division by zero: %d mod %d.", x, y);
                throw new c2jException(msg);
            }
            return x % y;
        }

        /**
         * Creates a shallow copy of the given list, and replaces the element at
         * the given index with a new value.
         *
         * @param <T> The type of the elements of the list.
         * @param lst The list.
         * @param origIdx The 0-based index into the list of the element to
         *      replace. Negative indices are allowed, and count from the right.
         * @param newValue The new value.
         * @return The modified list.
         * @throws c2jException If the index is out of range for the list.
         */
        public static <T> List<T> modify(List<T> lst, int origIdx, T newValue) {
            // Normalize index and check for out of bounds.
            int idx = origIdx;
            if (idx < 0) idx = lst.size() + idx;
            if (idx < 0 || idx >= lst.size()) {
                String msg = fmt("Index out of bounds: %s[%s].",
                                 valueToStr(lst), origIdx);
                throw new c2jException(msg);
            }

            // Create a shallow copy, replace the element, and return the list.
            List<T> rslt = copy(lst);
            rslt.set(idx, newValue);
            return rslt;
        }

        /**
         * Returns the multiplication of two integer numbers.
         *
         * @param x The first integer number.
         * @param y The second integer number.
         * @return {@code x * y}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int multiply(int x, int y) {
            long rslt = (long)x * (long)y;
            if (Integer.MIN_VALUE <= rslt && rslt <= Integer.MAX_VALUE) {
                return (int)rslt;
            }

            String msg = fmt("Integer overflow: %d * %d.", x, y);
            throw new c2jException(msg);
        }

        /**
         * Returns the multiplication of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code x * y}.
         * @throws c2jException If the operation results in real overflow.
         */
        public static double multiply(double x, double y) {
            double rslt = x * y;
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: %s * %s.",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the negation of an integer number.
         *
         * @param x The integer number.
         * @return {@code -value}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int negate(int x) {
            if (x == Integer.MIN_VALUE) {
                String msg = fmt("Integer overflow: -%d.", x);
                throw new c2jException(msg);
            }
            return -x;
        }

        /**
         * Returns the negation of a real number.
         *
         * @param x The real number.
         * @return {@code -value}.
         */
        public static double negate(double x) {
            return (x == 0.0) ? 0.0 : -x;
        }

        /**
         * Normalizes a print target path. Path separators {@code "\\"} and
         * {@code "/"} are replaced by the path separator of the current platform,
         * i.e. {@link #PATH_SEPARATOR}.
         *
         * @param path The print target path. Should not be special target
         *      {@code ":stdout"} or {@code ":stderr"}.
         * @return The normalized print target path.
         */
        public static String normalizePrintTarget(String path) {
            if (!PATH_SEPARATOR.equals("/"))  path = path.replace("/",  PATH_SEPARATOR);
            if (!PATH_SEPARATOR.equals("\\")) path = path.replace("\\", PATH_SEPARATOR);
            return path;
        }

        /**
         * Returns the exponentiation (power) of two integer numbers.
         *
         * @param x The base integer number.
         * @param y The exponent integer number, {@code y >= 0}.
         * @return {@code pow(x, y)}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int powInt(int x, int y) {
            if (y < 0) throw new RuntimeException("y < 0");
            double rslt = Math.pow(x, y);
            if (Integer.MIN_VALUE <= rslt && rslt <= Integer.MAX_VALUE) {
                return (int)rslt;
            }
            String msg = fmt("Integer overflow: pow(%d, %d).", x, y);
            throw new c2jException(msg);
        }

        /**
         * Returns the exponentiation (power) of two real numbers.
         *
         * @param x The base real number.
         * @param y The exponent real number.
         * @return {@code pow(x, y)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double powReal(double x, double y) {
            // Assumes that the arguments are valid doubles (no inf/NaN/-0.0).
            double rslt = Math.pow(x, y);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: pow(%s, %s).",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: pow(%s, %s).",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Converts a Java {@link Double} to a CIF real value literal, in the CIF
         * ASCII representation.
         *
         * <p>Note that the {@link Double} values may be negative, and the
         * resulting textual representation may thus have a {@code "-"} prefix,
         * unlike real value literals in the CIF ASCII representation, where the
         * {@code "-"} character is a unary operator.</p>
         *
         * @param x The Java {@link Double} value.
         * @return The CIF real value literal, in the CIF ASCII representation.
         */
        public static String realToStr(double x) {
            // Double.toString always results in valid CIF ASCII representations
            // of real values. It also is round-trip compatible (up to fixed point
            // behavior) with strToReal.
            if (!Double.isFinite(x)) throw new RuntimeException(Double.toString(x));
            return Double.toString(x).replace('E', 'e');
        }

        /**
         * Projects a list, using a zero-based index.
         *
         * @param <T> The type of the elements of the list.
         * @param lst The list.
         * @param origIdx The 0-based index into the list of the element to return.
         *      Negative indices are allowed, and count from the right.
         * @return {@code lst[origIdx]}.
         * @throws c2jException If the index is out of range for the list.
         */
        public static <T> T project(List<T> lst, int origIdx) {
            // Normalize index and check for out of bounds.
            int idx = origIdx;
            if (idx < 0) idx = lst.size() + idx;
            if (idx < 0 || idx >= lst.size()) {
                String msg = fmt("Index out of bounds: %s[%s].",
                                 valueToStr(lst), origIdx);
                throw new c2jException(msg);
            }

            // Return the element.
            return lst.get(idx);
        }

        /**
         * Projects a string, using a zero-based index.
         *
         * @param str The string.
         * @param origIdx The 0-based index into the string of the character to
         *      return. Negative indices are allowed, and count from the right.
         * @return {@code str[origIdx]}.
         * @throws c2jException If the index is out of range for the
         *      string.
         */
        public static String project(String str, int origIdx) {
            int idx = origIdx;
            if (idx < 0) idx = str.length() + idx;
            if (idx < 0 || idx >= str.length()) {
                String msg = fmt("Index out of bounds: \"%s\"[%s].",
                                 escape(str), origIdx);
                throw new c2jException(msg);
            }

            return str.substring(idx, idx + 1);
        }

        /**
         * Invoked in case of an integer range out of bounds error.
         *
         * @param name The name of the variable that contains the integer value, as
         *      end-user readable text.
         * @param value The value of the variable that contains the integer value,
         *      as end-user readable text.
         * @param type The type of the variable that contains the integer value,
         *      as end-user readable text.
         * @throws c2jException Always thrown.
         */
        public static void rangeErrInt(String name, String value, String type) {
            String msg = fmt("Variable \"%s\" is assigned value \"%s\", which " +
                             "violates the integer type bounds of the type " +
                             "\"%s\" of that variable.", name, value, type);
            throw new c2jException(msg);
        }

        /**
         * Returns the round of a real number.
         *
         * @param x The real number.
         * @return {@code round(x)}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int round(double x) {
            if (x < Integer.MIN_VALUE - 0.5 || x >= Integer.MAX_VALUE + 0.5) {
                String msg = fmt("Integer overflow: round(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            long rslt = Math.round(x);
            return (int)rslt;
        }

        /**
         * Returns a linearly scaled value.
         *
         * @param v The value to scale.
         * @param inmin The minimum of the input interval.
         * @param inmax The maximum of the input interval.
         * @param outmin The minimum of the output interval.
         * @param outmax The maximum of the output interval.
         * @return {@code scale(v, inmin, inmax, outmin, outmax)}.
         * @throws c2jException If the input interval is empty, or the
         *      operation results in real overflow.
         */
        public static double scale(double v, double inmin, double inmax,
                                   double outmin, double outmax)
        {
            // fraction = (v - inmin) / (inmax - inmin);
            // result = outmin + fraction * (outmax - outmin);
            double inrange = subtract(inmax, inmin);
            if (inrange == 0) {
                String msg = fmt("Empty input interval: scale(%s, %s, %s, %s, " +
                                 "%s).", realToStr(v),
                                 realToStr(inmin), realToStr(inmax),
                                 realToStr(outmin), realToStr(outmax));
                throw new c2jException(msg);
            }
            double fraction = divide(subtract(v, inmin), inrange);
            return addReal(outmin, multiply(fraction, subtract(outmax, outmin)));
        }

        /**
         * Returns the sign of an integer number.
         *
         * @param x The integer number.
         * @return {@code sign(x)}.
         */
        public static int sign(int x) {
            return (x == 0) ? 0 : (x < 0) ? -1 : 1;
        }

        /**
         * Returns the sign of a real number.
         *
         * @param x The real number.
         * @return {@code sign(x)}.
         */
        public static int sign(double x) {
            return (x == 0.0) ? 0 : (x < 0.0) ? -1 : 1;
        }

        /**
         * Returns the sine of a real number.
         *
         * @param x The real number.
         * @return {@code sin(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double sin(double x) {
            double rslt = Math.sin(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: sin(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: sin(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns {@code size(x)} for the given string.
         *
         * @param x The string.
         * @return {@code size(x)}
         */
        public static int size(String x) {
            return x.length();
        }

        /**
         * Returns {@code size(x)} for the given list.
         *
         * @param x The list.
         * @return {@code size(x)}
         */
        public static int size(List<?> x) {
            return x.size();
        }

        /**
         * Returns the square root of a real number.
         *
         * @param x The real number.
         * @return {@code sqrt(x)}.
         * @throws c2jException If the real number is negative.
         */
        public static double sqrt(double x) {
            // Assumes that the argument is never -0.0.
            if (x < 0.0) {
                String msg = fmt("Invalid operation: sqrt(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return Math.sqrt(x);
        }

        /**
         * Converts a CIF boolean value literal, in the CIF ASCII representation,
         * to a Java {@link Boolean}.
         *
         * @param x The CIF boolean value literal, in the CIF ASCII representation.
         * @return The Java {@link Boolean} value.
         * @throws c2jException If the string value does not represent a
         *      boolean value.
         */
        public static boolean strToBool(String x) {
            if (x.equals("true")) return true;
            if (x.equals("false")) return false;

            String msg = fmt("Cast from type \"string\" to type \"bool\" " +
                             "failed: the string value does not represent a " +
                             "boolean value: \"%s\".", escape(x));
            throw new c2jException(msg);
        }

        /**
         * Converts a CIF integer value literal, in the CIF ASCII representation,
         * to a Java {@link Integer}.
         *
         * <p>See also the {@code CifTypeChecker.transIntExpression} method.</p>
         *
         * @param x The CIF integer value literal, in the CIF ASCII representation.
         * @return The Java {@link Integer} value.
         * @throws c2jException If the string value does not represent an
         *      integer value.
         */
        public static int strToInt(String x) {
            // Integer.parseInt allows all valid integer values in CIF ASCII
            // syntax, as well as negative values (which are unary operator '-'
            // with an integer value in CIF ASCII syntax), and integer values
            // with arbitrary '0' prefixes (not allowed in CIF ASCII syntax).
            try {
                return Integer.parseInt(x);
            } catch (NumberFormatException ex) {
                String msg = fmt("Cast from type \"string\" to type \"int\" " +
                                 "failed: the string value does not represent " +
                                 "an integer value, or the integer value " +
                                 "resulted in integer overflow: \"%s\".",
                                 escape(x));
                throw new c2jException(msg);
            }
        }

        /**
         * Converts a CIF real value literal, in the CIF ASCII representation,
         * to a Java {@link Double}.
         *
         * <p>See also the {@code CifTypeChecker.transRealExpression} method.</p>
         *
         * @param x The CIF real value literal, in the CIF ASCII representation.
         * @return The Java {@link Double} value.
         * @throws c2jException If the string value does not represent an
         *      integer value.
         */
        public static double strToReal(String x) {
            // Double.parseDouble allows all valid real values in CIF ASCII syntax,
            // as well a whole bunch of additional representations, such as
            // negative values (which are unary operator '-' with an real value
            // in CIF ASCII syntax), signed integers (not allowed in the CIF
            // ASCII syntax), hexadecimal floating point notation (not allowed in
            // CIF ASCII syntax), etc.

            double rslt;
            try {
                rslt = Double.parseDouble(x);
                if (Double.isNaN(rslt)) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                String msg = fmt("Cast from type \"string\" to type \"real\" " +
                                 "failed: the string value does not represent a " +
                                 "real value: \"%s\".", escape(x));
                throw new c2jException(msg);
            }

            if (Double.isInfinite(rslt)) {
                String msg = fmt("Cast from type \"string\" to type \"real\" " +
                                 "failed, due to real overflow: \"%s\".",
                                 escape(x));
                throw new c2jException(msg);
            }

            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the subtraction of two integer numbers.
         *
         * @param x The first integer number.
         * @param y The second integer number.
         * @return {@code x - y}.
         * @throws c2jException If the operation results in integer
         *      overflow.
         */
        public static int subtract(int x, int y) {
            long rslt = (long)x - (long)y;
            if (Integer.MIN_VALUE <= rslt && rslt <= Integer.MAX_VALUE) {
                return (int)rslt;
            }

            String msg = fmt("Integer overflow: %d - %d.", x, y);
            throw new c2jException(msg);
        }

        /**
         * Returns the subtraction of two real numbers.
         *
         * @param x The first real number.
         * @param y The second real number.
         * @return {@code x - y}.
         * @throws c2jException If the operation results in real overflow.
         */
        public static double subtract(double x, double y) {
            double rslt = x - y;
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: %s - %s.",
                                 realToStr(x), realToStr(y));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Returns the tangent of a real number.
         *
         * @param x The real number.
         * @return {@code tan(x)}.
         * @throws c2jException If the operation results in real overflow,
         *      or {@code NaN}.
         */
        public static double tan(double x) {
            double rslt = Math.tan(x);
            if (Double.isInfinite(rslt)) {
                String msg = fmt("Real overflow: tan(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            if (Double.isNaN(rslt)) {
                String msg = fmt("Invalid operation: tan(%s).", realToStr(x));
                throw new c2jException(msg);
            }
            return (rslt == -0.0) ? 0.0 : rslt;
        }

        /**
         * Converts the given value into a textual representation, closely
         * resembling the CIF ASCII syntax.
         *
         * @param value The value.
         * @return The textual representation.
         */
        public static String valueToStr(Object value) {
            if (value instanceof Boolean) {
                boolean bvalue = (Boolean)value;
                return bvalue ? "true" : "false";

            } else if (value instanceof Integer) {
                int ivalue = (Integer)value;
                return Integer.toString(ivalue);

            } else if (value instanceof Double) {
                double dvalue = (Double)value;
                return Double.toString(dvalue).replace('E', 'e');

            } else if (value instanceof String) {
                String svalue = (String)value;
                return "\"" + escape(svalue) + "\"";

            } else if (value instanceof List) {
                List<?> lst = (List<?>)value;
                StringBuilder txt = new StringBuilder();
                txt.append("[");
                for (int i = 0; i < lst.size(); i++) {
                    if (i > 0) txt.append(", ");
                    txt.append(valueToStr(lst.get(i)));
                }
                txt.append("]");
                return txt.toString();

            } else if (value instanceof Enum) {
                return value.toString();

            } else if (value instanceof c2j.CifTupleBase) {
                return value.toString();

            } else {
                throw new RuntimeException("Unsupported value: " + value);
            }
        }
    }
}
