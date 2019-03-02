package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MerjoTest {
    @Test
    void thePriceAndNameForMerjoShouldBeCorrect() {
        Merjo beer = new Merjo();
        assertEquals(beer.getName(), Merjo.NAME);
        assertEquals(beer.getPrice(), Merjo.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMerjo() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mercierjo.Merjo";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Merjo.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}