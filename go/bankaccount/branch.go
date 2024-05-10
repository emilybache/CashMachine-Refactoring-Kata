package bankaccount

type Branch struct {
	name    string
	manager string
}

func (b *Branch) PersonalAccounts() *PersonalAccountsManager {
	return NewPersonalAccountsManager()
}

func NewDefaultBranch(town string) *Branch {
	return &Branch{
		name:    town,
		manager: "Mr Gringotts Goblin",
	}
}
