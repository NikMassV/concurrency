package edu.nm.concurrency.patterns.creational.builder.builders;

import edu.nm.concurrency.patterns.creational.builder.cars.CarType;
import edu.nm.concurrency.patterns.creational.builder.components.Engine;
import edu.nm.concurrency.patterns.creational.builder.components.GPSNavigator;
import edu.nm.concurrency.patterns.creational.builder.components.Transmission;
import edu.nm.concurrency.patterns.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
