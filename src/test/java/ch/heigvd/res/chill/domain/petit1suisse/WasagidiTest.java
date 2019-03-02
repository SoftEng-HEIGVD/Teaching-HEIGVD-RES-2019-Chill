package ch.heigvd.res.chill.domain.petit1suisse;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WasagidiTest {
    @Test
    void thePriceAndNameForWasagidiShouldBeCorrect() {
        Wasagidi beer = new Wasagidi();
        assertEquals(beer.getName(), Wasagidi.NAME);
        assertEquals(beer.getPrice(), Wasagidi.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWasagidi() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.petit1suisse.Wasagidi";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Wasagidi.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}