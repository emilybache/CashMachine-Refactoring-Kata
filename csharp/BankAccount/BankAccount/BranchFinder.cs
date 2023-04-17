namespace Banking;

public class BranchFinder
{
    public Branch FindBranchForTown(string town)
    {
        // in a real system it would look in a database for this information
        return new Branch(town);
    }

    public bool Withdraw(string town, string customerName, decimal cashAmount)
    {
        var branch = FindBranchForTown(town);
        return branch.Withdraw(customerName, cashAmount);
    }
}