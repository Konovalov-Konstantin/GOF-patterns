package facade.homeTheaterSystem;

public class StreamingPlayer {
    public void on() {
        System.out.println("StreamingPlayer on");
    }

    public void play(String movie) {
        System.out.println("StreamingPlayer play " + movie);
    }

    public void stop() {
        System.out.println("StreamingPlayer stop");
    }

    public void off() {
        System.out.println("StreamingPlayer off");
    }
}
