package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.components.Motor;
import org.firstinspires.ftc.teamcode.components.VelocityMotor;
import org.firstinspires.ftc.teamcode.modules.ControlledMotor;

public class TeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot();
        robot.addModule(new ControlledMotor(new VelocityMotor("testmotor",this,100.0),(vel, maxVel) -> vel-gamepad1.left_stick_y));
        waitForStart();
        while (opModeIsActive()) {
            robot.update();
        }
    }
}