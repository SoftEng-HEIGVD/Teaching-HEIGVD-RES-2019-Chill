package ch.heigvd.res.chill.domain.rafiibro;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoiTest {

    @Test
    void thePriceAndNameForBoiShouldBeCorrect() {
        Boi beer = new Boi();
        assertEquals(beer.getName(), Boi.NAME);
        assertEquals(beer.getPrice(), Boi.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoi() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.rafiibro.Boi";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Boi.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}