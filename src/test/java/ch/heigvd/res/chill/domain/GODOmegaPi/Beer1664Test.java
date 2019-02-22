package ch.heigvd.res.chill.domain.GODOmegaPi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Beer1664Test {

    @Test
    void thePriceAndNameFor1664ShouldBeCorrect() {
        Beer1664 beer = new Beer1664();
        assertEquals(beer.getName(), Guinness.NAME);
        assertEquals(beer.getPrice(), Guinness.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderFor1664() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.GODOmegaPi.Beer1664";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Beer1664.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}