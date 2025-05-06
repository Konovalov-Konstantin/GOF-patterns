package strategy.example2;

public class Main {
    public static void main(String[] args) {
        SensorFactory sensorFactory = new SensorFactory();
        SensorProcessor processor = sensorFactory.createProcessor("second");
        processor.process();
    }
}
