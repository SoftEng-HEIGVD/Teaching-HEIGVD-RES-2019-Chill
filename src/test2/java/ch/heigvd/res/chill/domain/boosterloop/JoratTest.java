package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoratTest {

    @Test
    void thePriceAndNameForJoratShouldBeCorrect(){

        Jorat joratBeer = new Jorat();
        assertEquals(joratBeer.getName(), Jorat.NAME);
        assertEquals(joratBeer.getPrice(), Jorat.PRICE);

    }

    @Test
    void aBartenderShouldAcceptAnOrderForJorat() {
        Bartender loris = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.boosterloop.Jorat";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = loris.order(request);
        BigDecimal expectedTotalPrice = Jorat.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
