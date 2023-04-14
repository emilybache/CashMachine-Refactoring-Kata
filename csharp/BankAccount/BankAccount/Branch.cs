namespace RobotCleaner1;

public class Branch
{
    public Branch(string name)
    {
        Name = name;
    }

    public string Name { get; }

    public PersonalAccountsManager PersonalAccounts { get; } = new PersonalAccountsManager();
}