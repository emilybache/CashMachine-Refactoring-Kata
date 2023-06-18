from decimal import Decimal

from python.bankaccount.account import BankAccount


class PersonalAccountsManager:
    accounts: list[BankAccount]

    def __init__(self):
        self.accounts.append(BankAccount('Arthur', Decimal(800_000_000)))

    def get_account_for_customer(self, customer_name: str):
        account = next(
            (a for a in self.accounts
            if a.holder == customer_name),
            None
        )
        if account is None:
            raise ValueError(f'Unknown customer {customer_name}')
        return account
