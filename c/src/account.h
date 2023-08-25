#ifndef CASHMACHINE_ACCOUNT_H
#define CASHMACHINE_ACCOUNT_H

#include <stdbool.h>
#include "personal_accounts.h"
#include "cash.h"

bool withdraw_from_account(Account* account, Cash* cash);

#endif //CASHMACHINE_ACCOUNT_H
