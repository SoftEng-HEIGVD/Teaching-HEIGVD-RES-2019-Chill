package ch.heigvd.res.chill.domain.pagedidier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaBlondeTest {

    @Test
    void thePriceAndNameForLaBlondeShouldBeCorrect() {
        LaBlonde beer = new LaBlonde();
        assertEquals(beer.getName(), LaBlonde.NAME);
        assertEquals(beer.getPrice(), LaBlonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaBlonde() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.pagedidier.LaBlonde";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CuveeDesTrolls.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}