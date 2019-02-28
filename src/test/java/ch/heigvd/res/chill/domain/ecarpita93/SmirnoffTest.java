package ch.heigvd.res.chill.domain.ecarpita93;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmirnoffTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Smirnoff beer = new Smirnoff();
        assertEquals(beer.getName(), Smirnoff.NAME);
        assertEquals(beer.getPrice(), Smirnoff.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jack = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ecarpita93.Smirnoff";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jack.order(request);
        BigDecimal expectedTotalPrice = Smirnoff.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
