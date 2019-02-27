package ch.heigvd.res.chill.domain.XBrast;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SagresTest {

    @Test
    void thePriceAndNameForSagresShouldBeCorrect() {
        Sagres beer = new Sagres();
        assertEquals(beer.getName(), Sagres.NAME);
        assertEquals(beer.getPrice(), Sagres.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSagres() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.XBrast.Sagres";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sagres.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}