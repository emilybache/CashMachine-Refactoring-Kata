package banking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class PersonalAccountsManager {
    private final List<BankAccount> accounts;

    public PersonalAccountsManager() {
        // in a real system it would load bank accounts from a database
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Arthur", BigDecimal.valueOf(800L)));
    }

    boolean withdraw(String customerName, BigDecimal cashAmount) {
        // new feature to start lookup by String bankManager too, but how? We're past branch now?
        return accounts.stream()
                .filter(a -> a.belongsTo(customerName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown customer " + customerName))
                .withdraw(cashAmount);
    }

}
