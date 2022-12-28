package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.GyroSensor;

public class RobotHardware 
{

    /* Declare OpMode members. */
    private LinearOpMode myOpMode = null;   // gain access to methods in the calling OpMode.

   //ISTANTIATE MOTORS AND SERVOS//
    public DcMotor motor1;
    public DcMotor motor2;
    public DcMotor motor3;
    public DcMotor motor4;
    public DcMotor motor5;
    public Servo servo0;
    public Servo servo1;

   /* 
    //ISTANTIATE SENSORS
    public GyroSensor gyroSensor;
    */

    // CREATING THE HARDWARE MAP
    HardwareMap hardwareMap;
    
    public void init(HardwareMap hardwareMap) {
        
        // DEFINIE MOTORS AND SERVOS
      //  motor0 = harwareMap.get(DcMotor.class, "motor0");
        motor1  = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");
        motor5 = hardwareMap.get(DcMotor.class, "motor5");
        servo0  = hardwareMap.get(Servo.class, "servo0");
        servo1  = hardwareMap.get(Servo.class, "servo1");
        
        //DEFINE SENSORS
        //gyroSensor = hardwareMap.get(GyroSensor.class, "gyroSensor");
    
        //SET MOTOR POWER
     //   motor0.setPower(0);
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);
        motor5.setPower(0);
      //  servo0.setDirection(REVERSE);
      //  servo1.setDirection(REVERSE);
        
        
        //SET MOTOR MODE
     //   motor0.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor3.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor4.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor5.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        //SET MOTOR TO zeroPowerBehavior
      //  motor0.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor3.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor4.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor5.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        
        //SET SERVO POSITION
        servo0.setPosition(130);
        servo1.setPosition(0);
   
        // CALIBRATE SENSORS
       //gyroSensor.calibrate();
    
    }
    

}
