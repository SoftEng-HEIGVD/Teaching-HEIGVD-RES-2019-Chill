package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PonchaTest {
    @Test
    void theNameAndPriceForPonchaShouldBeCorrect() {
        Poncha beer = new Poncha();
        assertEquals(beer.getPrice(), Poncha.PRICE);
        assertEquals(beer.getName(), Poncha.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPoncha() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.Poncha";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = Poncha.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}