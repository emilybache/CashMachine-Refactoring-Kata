package banking;

import java.math.BigDecimal;
import java.util.ArrayList;

class Branch {
    private final String name;
    private final String branchManager;
    private final PersonalAccountsManager personalAccounts;

    public Branch(String name) {
        this.name = name;
        this.branchManager = "Mr Gringotts Goblin";
        this.personalAccounts = new PersonalAccountsManager(new BankAccounts(new ArrayList<BankAccount>()));
    }

    boolean withdraw(String customerName, BigDecimal cashAmount) {
        return personalAccounts.withdraw(customerName, cashAmount);
    }

    public String getName() {
        return name;
    }

    public String getBranchManager() {
        return branchManager;
    }

}
