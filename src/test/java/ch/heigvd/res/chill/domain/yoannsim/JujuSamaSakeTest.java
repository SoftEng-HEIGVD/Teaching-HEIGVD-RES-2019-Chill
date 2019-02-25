package ch.heigvd.res.chill.domain.yoannsim;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JujuSamaSakeTest {

    @Test
    void thePriceAndNameForJujuSamaSakeShouldBeCorrect() {
        JujuSamaSake beer = new JujuSamaSake();

        assertEquals(beer.getName(), JujuSamaSake.NAME);
        assertEquals(beer.getPrice(), JujuSamaSake.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJujuSamaSake() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.yoannsim.JujuSamaSake";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = JujuSamaSake.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}