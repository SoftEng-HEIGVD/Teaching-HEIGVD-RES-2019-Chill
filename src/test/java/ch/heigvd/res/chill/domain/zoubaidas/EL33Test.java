package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EL33Test {

    @Test
    void thePriceAndNameForEL33ShouldBeCorrect() {
        EL33 beer = new EL33();
        assertEquals(beer.getName(), EL33.NAME);
        assertEquals(beer.getPrice(), EL33.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEL33() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zoubaidas.EL33";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = EL33.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}