package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalvinusTest {
    @Test
    void thePriceAndNameForCalvinusShouldBeCorrect() {
        Calvinus beer = new Calvinus();
        assertEquals(beer.getName(), Calvinus.NAME);
        assertEquals(beer.getPrice(), Calvinus.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCalvinus() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.Calvinus";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = jane.order(request);
        BigDecimal exceptedTotalPrice = Calvinus.PRICE.multiply(new BigDecimal(4));
        assertEquals(exceptedTotalPrice, response.getTotalPrice());
    }
}