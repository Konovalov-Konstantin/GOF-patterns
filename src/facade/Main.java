package facade;

import facade.homeTheaterSystem.*;

public class Main {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade facade = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);
        facade.watchMovie("Terminator");
        System.out.println("*** \n");
        facade.endMovie();
    }
}
