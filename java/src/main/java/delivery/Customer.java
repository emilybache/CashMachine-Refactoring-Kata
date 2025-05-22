package delivery;

import java.math.BigDecimal;

public class Customer {
    private Wallet wallet;
    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public BigDecimal requestPayment(BigDecimal amount) {
        return wallet.takeOutMoney(amount);
    }
}
