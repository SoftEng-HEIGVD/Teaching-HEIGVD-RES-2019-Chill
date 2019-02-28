package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrisaMaracujaTest {
    @Test
    void theNameAndPriceForBrisaMaracujaShouldBeCorrect() {
        BrisaMaracuja beer = new BrisaMaracuja();
        assertEquals(beer.getPrice(), BrisaMaracuja.PRICE);
        assertEquals(beer.getName(), BrisaMaracuja.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBrisaMaracuja() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.BrisaMaracuja";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = BrisaMaracuja.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}