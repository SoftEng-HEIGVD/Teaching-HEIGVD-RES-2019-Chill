package ch.heigvd.res.chill.domain.VictorTruan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilsenTest {
    @Test
    void thePriceAndNameForBudweiserShouldBeCorrect() {
        Pilsen beer = new Pilsen();
        assertEquals(beer.getName(), Pilsen.NAME);
        assertEquals(beer.getPrice(), Pilsen.PRICE);
    }


    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.VictorTruan.Pilsen";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Pilsen.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}