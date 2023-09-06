namespace Examples;

public class Car
{
    private readonly Engine _engine = new();

    public void Start()
    {
        _engine.FuelSystem.FuelPump.Start();
    }
}

internal class Engine
{
    public FuelSystem FuelSystem => new FuelSystem();
}

internal class FuelSystem
{
    public FuelPump FuelPump => new FuelPump();
}

internal class FuelPump
{
    public void Start()
    {
        // start the fuel pump
        
        throw new NotImplementedException();
    }
}