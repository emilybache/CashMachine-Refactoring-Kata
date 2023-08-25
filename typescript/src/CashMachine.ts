import { BranchFinder } from './BranchFinder';

export class CashMachine {
  private readonly branchFinder = new BranchFinder();

  withdraw({ cashAmount, customerName, town }: {
    town: string;
    customerName: string;
    cashAmount: number;
  }): boolean {
    return this.branchFinder
      .findBranchForTown(town)
      .personalAccounts
      .getAccountForCustomer(customerName)
      .withdraw(cashAmount);
  }
}
