package ch.heigvd.res.chill.domain.briskocube;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuschTest {
    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Busch beer = new Busch();
        assertEquals(beer.getName(), Busch.NAME);
        assertEquals(beer.getPrice(), Busch.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender marie = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.briskocube.Busch";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = marie.order(request);
        BigDecimal expectedTotalPrice = Busch.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}