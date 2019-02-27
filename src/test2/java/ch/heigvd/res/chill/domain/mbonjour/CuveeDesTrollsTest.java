package ch.heigvd.res.chill.domain.mbonjour;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuveeDesTrollsTest {
    @Test
    void thePriceAndNameForCuveeDesTrollsShouldBeCorrect() {
        CuveeDesTrolls beer = new CuveeDesTrolls();
        assertEquals(beer.getName(), CuveeDesTrolls.NAME);
        assertEquals(beer.getPrice(), CuveeDesTrolls.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mbonjour.CuveeDesTrolls";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CuveeDesTrolls.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}