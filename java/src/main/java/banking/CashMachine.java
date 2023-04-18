package banking;

import java.math.BigDecimal;

class CashMachine {
    private final BranchFinder branchFinder = new BranchFinder();

    // i think for the new feature, here we would also start passing the branch manager name
    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return branchFinder.withdraw(town, customerName, cashAmount);
    }

}
