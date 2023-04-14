namespace RobotCleaner1;

public class CashMachine
{
    public BranchFinder BranchFinder { get; }

    public bool Withdraw(string town, string customerName, decimal cashAmount)
    {
        return BranchFinder
            .FindBranchForTown(town)
            .PersonalAccounts
            .GetAccountForCustomer(customerName)
            .Withdraw(cashAmount);
    }
}

