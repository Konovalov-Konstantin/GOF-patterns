package strategy.example2;

import java.util.Map;
import java.util.function.Supplier;

public class SensorFactory {
    /**
     * Вариант с Supplier
     */
    private final Map<String, Supplier<SensorProcessor>> suppliers = Map.of(
            "first", FirstSensorProcessorImpl::new,
            "second", SecondSensorProcessorImpl::new
    );

    public SensorProcessor createProcessor(String type) {
        Supplier<SensorProcessor> sensorSupplier = suppliers.get(type);
        if (sensorSupplier == null) {
            throw new IllegalArgumentException("Unsopported sensor type: " + type);
        }
        return sensorSupplier.get();
    }


    /** Вариант со switch */
//    SensorProcessor createSensorProcessor(String sensorType) {
//        switch (sensorType) {
//            case "first": return new FirstSensorProcessorImpl();
//            case "second": return new SecondSensorProcessorImpl();
//            default: throw new IllegalArgumentException("Unknown sensor");
//        }
//    };
}
