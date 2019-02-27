package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaptainMorganTest {
    @Test
    void thePriceAndNameForCaptainMorganTestShouldBeCorrect() {
        CaptainMorgan beer = new CaptainMorgan();
        assertEquals(beer.getName(), CaptainMorgan.NAME);
        assertEquals(beer.getPrice(), CaptainMorgan.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCaptainMorganTest() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.yoannsim.CaptainMorgan";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CaptainMorgan.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}