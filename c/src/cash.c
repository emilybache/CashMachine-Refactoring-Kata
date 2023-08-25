
#include <stdlib.h>
#include "cash.h"


Cash *Cash_create(int cents) {
    Cash* cash = malloc(sizeof(*cash));
    cash->cents = cents;

    return cash;
}
