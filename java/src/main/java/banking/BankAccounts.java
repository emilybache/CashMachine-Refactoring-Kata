package banking;

import java.math.BigDecimal;
import java.util.List;

public final class BankAccounts {
    private final List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
        accounts.add(new BankAccount("Arthur", BigDecimal.valueOf(800)));
    }

    public List<BankAccount> accounts() {
        return accounts;
    }
}
