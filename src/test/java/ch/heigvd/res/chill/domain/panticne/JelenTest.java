package ch.heigvd.res.chill.domain.panticne;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class JelenTest {
    @Test
    void thePriceAndNameForBrooklynShouldBeCorrect() {
        Jelen beer = new Jelen();
        assertEquals(beer.getName(), Jelen.NAME);
        assertEquals(beer.getPrice(), Jelen.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJelen() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.panticne.Jelen";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Jelen.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
