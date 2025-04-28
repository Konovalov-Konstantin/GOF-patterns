package facade.homeTheaterSystem;

public class TheaterLights {

    int light;

    public void dim(int light) {
        this.light = light;
    }

    public void on() {
        light = 100;
    }
}
