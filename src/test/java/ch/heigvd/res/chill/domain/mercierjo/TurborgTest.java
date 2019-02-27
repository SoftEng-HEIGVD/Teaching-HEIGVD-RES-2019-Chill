package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mercierjo.Adelscott;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurborgTest {
    @Test
    void thePriceAndNameForTurborgShouldBeCorrect() {
        Turborg beer = new Turborg();
        assertEquals(beer.getName(), Turborg.NAME);
        assertEquals(beer.getPrice(), Turborg.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTurborg() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mercierjo.Turborg";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Turborg.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}