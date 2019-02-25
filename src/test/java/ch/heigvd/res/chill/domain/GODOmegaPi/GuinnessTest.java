package ch.heigvd.res.chill.domain.GODOmegaPi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GuinnessTest {

    @Test
    void thePriceAndNameForGuinnessShouldBeCorrect() {
        Guinness beer = new Guinness();
        assertEquals(beer.getName(), Guinness.NAME);
        assertEquals(beer.getPrice(), Guinness.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGuinness() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.GODOmegaPi.Guinness";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Guinness.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}