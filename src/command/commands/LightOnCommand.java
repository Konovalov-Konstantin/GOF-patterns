package command.commands;

import command.devices.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {    // В переменной light конструктору передается конкретный объект, которым будет управлять команда
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
