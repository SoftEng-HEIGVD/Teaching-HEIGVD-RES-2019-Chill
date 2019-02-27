package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinkPonyTest {

    @Test
    void thePriceAndNameForPinkPonyShouldBeCorrect() {
        PinkPony beer = new PinkPony();
        assertEquals(beer.getName(), PinkPony.NAME);
        assertEquals(beer.getPrice(), PinkPony.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPinkPony() {
        Bartender loris = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.boosterloop.PinkPony";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = loris.order(request);
        BigDecimal expectedTotalPrice = PinkPony.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
