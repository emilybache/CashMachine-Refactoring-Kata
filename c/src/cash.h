#ifndef CASHMACHINE_CASH_H
#define CASHMACHINE_CASH_H

#include <stdbool.h>

typedef struct Cash {
    int cents;
} Cash;

Cash* Cash_create(int cents);

#endif //CASHMACHINE_CASH_H
