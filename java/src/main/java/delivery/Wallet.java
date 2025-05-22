package delivery;

import java.math.BigDecimal;

public class Wallet {
    private BigDecimal contents = BigDecimal.ZERO;

    public Wallet(BigDecimal initialContents) {
        contents = initialContents;
    }

    public BigDecimal takeOutMoney(BigDecimal amount) {
        if (contents.compareTo(amount) >= 0) {
            contents = contents.subtract(amount);
            return amount;
        }
        return BigDecimal.ZERO;
    }
}
