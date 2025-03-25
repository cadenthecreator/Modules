package org.firstinspires.ftc.teamcode.components;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Motor extends Component {

    private final DcMotor motor;

    public Motor(String name, OpMode opMode) {
        this.motor = opMode.hardwareMap.get(DcMotor.class,name);
    }

    public void setPower(double velocity) {
        motor.setPower(velocity);
    }

    public double getPower() {
        return motor.getPower();
    }

    public void setMode(DcMotor.RunMode mode) {
        motor.setMode(mode);
    }

    public DcMotor.RunMode getMode() {
        return motor.getMode();
    }

    public void setTargetPosition(int position) {
        motor.setTargetPosition(position);
    }

    public int getTargetPosition() {
        return motor.getTargetPosition();
    }

    public int getCurrentPosition() {
        return motor.getCurrentPosition();
    }

    public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
        return motor.getZeroPowerBehavior();
    }
    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior) {
        motor.setZeroPowerBehavior(zeroPowerBehavior);
    }

    public void setDirection(DcMotorSimple.Direction direction) {
        motor.setDirection(direction);
    }
    public DcMotorSimple.Direction getDirection() {
        return motor.getDirection();
    }

    public boolean isBusy() {
        return motor.isBusy();
    }
}
