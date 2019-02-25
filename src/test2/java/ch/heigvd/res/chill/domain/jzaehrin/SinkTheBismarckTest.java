package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinkTheBismarckTest {

    @Test
    void thePriceAndNameForSinkTheBismarckShouldBeCorrect() {
        SinkTheBismarck beer = new SinkTheBismarck();
        assertEquals(beer.getName(), SinkTheBismarck.NAME);
        assertEquals(beer.getPrice(), SinkTheBismarck.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSinkTheBismarck() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jzaehrin.SinkTheBismarck";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SinkTheBismarck.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
