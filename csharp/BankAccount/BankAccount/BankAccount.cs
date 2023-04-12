namespace RobotCleaner1;

public class BankAccount
{
    public decimal AccountBalance = 800.00m;

    public bool Withdraw(decimal amount)
    {
        if (amount <= AccountBalance)
        {
            this.AccountBalance -= amount;
            return true;
        }

        return false;
    }
}
