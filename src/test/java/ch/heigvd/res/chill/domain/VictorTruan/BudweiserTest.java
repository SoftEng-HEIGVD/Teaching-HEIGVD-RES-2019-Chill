package ch.heigvd.res.chill.domain.VictorTruan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BudweiserTest {
    @Test
    void thePriceAndNameForBudweiserShouldBeCorrect() {
        Budweiser beer = new Budweiser();
        assertEquals(beer.getName(), Budweiser.NAME);
        assertEquals(beer.getPrice(), Budweiser.PRICE);
    }


    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.VictorTruan.Budweiser";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Budweiser.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}