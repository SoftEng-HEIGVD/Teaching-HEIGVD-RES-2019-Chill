package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuinessTest{

    @Test
    void thePriceAndNameForGuinessShouldBeCorrect() {
        Guiness beer = new Guiness();
        assertEquals(beer.getName(), Guiness.NAME);
        assertEquals(beer.getPrice(), Guiness.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.Guiness";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Guiness.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}