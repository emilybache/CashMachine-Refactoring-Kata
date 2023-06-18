from decimal import Decimal
from dataclasses import dataclass


@dataclass
class BankAccount:
    holder: str
    balance: Decimal

    def withdraw(self, amount):
        if 0 < amount < self.balance:
            self.balance -= amount
            return True
        return False
