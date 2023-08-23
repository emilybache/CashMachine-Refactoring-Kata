import { BankAccount } from './BankAccount';

export class PersonalAccountsManager {
  private readonly accounts: BankAccount[] = [];

  constructor() {
    // in a real system it would load bank accounts from a database
    this.accounts.push(new BankAccount('Arthur', 800));
  }

  getAccountForCustomer(
    customerName: string /*, String bankManager */
  ): BankAccount {
    const customerAccount = this.accounts
      .find(a => a.accountHolder === customerName);

    if (!customerAccount) {
      throw new Error(`unknown customer ${customerName}`);
    }

    return customerAccount;
  }
}
