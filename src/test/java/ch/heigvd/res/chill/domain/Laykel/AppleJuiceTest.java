package ch.heigvd.res.chill.domain.Laykel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleJuiceTest {

    @Test
    void thePriceAndNameForApplejuiceShouldBeCorrect() {
        AppleJuice juice = new AppleJuice();
        assertEquals(juice.getName(), AppleJuice.NAME);
        assertEquals(juice.getPrice(), AppleJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAppleJuice() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Laykel.AppleJuice";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = AppleJuice.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
