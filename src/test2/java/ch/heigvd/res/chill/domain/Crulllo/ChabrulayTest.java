package ch.heigvd.res.chill.domain.Crulllo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChabrulayTest {

    @Test
    void thePriceAndNameForChabrulayShouldBeCorrect() {
        Chabrulay beer = new Chabrulay();
        assertEquals(beer.getName(), Chabrulay.NAME);
        assertEquals(beer.getPrice(), Chabrulay.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChabrulay() {
        Bartender alfred = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Crulllo.Chabrulay";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = alfred.order(request);
        BigDecimal expectedTotalPrice = Chabrulay.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}