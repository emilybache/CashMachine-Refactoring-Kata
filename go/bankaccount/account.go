package bankaccount

type BankAccount struct {
	holder  string
	Balance int
}

func (b *BankAccount) Withdraw(amount int) bool {
	if 0 < amount && amount < b.Balance {
		b.Balance -= amount
		return true
	}
	return false
}
