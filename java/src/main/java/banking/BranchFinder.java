package banking;

import java.math.BigDecimal;

class BranchFinder {

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return findBranchForTown(town).withdraw(customerName, cashAmount);
    }

    private Branch findBranchForTown(String town) {
        // in a real system it would look in a database for this information
        return new Branch(town);
    }
}
