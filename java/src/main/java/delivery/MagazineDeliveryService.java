package delivery;

import java.math.BigDecimal;

public class MagazineDeliveryService {

    public void handlePayment(Customer customer) {
        var money = customer.requestPayment(new BigDecimal(2));
        addToPocket(money);
    }

    private void addToPocket(BigDecimal money) {
        // logic to add money to own pocket
    }
}
