package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SajandTest {
    @Test
    void thePriceAndNameForSajandShouldBeCorrect() {
        Sajand beer = new Sajand();
        assertEquals(beer.getName(), Sajand.NAME);
        assertEquals(beer.getPrice(), Sajand.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSajand() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jzaehrin.Sajand";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sajand.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
