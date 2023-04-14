namespace RobotCleaner1;

public class BankAccount
{
    public decimal AccountBalance { get; set; }
    public string AccountHolder { get; }

    public BankAccount(string accountHolder, decimal balance)
    {
        AccountHolder = accountHolder;
        AccountBalance = balance;
    }

    public bool Withdraw(decimal amount)
    {
        if (amount > 0 && amount <= AccountBalance)
        {
            this.AccountBalance -= amount;
            return true;
        }

        return false;
    }
}
