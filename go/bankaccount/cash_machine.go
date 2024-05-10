package bankaccount

type CashMachine struct{}

func (c *CashMachine) BranchFinder() *BranchFinder {
	return &BranchFinder{}
}

func (c *CashMachine) Withdraw(town string, customer string, amount int) bool {
	return c.BranchFinder().
		FindBranchForTown(town).
		PersonalAccounts().
		GetAccountForCustomer(customer).
		Withdraw(amount)
}
