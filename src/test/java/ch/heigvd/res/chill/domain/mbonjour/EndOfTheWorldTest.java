package ch.heigvd.res.chill.domain.mbonjour;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EndOfTheWorldTest {
    @Test
    void thePriceAndNameForEndOfTheWorldShouldBeCorrect() {
        EndOfTheWorld beer = new EndOfTheWorld();
        assertEquals(beer.getName(), EndOfTheWorld.NAME);
        assertEquals(beer.getPrice(), EndOfTheWorld.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEndOfTheWorld() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mbonjour.EndOfTheWorld";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = EndOfTheWorld.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}