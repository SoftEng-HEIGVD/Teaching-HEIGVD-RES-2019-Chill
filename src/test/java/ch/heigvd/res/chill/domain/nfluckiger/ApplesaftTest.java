package ch.heigvd.res.chill.domain.nfluckiger;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplesaftTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Applesaft applesaft = new Applesaft();
        assertEquals(applesaft.getName(), Applesaft.NAME);
        assertEquals(applesaft.getPrice(), Applesaft.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.nfluckiger.Applesaft";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Applesaft.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}