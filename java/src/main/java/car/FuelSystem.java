package car;

public class FuelSystem {
    private FuelPump fuelPump;
    public FuelSystem(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public FuelPump GetFuelPump() {
        return fuelPump;
    }
}
