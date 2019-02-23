package ch.heigvd.res.chill.domain.jackeri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoldenSirupTest {

    @Test
    void thePriceAndNameForGoldenSirupShouldBeCorrect() {
        GoldenSirup beer = new GoldenSirup();
        assertEquals(beer.getName(), GoldenSirup.NAME);
        assertEquals(beer.getPrice(), GoldenSirup.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGoldenSirup() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jackeri.GoldenSirup";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = GoldenSirup.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}