package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mercierjo.Adelscott;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AdelscottTest {
    @Test
    void thePriceAndNameForAdelscottShouldBeCorrect() {
        Adelscott beer = new Adelscott();
        assertEquals(beer.getName(), Adelscott.NAME);
        assertEquals(beer.getPrice(), Adelscott.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAdelscott() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mercierjo.Adelscott";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Adelscott.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}