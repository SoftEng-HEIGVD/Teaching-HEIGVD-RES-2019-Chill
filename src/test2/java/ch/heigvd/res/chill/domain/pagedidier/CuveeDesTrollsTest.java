package ch.heigvd.res.chill.domain.pagedidier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuveeDesTrollsTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        CuveeDesTrolls beer = new CuveeDesTrolls();
        assertEquals(beer.getName(), CuveeDesTrolls.NAME);
        assertEquals(beer.getPrice(), CuveeDesTrolls.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.pagedidier.CuveeDesTrolls";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CuveeDesTrolls.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}