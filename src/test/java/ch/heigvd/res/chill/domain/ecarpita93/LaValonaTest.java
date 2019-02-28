package ch.heigvd.res.chill.domain.ecarpita93;



import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaValonaTest {

    @Test
    void thePriceAndNameForLaValonaShouldBeCorrect() {
        LaValona beer = new LaValona();
        assertEquals(beer.getName(), LaValona.NAME);
        assertEquals(beer.getPrice(), LaValona.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaValona() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ecarpita93.LaValona";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = LaValona.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}