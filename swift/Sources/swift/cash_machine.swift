class CashMachine {
    
    let branchFinder = BranchFinder()
    
    func withdraw(
        town: String,
        customer: String,
        amount: Double
    ) throws -> Bool {
        
        try branchFinder
            .findBranch(forTown: town)
            .personalAccounts()
            .getAccount(forCustomer: customer)
            .withdraw(amount: amount)
    }
}
