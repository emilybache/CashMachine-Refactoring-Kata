class BankAccount {
    let holder: String
    var balance: Double

    init(holder: String, balance: Double) {
        self.holder = holder
        self.balance = balance
    }

    func withdraw(amount: Double) -> Bool {
        guard 0 < amount && amount < balance else { return false }  // Combine conditions
        balance -= amount
        return true
    }
}
