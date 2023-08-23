export class BankAccount {
  constructor(
    public readonly accountHolder: string,
    public accountBalance: number
  ) {}

  withdraw(amount: number): boolean {
    if (amount > 0 && amount <= this.accountBalance) {
      this.accountBalance -= amount;

      return true;
    }

    return false;
  }
}
