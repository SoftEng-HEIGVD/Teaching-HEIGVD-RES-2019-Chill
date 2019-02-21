package ch.heigvd.res.chill.domain.nathan.seville;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpitfireTest {
    @Test
    void thePriceAndNameForSpitfireShouldBeCorrect() {
        Spitfire beer = new Spitfire();
        assertEquals(beer.getName(), Spitfire.NAME);
        assertEquals(beer.getPrice(), Spitfire.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSpitfire() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.nathan.seville.Spitfire";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Spitfire.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}