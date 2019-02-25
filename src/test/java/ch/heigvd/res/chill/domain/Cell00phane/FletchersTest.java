package ch.heigvd.res.chill.domain.Cell00phane;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FletchersTest {

    @Test
    void thePriceAndNameForDuffShouldBeCorrect() {
        Fletchers beer = new Fletchers();
        assertEquals(beer.getName(), Fletchers.NAME);
        assertEquals(beer.getPrice(), Fletchers.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Cell00phane.Fletchers";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Fletchers.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}