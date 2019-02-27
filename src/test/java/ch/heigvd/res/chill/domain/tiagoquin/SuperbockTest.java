package ch.heigvd.res.chill.domain.tiagoquin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperbockTest {

    @Test
    void thePriceAndNameForSuperbockShouldBeCorrect() {
        Superbock beer = new Superbock();
        assertEquals(beer.getName(), Superbock.NAME);
        assertEquals(beer.getPrice(), Superbock.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSuperbock() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.tiagoquin.Superbock";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Superbock.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}