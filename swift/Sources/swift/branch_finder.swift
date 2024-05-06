class BranchFinder {

    func findBranch(forTown town: String) -> Branch {
        // in a real system it would look in a database for this information
        return Branch(name: town)
            
    }
}
