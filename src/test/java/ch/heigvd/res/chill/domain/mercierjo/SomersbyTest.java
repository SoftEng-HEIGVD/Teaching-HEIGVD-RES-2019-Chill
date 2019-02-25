package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomersbyTest {
    @Test
    void thePriceAndNameForSomersbyShouldBeCorrect() {
        Somersby beer = new Somersby();
        assertEquals(beer.getName(), Somersby.NAME);
        assertEquals(beer.getPrice(), Somersby.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSomersby() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mercierjo.Somersby";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Somersby.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}