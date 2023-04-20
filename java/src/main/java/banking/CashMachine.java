package banking;

import java.math.BigDecimal;

class CashMachine {
    private final BranchFinder branchFinder = new BranchFinder();

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return branchFinder
                .findBranchForTown(town)
                .getPersonalAccounts()
                .getAccountForCustomer(customerName)
                .withdraw(cashAmount);
    }
}
