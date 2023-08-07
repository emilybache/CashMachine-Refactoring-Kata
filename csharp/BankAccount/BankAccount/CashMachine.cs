namespace Banking;

public class CashMachine
{
    public AccountAccess AccountAccess { get; } = new AccountAccess();

    public bool Withdraw(string town, string customerName, decimal cashAmount)
    {
        return AccountAccess.Withdraw(town, customerName, cashAmount);
    }
}

