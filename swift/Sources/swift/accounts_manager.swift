class PersonalAccountsManager {
    private var accounts: [BankAccount]

    init() {
        self.accounts = [BankAccount(holder: "Arthur", balance: Double(800_000_000))]
    }

    func getAccount(forCustomer customerName: String) throws -> BankAccount {
        guard let account = accounts.first(where: { $0.holder == customerName }) else {
            throw AccountError.unknownCustomer(customerName)
        }
        return account
    }
}

// Custom Error Type (optional but recommended)
enum AccountError: Error {
    case unknownCustomer(String)
}
