namespace Banking;

public class CashMachine
{
    public BranchFinder BranchFinder { get; } = new BranchFinder();

    public bool Withdraw(string town, string customerName, decimal cashAmount)
    {
        return BranchFinder.Withdraw(town, customerName, cashAmount);
    }
}

