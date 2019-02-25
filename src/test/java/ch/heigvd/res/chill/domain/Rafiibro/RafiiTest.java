package ch.heigvd.res.chill.domain.Rafiibro;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RafiiTest {

    @Test
    void thePriceAndNameForRafiiShouldBeCorrect() {
        Rafii beer = new Rafii();
        assertEquals(beer.getName(), Rafii.NAME);
        assertEquals(beer.getPrice(), Rafii.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForRafii() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Rafiibro.Rafii";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Rafii.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}