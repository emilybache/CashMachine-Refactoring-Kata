namespace Banking;

public class PersonalAccountsManager
{
    private List<BankAccount> Accounts { get; } = new List<BankAccount>();

    public PersonalAccountsManager()
    {
        // in a real system it would load bank accounts from a database
        Accounts.Add(new BankAccount(new Customer("Arthur"), 800m));
    }

    public BankAccount GetAccountForCustomer(string customerName /*, string bankManager */)
    {
        var account = Accounts.Find(a => a.AccountHolder.Name == customerName);
        if (account == null)
        {
            throw new ArgumentException("unknown customer " + customerName);
        }

        return account;
    }
}