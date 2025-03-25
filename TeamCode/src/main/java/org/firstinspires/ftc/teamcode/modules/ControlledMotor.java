package org.firstinspires.ftc.teamcode.modules;

import org.firstinspires.ftc.teamcode.components.VelocityMotor;

import java.util.function.BiFunction;

public class ControlledMotor extends Module{

    private final VelocityMotor motor;

    private final BiFunction<Double, Double, Double> controlSignal;

    public ControlledMotor(VelocityMotor motor, BiFunction<Double, Double, Double> controlSignal) {
        this.motor = motor;
        this.controlSignal = controlSignal;
    }
    @Override
    public void update() {
        motor.setVelocity(controlSignal.apply(motor.getVelocity(), motor.getMaxVelocity()));
    }
}
