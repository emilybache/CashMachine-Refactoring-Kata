#include <stdlib.h>

#include "personal_accounts.h"

Account *Account_create(int customerId, Cash *balance) {
    Account* account = malloc(sizeof(*account));
    account->customerId = customerId;
    account->balance = balance;

    return account;
}

PersonalAccountManager* personal_accounts_for_branch(Branch *branch) {
    PersonalAccountManager* result; // not implemented yet
    return result;
}

Account* get_account_for_customer(PersonalAccountManager *manager, int customerId) {
    Account* result; // not implemented yet
    return result;
}
