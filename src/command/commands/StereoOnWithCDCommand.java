package command.commands;

import command.devices.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setFirstCD();
        stereo.setVolume(10);
        stereo.play();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
