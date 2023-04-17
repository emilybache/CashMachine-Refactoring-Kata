namespace Banking;

public class Branch
{
    public string Name { get; }

    public string BranchManager { get; }

    public PersonalAccountsManager PersonalAccounts { get; } = new PersonalAccountsManager();

    public Branch(string name)
    {
        Name = name;
        BranchManager = "Mr Gringotts Goblin";
    }

    public bool Withdraw(string customerName, decimal cashAmount)
    {
        return PersonalAccounts.Withdraw(customerName, cashAmount);
    }
}