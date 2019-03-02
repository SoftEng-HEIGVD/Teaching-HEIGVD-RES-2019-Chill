package ch.heigvd.res.chill.domain.petit1suisse;


import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FalseBeerTest {

    @Test
    void thePriceAndNameForJupilerShouldBeCorrect() {
        FalseBeer beer = new FalseBeer();
        assertEquals(beer.getName(), FalseBeer.NAME);
        assertEquals(beer.getPrice(), FalseBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJupiler() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.petit1suisse.FalseBeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = FalseBeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}