package ch.heigvd.res.chill.domain.becauda;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class GlyphidSlammerTest {
    @Test
    void thePriceAndNameForGlyphidSlammerShouldBeCorrect() {
        GlyphidSlammer beer = new GlyphidSlammer();
        assertEquals(beer.getName(), GlyphidSlammer.NAME);
        assertEquals(beer.getPrice(), GlyphidSlammer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGlyphidSlammer() {
        Bartender     lloyd       = new Bartender();
        int           quantity    = 2;
        String        productName = "ch.heigvd.res.chill.domain.becauda.GlyphidSlammer";

        OrderResponse response        = lloyd.order(new OrderRequest(quantity, productName));
        BigDecimal expectedTotalPrice = GlyphidSlammer.PRICE.multiply(new BigDecimal(quantity));

        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}