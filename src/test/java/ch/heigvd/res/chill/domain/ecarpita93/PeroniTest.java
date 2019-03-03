package ch.heigvd.res.chill.domain.ecarpita93;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PeroniTest {

    @Test
    void thePriceAndNameForPeroniShouldBeCorrect() {
        Peroni beer = new Peroni();
        assertEquals(beer.getName(), Peroni.NAME);
        assertEquals(beer.getPrice(), Peroni.PRICE);
    }


    @Test
    void aBartenderShouldAcceptAnOrderForPeroni() {
        Bartender giovanna = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ecarpita93.Peroni";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = giovanna.order(request);
        BigDecimal expectedTotalPrice = Peroni.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}
