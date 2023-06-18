from decimal import Decimal

from python.bankaccount.branch_finder import BranchFinder


class CashMachine:
    @property
    def branch_finder(self):
        return BranchFinder()

    def withdraw(self, town: str, customer: str, amount: Decimal):
        return self.branch_finder \
            .find_branch_for_town(town) \
            .personal_accounts() \
            .get_account_for_customer(customer) \
            .withdraw(amount)
