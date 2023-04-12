namespace RobotCleaner1;

public class PersonalAccountsManager
{
    private List<BankAccount> Accounts { get; }

    public BankAccount GetAccountForCustomer(string customerName)
    {
        var accountForCustomer = new BankAccount();
        accountForCustomer.AccountBalance = 800;
        return accountForCustomer;
    }
}