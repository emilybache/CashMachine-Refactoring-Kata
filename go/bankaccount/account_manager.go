package bankaccount

type PersonalAccountsManager struct {
	accounts []*BankAccount
}

func (p *PersonalAccountsManager) GetAccountForCustomer(customerName string) *BankAccount {
	for _, account := range p.accounts {
		if account.holder == customerName {
			return account
		}
	}
	panic("unknown customer")
	return nil
}

func NewPersonalAccountsManager() *PersonalAccountsManager {
	return &PersonalAccountsManager{
		accounts: []*BankAccount{{holder: "Arthur", Balance: 800000000}},
	}
}
