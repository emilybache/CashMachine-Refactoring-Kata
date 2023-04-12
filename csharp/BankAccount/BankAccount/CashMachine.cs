namespace RobotCleaner1;

public class CashMachine
{
    public BranchFinder BranchFinder { get; set; }

    public bool Withdraw(string town, string customerName, decimal cashAmount)
    {
        return BranchFinder
            .FindBranchForTown(town)
            .PersonalAccounts
            .GetAccountForCustomer(customerName)
            .Withdraw(cashAmount);
    }
}

