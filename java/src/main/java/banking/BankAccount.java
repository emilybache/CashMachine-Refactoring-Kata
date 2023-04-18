package banking;

import java.math.BigDecimal;

class BankAccount {
    private BigDecimal accountBalance;
    private String accountHolder;

    public BankAccount(String accountHolder, BigDecimal balance) {
        this.accountHolder = accountHolder;
        this.accountBalance = balance;
    }

    public boolean withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(accountBalance) <= 0) {
            this.accountBalance = this.accountBalance.subtract(amount);
            return true;
        }

        return false;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
