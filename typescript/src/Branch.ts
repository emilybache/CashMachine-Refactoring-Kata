import { PersonalAccountsManager } from './PersonalAccountsManager';

export class Branch {
  public readonly branchManager = 'Mr Gringotts Goblin';
  public readonly personalAccounts = new PersonalAccountsManager();

  constructor(private readonly name: string) {}
}
