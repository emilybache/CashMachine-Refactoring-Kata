package bankaccount

type BranchFinder struct {
}

func (f *BranchFinder) FindBranchForTown(town string) *Branch {
	// in a real system it would look in a database for the information
	return NewDefaultBranch(town)
}
