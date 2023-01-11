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
        public void backwards(int pos) {
          robot.motor1.setPower(1);  
          robot.motor1.setTargetPosition(-1*pos);
          robot.motor2.setPower(1);  
          robot.motor2.setTargetPosition(pos);
          robot.motor3.setPower(1);  
          robot.motor3.setTargetPosition(-1*pos);
          robot.motor4.setPower(1);  
          robot.motor4.setTargetPosition(pos);
      
        }
        public void forwards(int pos) {
          robot.motor1.setPower(1);  
          robot.motor1.setTargetPosition(pos);
          robot.motor2.setPower(1);  
          robot.motor2.setTargetPosition(-1*pos);
          robot.motor3.setPower(1);  
          robot.motor3.setTargetPosition(pos);
          robot.motor4.setPower(1);  
          robot.motor4.setTargetPosition(-1*pos);
      
        }
        public void strafeleft(int pos) {
          robot.motor1.setPower(1);  
          robot.motor1.setTargetPosition(-1*pos);
          robot.motor2.setPower(1);  
          robot.motor2.setTargetPosition(-1*pos);
          robot.motor3.setPower(1);  
          robot.motor3.setTargetPosition(pos);
          robot.motor4.setPower(1);  
          robot.motor4.setTargetPosition(pos);
      
        }
        public void clockwiseturn(int pos) {
          robot.motor1.setPower(1);  
          robot.motor1.setTargetPosition(pos);
          robot.motor2.setPower(1);  
          robot.motor2.setTargetPosition(pos);
          robot.motor3.setPower(1);  
          robot.motor3.setTargetPosition(pos);
          robot.motor4.setPower(1);  
          robot.motor4.setTargetPosition(pos);
      
        }
        waitForStart();
        //TopL=motor1 TopR=motor2 BottomL=3 BottomR=4
        /*
        To strafe toward the right:
        robot.motor1.setPower(positive)
        robot.motor2.setPower(negative)
        robot.motor3.setPower(negative)
        robot.motor4.setPower(positive)
        To strafe toward the left:
        robot.motor1.setPower(negative)
        robot.motor2.setPower(positive)
        robot.motor3.setPower(positive)
        robot.motor4.setPower(negative)
        https://www.youtube.com/watch?v=yGYcQg_EGRg
        */

      
        
//        robot.motor1.setTargetPosition(1000);
 //       robot.motor2.setTargetPosition(-1000);
 //       robot.motor1.setPower(1);
  //      robot.motor2.setPower(1);
        //servoArm.setPosition(1);
         // strafe left; forward; cone pickup; reverse; rotate right 90 degrees; forward; place cone
      // motor specs: 537.6 ticks per revolution https://www.andymark.com/products/neverest-orbital-20-gearmotor
      // robot wheel circumference: 4pi
      // each revolution: 12.5 inches
      // Lets go
      strafeleft(967);  
      forwards(967);
      clockwiseturn(134);
  
      
        

    }
}
