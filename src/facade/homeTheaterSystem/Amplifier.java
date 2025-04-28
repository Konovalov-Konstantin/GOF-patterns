package facade.homeTheaterSystem;

public class Amplifier {

    StreamingPlayer streamingPlayer;
    int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.streamingPlayer = player;
    }

    public void setSurroundSound() {
        System.out.println("Amplifier set Surround Sound");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
