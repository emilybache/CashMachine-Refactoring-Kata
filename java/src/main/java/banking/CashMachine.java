package banking;

import java.math.BigDecimal;

class CashMachine {
    private final BranchFinder branchFinder = new BranchFinder();

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        var branch = branchFinder.findBranchForTown(town);
        return branch.extracted(customerName, cashAmount);
    }

}
