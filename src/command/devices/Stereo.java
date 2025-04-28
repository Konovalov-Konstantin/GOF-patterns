package command.devices;

public class Stereo {

    public void on() {
        System.out.println("Stereo on");
    }

    public void setFirstCD() {
        System.out.println("Stereo set first CD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume " + volume);
    }

    public void play() {
        System.out.println("Stereo play");
    }

    public void off() {
        System.out.println("Stereo off");
    }
}
