package ch.heigvd.res.chill.domain.kaerdhalis;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class MorsureTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Morsure beer = new Morsure();
        assertEquals(beer.getName(), Morsure.NAME);
        assertEquals(beer.getPrice(), Morsure.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.kaerdhalis.Morsure";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Morsure.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}