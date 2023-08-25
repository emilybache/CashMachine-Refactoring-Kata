#ifndef CASHMACHINE_PERSONAL_ACCOUNTS_H
#define CASHMACHINE_PERSONAL_ACCOUNTS_H

#include "branch_finder.h"
#include "cash.h"

typedef struct PersonalAccountManager {
    int branch_id;
} PersonalAccountManager;

typedef struct Account {
    int customerId;
    Cash* balance;
} Account;

Account* Account_create(int customerId, Cash* balance);

PersonalAccountManager* personal_accounts_for_branch(Branch* branch);

Account* get_account_for_customer(PersonalAccountManager* manager, int customerId);

#endif //CASHMACHINE_PERSONAL_ACCOUNTS_H
