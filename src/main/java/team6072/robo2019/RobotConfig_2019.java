package team6072.robo2019;


public class RobotConfig_2019 {

    public static final boolean IS_ROBO_2019 = true;

    // constants (units in inches)
    public static double DRIVE_WHEEL_DIAMETER = 6.0;

    // DRIVE
    // Objective is to have the Talon LEDs flashing green when driving forward, and
    // sensor phase in sync with velocity - use the graphing in the Phoenix Tuner
    // plot to check
    public static final boolean LEFT_INVERT = false; // 2018 - false
    public static final boolean LEFT_SENSPHASE = true; // 2018 - true

    public static final boolean RIGHT_INVERT = true; // 2018 - true
    public static final boolean RIGHT_SENSPHASE = true; // 2018 - true

    public static final int DRIVE_LEFT_MASTER = 16;
    public static final int DRIVE_LEFT_SLAVE0 = 1;
    public static final int DRIVE_LEFT_SLAVE1 = 2; // only in 2019

    public static final int DRIVE_RIGHT_MASTER = 15;
    public static final int DRIVE_RIGHT_SLAVE0 = 14;
    public static final int DRIVE_RIGHT_SLAVE1 = 13; // only in 2019

    public static final int DRIVE_GEAR_FWD_LO = 4; // DIO for the gear shifting solenoid
    public static final int DRIVE_GEAR_REV_HI = 5;

    // ELEVATOR
    public static final boolean ELV_INVERT = false; // 2018 - false
    public static final boolean ELV_SENSOR_PHASE = false; // 2018 false

    public static final int ELV_TICKS_PER_INCH = 0; //     NOT MEASURED

    public static final int ELEVATOR_MASTER = 4;
    public static final int ELEVATOR_SLAVE0 = 5; // only in 2019

    public static final int ELEVATOR_SWITCH_TOP = 1;
    public static final int ELEVATOR_SWITCH_BOT = 0;

    // WRIST
    public static final int WRIST_TICKS_PER_DEG = 0; // NOT MEASURED

    public static final int WRIST_MASTER = 11;
    public static final int WRIST_SLAVE0 = 10; // only in 2019

    public static final int WRIST_SWITCH_TOP = 3;
    public static final int WRIST_SWITCH_BOT = 2;

    // INTAKE
    public static final int INTAKE_TALON_LEFT = 2; // 2018
    public static final int INTAKE_TALON_RIGHT = 4; // 2018
    public static final int INTAKE_MASTER = 8; // 2019
    public static final int INTAKE_SLAVE0 = 9; // 2019

    // CLIMBER
    public static final int CLIMBER_MASTER = 6; // 2019
    public static final int CLIMBER_SLAVE0 = 7; // 2019

    // PNEUMATICS
    public static final int PCM_ID = 61;

    // Power Distribution Panel - NOTE FRC says needs to be 0 for 2018 WPILib
    public static final int PDP_ID = 0;

    /**
     * There are two double solenoids controlled by the PCM solenoid 1 select open
     * or close if open, set sol 2 off
     *
     * solenoid 2 select close lo pressure or close high pressure
     */
    public static final int INTAKE_SOL_1_FWD_OPEN = 0;
    public static final int INTAKE_SOL_1_REV_CLOSE = 1;
    public static final int INTAKE_SOL_2_FWD_LO = 2;
    public static final int INTAKE_SOL_2_REV_HI = 3;

}