
#include "cash_machine.h"
#include "branch_finder.h"
#include "personal_accounts.h"
#include "account.h"

bool withdraw(int town_code, int customer_id, Cash* cashAmount)
{
    return withdraw_from_account(get_account_for_customer(personal_accounts_for_branch(find_branch_for_town(town_code)), customer_id), cashAmount);
}
