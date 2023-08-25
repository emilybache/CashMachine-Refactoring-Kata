import { Branch } from './Branch';

export class BranchFinder {
  findBranchForTown(town: string): Branch {
    // in a real system it would look in a database for this information
    return new Branch(town);
  }
}
