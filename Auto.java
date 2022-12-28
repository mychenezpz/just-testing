package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="Auto", group="TeleOp")

public class Auto extends LinearOpMode {
    
    RobotHardware robot = new RobotHardware();


    @Override
    public void runOpMode() {
        
        robot.init(hardwareMap);
        
       
        waitForStart();
        
        robot.motor1.setTargetPosition(1000);
        robot.motor2.setTargetPosition(-1000);
        robot.motor1.setPower(1);
        robot.motor2.setPower(1);
        //servoArm.setPosition(1);
        sleep(2000);
        
        

    }
}
