namespace Banking;

public class PersonalAccountsManager
{
    private List<BankAccount> Accounts { get; } = new List<BankAccount>();

    public PersonalAccountsManager()
    {
        // in a real system it would load bank accounts from a database
        Accounts.Add(new BankAccount("Arthur", 800m));
    }

    public BankAccount GetAccountForCustomer(string customerName /*, string branchManager */)
    {
        var account = Accounts.Find(a => a.AccountHolder == customerName);
        if (account == null)
        {
            throw new ArgumentException("unknown customer " + customerName);
        }

        return account;
    }

    public bool Withdraw(string customerName, decimal cashAmount)
    {
        var bankAccount = GetAccountForCustomer(customerName);
        return bankAccount.Withdraw(cashAmount);
    }
}