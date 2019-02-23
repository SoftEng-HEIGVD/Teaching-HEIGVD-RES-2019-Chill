package ch.heigvd.res.chill.domain.Crulllo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrisweinTest {

    @Test
    void thePriceAndNameForFrisweinShouldBeCorrect() {
        Friswein beer = new Friswein();
        assertEquals(beer.getName(), Friswein.NAME);
        assertEquals(beer.getPrice(), Friswein.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFriswein() {
        Bartender alfred = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Crulllo.Friswein";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = alfred.order(request);
        BigDecimal expectedTotalPrice = Friswein.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}