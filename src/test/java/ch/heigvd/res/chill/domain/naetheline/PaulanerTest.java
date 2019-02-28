package ch.heigvd.res.chill.domain.naetheline;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by nathalie on 25/02/19.
 */
public class PaulanerTest {
    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Paulaner beer = new Paulaner();
        assertEquals(beer.getName(), Paulaner.NAME);
        assertEquals(beer.getPrice(), Paulaner.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.naetheline.Paulaner";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
