package components;

import cars.Car;

/**
 * Just another feature of a car.
 */

//Classe que representa um computador de bordo para um carro.
public class TripComputer {
	
	//Objeto Car associado ao computador de bordo.
    private Car car;

    //Define o carro para o qual o computador de bordo obterá informações.
    public void setCar(Car car) {
        this.car = car;
    }

    //Exibe o nível de combustível atual do carro.
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    //Exibe o status atual do motor do carro (ligado/desligado).
    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
