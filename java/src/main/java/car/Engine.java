package car;

public class Engine {
    private FuelSystem fuelSystem;

    public Engine(FuelSystem fuelSystem) {
        this.fuelSystem = fuelSystem;
    }

    public FuelSystem getFuelSystem() {
        return fuelSystem;
    }
}
