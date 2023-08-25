#include <stdarg.h>
#include <setjmp.h>
#include <stddef.h>
#include "cmocka.h"

#include "cash.h"
#include "account.h"

static void test_withdraw(void **state)
{
    Cash* accountBalance = Cash_create(4200);
    Cash* toWithdraw = Cash_create(100);
    Account* account = Account_create(1234, accountBalance);
    assert_true(withdraw_from_account(account, toWithdraw));
first    assert_int_equal(4100, toWithdraw->cents);
}

int main(void) {
    const struct CMUnitTest tests[] =
            {
                    cmocka_unit_test(test_withdraw),
            };

    return cmocka_run_group_tests(tests, NULL, NULL);
}
