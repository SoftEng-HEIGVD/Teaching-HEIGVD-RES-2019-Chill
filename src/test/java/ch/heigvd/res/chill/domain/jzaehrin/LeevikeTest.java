package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LeevikeTest {
    @Test
    void thePriceAndNameForLeevikeShouldBeCorrect() {
        Leevike beer = new Leevike();
        assertEquals(beer.getName(), Leevike.NAME);
        assertEquals(beer.getPrice(), Leevike.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLeevike() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jzaehrin.Leevike";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Leevike.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
