package banking;

class BranchFinder {
    public Branch findBranchForTown(String town) {
        // in a real system it would look in a database for this information
        return new Branch(town);
    }
}
