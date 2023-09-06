namespace Examples;

public class NewspaperDeliveryService
{
    public void HandlePayment(Customer customer)
    {
        var money = customer.Wallet.TakeOutMoney(2);
        AddToPocket(money);
    }

    private void AddToPocket(decimal money)
    {
        // logic to add money to own pocket
    }
}

public class MagazineDeliveryService
{
	public void HandlePayment(Customer customer)
	{
		var money = customer.RequestPayment(2);
		AddToPocket(money);
	}
    
    private void AddToPocket(decimal money)
    {
        // logic to add money to own picket
    }
}

public class Customer
{
    public Wallet Wallet => new Wallet();

    public decimal RequestPayment(decimal amount)
    {
        // logic to get money from wallet
        
        throw new NotImplementedException();
    }
}

public class Wallet
{
    public decimal TakeOutMoney(decimal amount)
    {
        // logic to take money out 
        
        throw new NotImplementedException();
    }
}