package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="DriverControlled", group="TeleOp")
public class DriverControlled extends OpMode{

    // DEFINE robot
    RobotHardware robot = new RobotHardware();
    
    //CONSTANTS AND VARIABLES
   
    
  
   // RUN ONCE ON INIT()
    @Override
    public void init() {
        robot.init(hardwareMap);
        telemetry.addData("STATUS", "Initialized");
} 

   // LOOP ON init()
    @Override
    public void init_loop() {
    }

    //RUNS ONCE ON PLAY()
    @Override
    public void start() {
    }

    // LOOPS ON start()
    @Override
    public void loop() {
        float G1rightStickY = -gamepad1.right_stick_y;
        float G1leftStickY = -gamepad1.left_stick_y;
        float G1rightStickX = -gamepad1.right_stick_x;
        float G1leftStickX = -gamepad1.left_stick_x;
        boolean G1rightBumper = gamepad1.right_bumper;
        boolean G1leftBumper = gamepad1.left_bumper;
        boolean G1y = gamepad1.y;
        boolean G1x = gamepad1.x;
        boolean G1a = gamepad1.a; 
        

        
        if (G1rightBumper) {
            robot.motor1.setPower(1);
            robot.motor2.setPower(-1);
            robot.motor3.setPower(-1);
            robot.motor4.setPower(1);  
        
        } else if (G1leftBumper) {
            robot.motor1.setPower(-1);
            robot.motor2.setPower(1);
            robot.motor3.setPower(1);
            robot.motor4.setPower(-1);  
        } else {
            robot.motor1.setPower(G1leftStickY);
            robot.motor2.setPower(G1leftStickY);
            robot.motor3.setPower(-G1rightStickY);
            robot.motor4.setPower(-G1rightStickY);
        }
        /*if (G1rightStickX!=0.0) {
            robot.motor1.setPower(1);
            robot.motor2.setPower(0);
            robot.motor3.setPower(0);
            robot.motor4.setPower(1);
        }
        else if (G1leftStickX!=0.0) {
            robot.motor1.setPower(0);
            robot.motor2.setPower(1);
            robot.motor3.setPower(1);
            robot.motor4.setPower(0);   
        }*/
        
        
        if (G1x) {
            robot.servo0.setPosition(1);
            robot.servo1.setPosition(1);
            
        } else if (G1x == false) {
            robot.servo0.setPosition(0.0);
            robot.servo1.setPosition(0.75);
            
        }
        
        if (G1y) {
            robot.motor5.setPower(1);
        } else if (G1y == false){
            robot.motor5.setPower(0);
        }
        
        if (G1a) {
            robot.motor5.setPower(-1);
        } else if (G1a == false){
            robot.motor5.setPower(0);
        }
        
      
        
        telemetry.addData("motor1 Power", robot.motor1.getPower());
        
    }

    // RUN ONCE ON STOP 
    @Override
    public void stop() {
    } 
}
