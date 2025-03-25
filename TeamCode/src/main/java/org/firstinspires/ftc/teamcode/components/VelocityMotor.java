package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class VelocityMotor extends Component{
    private final Motor motor;
    private double velocity = 0d;

    private double maxVel = 1d;
    public VelocityMotor(String name, OpMode opMode, DcMotorSimple.Direction direction, double maxVel) {
        this.motor = new Motor(name, opMode);
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setDirection(direction);
        this.maxVel = maxVel;
    }
    public VelocityMotor(String name, OpMode opMode, double maxVel) {
        this.motor = new Motor(name, opMode);
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        this.maxVel = maxVel;
    }

    public VelocityMotor(String name, OpMode opMode, DcMotorSimple.Direction direction) {
        this.motor = new Motor(name, opMode);
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setDirection(direction);
    }

    public VelocityMotor(String name, OpMode opMode) {
        this.motor = new Motor(name, opMode);
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
        motor.setPower(velocity/maxVel);
    }

    public double getVelocity() {
        return velocity;
    }

    public double getMaxVelocity() {
        return maxVel;
    }

    public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
        return motor.getZeroPowerBehavior();
    }
    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior) {
        motor.setZeroPowerBehavior(zeroPowerBehavior);
    }
}
