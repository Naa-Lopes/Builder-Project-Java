package components;

/**
 * Just another feature of a car.
 */
public class Engine {
	//O volume do motor (imutável).
    private final double volume;
    //A quilometragem percorrida pelo motor.
    private double mileage;
    //Indica se o motor está ligado ou desligado.
    private boolean started;

    //Construtor que inicializa o motor com o volume e quilometragem especificados.
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    //Liga o motor.
    public void on() {
        started = true;
    }

    //Desliga o motor.
    public void off() {
        started = false;
    }

    
    //Retorna `true` se o motor estiver ligado, `false` caso contrário.
    public boolean isStarted() {
        return started;
    }
    
    //Aumenta a quilometragem do motor em `quilometragem`.
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    //Retorna o volume do motor.
    public double getVolume() {
        return volume;
    }

    //Retorna a quilometragem percorrida pelo motor.
    public double getMileage() {
        return mileage;
    }
}
