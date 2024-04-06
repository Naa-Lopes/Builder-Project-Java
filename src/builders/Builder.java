package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

	// Define o tipo de carro (Sedan, SUV, etc.).
    void setCarType(CarType type);

    //Define o numero de assentos no carro.
    void setSeats(int seats);

    //Define o motor do carro.
    void setEngine(Engine engine);

    //Define o tipo de transmissao (automatica, manual).
    void setTransmission(Transmission transmission);

    //Define a presenca de um computador de viagem.
    void setTripComputer(TripComputer tripComputer);

    //Define a presenca de um navegador GPS.
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
