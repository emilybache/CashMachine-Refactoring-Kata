package banking;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CashMachineTest {

    private CashMachine cashMachine = new CashMachine();

    @Test
    void withdraw_succeeds() {
        boolean result = cashMachine.withdraw("London", "Arthur", new BigDecimal(100));
        assertTrue(result);
    }

    @Test
    void withdraw_fails() {
        boolean result = cashMachine.withdraw("London", "Arthur", new BigDecimal(1000));
        assertFalse(result);
    }

    @Test
    void withdraw_throws_for_unknown_customer() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> cashMachine.withdraw("London", "John Doe", new BigDecimal(100)))
                .withMessage("unknown customer John Doe");
    }

}
