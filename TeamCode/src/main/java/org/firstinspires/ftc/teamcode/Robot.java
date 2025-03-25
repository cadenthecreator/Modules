package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.modules.Module;

import java.util.List;

public class Robot {
    private final List<Module> Modules;
    public Robot() {
        Modules = List.of();
    }

    public void update() {
        for (Module module : Modules) {
            module.update();
        }
    }

    public void addModule(Module module) {
        Modules.add(module);
    }
}
