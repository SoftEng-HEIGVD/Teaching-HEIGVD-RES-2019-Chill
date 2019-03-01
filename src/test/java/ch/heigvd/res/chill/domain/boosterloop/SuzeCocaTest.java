package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuzeCocaTest {

    @Test
    void thePriceAndNameForSuzeCocaShouldBeCorrect() {
        SuzeCoca suze = new SuzeCoca();
        assertEquals(suze.getName(), SuzeCoca.NAME);
        assertEquals(suze.getPrice(), SuzeCoca.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSuzeCoca() {
        Bartender emile = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.boosterloop.SuzeCoca";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = emile.order(request);
        BigDecimal expectedTotalPrice = SuzeCoca.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}