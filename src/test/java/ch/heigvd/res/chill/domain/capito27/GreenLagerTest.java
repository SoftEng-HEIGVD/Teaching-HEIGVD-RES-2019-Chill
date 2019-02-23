package ch.heigvd.res.chill.domain.capito27;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.capito27.GreenLager;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreenLagerTest {

    @Test
    void thePriceAndNameForGreenLagerShouldBeCorrect() {
        GreenLager beer = new GreenLager();
        assertEquals(beer.getName(), GreenLager.NAME);
        assertEquals(beer.getPrice(), GreenLager.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGreenLager() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.capito27.GreenLager";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = GreenLager.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}