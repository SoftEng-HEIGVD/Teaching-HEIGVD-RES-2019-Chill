package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarbourMonAmourTest {

    @Test
    void thePriceAndNameForBarbourMonAmourShouldBeCorrect() {
        BarbourMonAmour beer = new BarbourMonAmour();
        assertEquals(beer.getName(), BarbourMonAmour.NAME);
        assertEquals(beer.getPrice(), BarbourMonAmour.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBarbourMonAmour() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zoubaidas.BarbourMonAmour";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BarbourMonAmour.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}