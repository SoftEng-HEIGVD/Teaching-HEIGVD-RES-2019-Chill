package ch.heigvd.res.chill.domain.XBrast;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

// new japanese beer
class HitachinoNesiTest {

    @Test
    void thePriceAndNameForHitachinoNesiShouldBeCorrect() {
        HitachinoNesi beer = new HitachinoNesi();
        assertEquals(beer.getName(), HitachinoNesi.NAME);
        assertEquals(beer.getPrice(), HitachinoNesi.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHitachinoNesi() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.XBrast.HitachinoNesi";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = HitachinoNesi.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}