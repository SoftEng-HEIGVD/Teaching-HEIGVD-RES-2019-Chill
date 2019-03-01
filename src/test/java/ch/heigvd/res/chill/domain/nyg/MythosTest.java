package ch.heigvd.res.chill.domain.nyg;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MythosTest {

    @Test
    void thePriceAndNameForMythosShouldBeCorrect() {
        Mythos beer = new Mythos();
        assertEquals(beer.getName(), Mythos.NAME);
        assertEquals(beer.getPrice(), Mythos.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMythos() {

        Bartender ioannis = new Bartender();
        String productName = Mythos.class.getName();

        final int beerCount = 10;
        OrderRequest request = new OrderRequest(beerCount, productName);
        OrderResponse response = ioannis.order(request);

        BigDecimal expectedTotalPrice = Mythos.PRICE.multiply(new BigDecimal(beerCount));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}