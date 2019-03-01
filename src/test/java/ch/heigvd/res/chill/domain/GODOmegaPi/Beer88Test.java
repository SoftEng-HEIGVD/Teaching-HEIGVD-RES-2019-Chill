package ch.heigvd.res.chill.domain.GODOmegaPi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Beer88Test {

    @Test
    void thePriceAndNameFor1664ShouldBeCorrect() {
        Beer88 beer = new Beer88();
        assertEquals(beer.getName(), Beer88.NAME);
        assertEquals(beer.getPrice(), Beer88.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderFor1664() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.GODOmegaPi.Beer88";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Beer88.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}