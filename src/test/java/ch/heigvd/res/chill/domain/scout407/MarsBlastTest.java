package ch.heigvd.res.chill.domain.scout407;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsBlastTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        MarsBlast beer = new MarsBlast();
        assertEquals(beer.getName(), MarsBlast.NAME);
        assertEquals(beer.getPrice(), MarsBlast.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.scout407.MarsBlast";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = MarsBlast.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}