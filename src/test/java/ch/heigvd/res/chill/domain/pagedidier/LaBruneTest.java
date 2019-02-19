package ch.heigvd.res.chill.domain.pagedidier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaBruneTest {

    @Test
    void thePriceAndNameForLaBruneShouldBeCorrect() {
        LaBrune beer = new LaBrune();
        assertEquals(beer.getName(), LaBrune.NAME);
        assertEquals(beer.getPrice(), LaBrune.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaBrune() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.pagedidier.LaBrune";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LaBrune.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}