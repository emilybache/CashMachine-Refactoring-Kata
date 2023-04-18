package banking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class PersonalAccountsManager {
    private final List<BankAccount> accounts = new ArrayList<>();

    public PersonalAccountsManager() {
        // in a real system it would load bank accounts from a database
        accounts.add(new BankAccount("Arthur", BigDecimal.valueOf(800L)));
    }

    boolean withdraw(String customerName, BigDecimal cashAmount) {
        return getAccountForCustomer(customerName).withdraw(cashAmount);
    }

    public BankAccount getAccountForCustomer(String customerName /*, string bankManager */) {
        return accounts.stream()
                .filter(a -> a.getAccountHolder().equals(customerName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("unknown customer " + customerName));
    }
}
