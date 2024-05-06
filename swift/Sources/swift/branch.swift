struct Branch {
    let name: String
    let manager: String = "Mr Gringotts Goblin"
    
    func personalAccounts() -> PersonalAccountsManager {
        return PersonalAccountsManager()
    }
}
