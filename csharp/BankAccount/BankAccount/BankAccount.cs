namespace Banking;

public class BankAccount
{
    public decimal AccountBalance { get; set; }
    public Customer AccountHolder { get; }

    public BankAccount(Customer accountHolder, decimal balance)
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