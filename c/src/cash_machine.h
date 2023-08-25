#ifndef CASHMACHINE_CASH_MACHINE_H
#define CASHMACHINE_CASH_MACHINE_H

#include <stdbool.h>
#include "cash.h"

bool withdraw(int town_code, int customer_id, Cash* cashAmount);

#endif //CASHMACHINE_CASH_MACHINE_H
