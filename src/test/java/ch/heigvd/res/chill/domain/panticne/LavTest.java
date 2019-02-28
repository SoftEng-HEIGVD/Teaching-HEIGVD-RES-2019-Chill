package ch.heigvd.res.chill.domain.panticne;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BrooklynTest {
    @Test
    void thePriceAndNameForBrooklynShouldBeCorrect() {
        Lav beer = new Lav();
        assertEquals(beer.getName(), Lav.NAME);
        assertEquals(beer.getPrice(), Lav.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBrooklyn() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.panticne.Lav";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Lav.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}