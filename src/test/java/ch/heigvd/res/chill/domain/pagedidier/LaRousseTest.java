package ch.heigvd.res.chill.domain.pagedidier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaRousseTest {

    @Test
    void thePriceAndNameForLaRousseShouldBeCorrect() {
        LaRousse beer = new LaRousse();
        assertEquals(beer.getName(), LaRousse.NAME);
        assertEquals(beer.getPrice(), LaRousse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaRousse() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.pagedidier.LaRousse";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LaRousse.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}