from dataclasses import dataclass, field

from python.bankaccount.accounts_manager import PersonalAccountsManager


@dataclass
class Branch:
    name: str
    manager: str = field(default='Mr Gringotts Goblin')

    def personal_accounts(self):
        return PersonalAccountsManager()
