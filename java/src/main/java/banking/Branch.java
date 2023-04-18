package banking;

import java.math.BigDecimal;

class Branch {
    private final String name;
    private final String branchManager;
    private final PersonalAccountsManager personalAccounts = new PersonalAccountsManager();

    public Branch(String name) {
        this.name = name;
        this.branchManager = "Mr Gringotts Goblin";
    }

    boolean extracted(String customerName, BigDecimal cashAmount) {
        var accountForCustomer = this.personalAccounts.getAccountForCustomer(customerName);
        return accountForCustomer.withdraw(cashAmount);
    }

    public String getName() {
        return name;
    }

    public String getBranchManager() {
        return branchManager;
    }

}
