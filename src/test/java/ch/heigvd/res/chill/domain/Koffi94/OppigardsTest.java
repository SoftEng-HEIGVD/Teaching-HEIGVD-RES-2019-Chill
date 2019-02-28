package ch.heigvd.res.chill.domain.Koffi94;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OppigardsTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Oppigards beer = new Oppigards();
        assertEquals(beer.getName(), Oppigards.NAME);
        assertEquals(beer.getPrice(), Oppigards.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Koffi94.Oppigards";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Oppigards.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}