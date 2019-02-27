package ch.heigvd.res.chill.domain.XBrast;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumolTest {

    @Test
    void thePriceAndNameForSumolShouldBeCorrect() {
        Sumol beer = new Sumol();
        assertEquals(beer.getName(), Sumol.NAME);
        assertEquals(beer.getPrice(), Sumol.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSumol() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.XBrast.Sumol";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sumol.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}