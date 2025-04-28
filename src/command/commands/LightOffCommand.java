package command.commands;

import command.devices.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {    // В переменной light конструктору передается конкретный объект, которым будет управлять команда
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.off();
    }
}
