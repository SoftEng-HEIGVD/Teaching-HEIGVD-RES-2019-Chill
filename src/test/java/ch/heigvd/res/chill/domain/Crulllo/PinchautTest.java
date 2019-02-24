package ch.heigvd.res.chill.domain.Crulllo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PinchautTest {

    @Test
    void thePriceAndNameForPinchautShouldBeCorrect() {
        Pinchaut beer = new Pinchaut();
        assertEquals(beer.getName(), Pinchaut.NAME);
        assertEquals(beer.getPrice(), Pinchaut.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPinchaut() {
        Bartender alfred = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Crulllo.Pinchaut";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = alfred.order(request);
        BigDecimal expectedTotalPrice = Pinchaut.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}