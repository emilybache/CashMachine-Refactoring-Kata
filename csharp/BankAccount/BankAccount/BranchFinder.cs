namespace Banking;

public class BranchFinder
{
    public Branch FindBranchForTown(string town)
    {
        // in a real system it would look in a database for this information
        return new Branch(town);
    }
}