namespace Banking;

public class Branch
{
    public string Name { get; }

    public string BranchManager { get; }

    public Branch(string name)
    {
        Name = name;
        BranchManager = "Mr Gringotts Goblin";
    }

    public PersonalAccountsManager PersonalAccounts { get; } = new PersonalAccountsManager();
}