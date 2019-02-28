package ch.heigvd.res.chill.domain.Koffi94;

import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class KorenaarTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Korenaar beer = new Korenaar();
        assertEquals(beer.getName(), Korenaar.NAME);
        assertEquals(beer.getPrice(), Korenaar.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Koffi94.Korenaar";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Korenaar.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}