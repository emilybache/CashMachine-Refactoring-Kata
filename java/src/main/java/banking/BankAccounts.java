package banking;

import java.math.BigDecimal;
import java.util.List;

public final class BankAccounts {
    private final List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
        accounts.add(new BankAccount("Arthur", BigDecimal.valueOf(800)));
    }

    boolean withdraw(String customerName, BigDecimal cashAmount) {
        return accounts.stream()
                .filter(a -> a.belongsTo(customerName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown customer " + customerName))
                .withdraw(cashAmount);
    }
}
