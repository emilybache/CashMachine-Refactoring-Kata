package delivery;

import java.math.BigDecimal;

public class NewspaperDeliveryService {
    public void handlePayment(Customer customer) {
        var money = customer.getWallet().takeOutMoney(new BigDecimal(2));
        addToPocket(money);
    }

    private void addToPocket(BigDecimal money) {
        // logic to add money to own pocket
    }
}
