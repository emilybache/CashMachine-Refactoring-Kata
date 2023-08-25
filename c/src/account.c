
#include "account.h"

bool withdraw_from_account(Account* account, Cash* cash) {
    if (cash->cents > 0 && account->balance->cents >= cash->cents)
    {
        int new_cents = account->balance->cents - cash->cents;
        account->balance->cents = new_cents;
        return true;
    }
    return false;
}

