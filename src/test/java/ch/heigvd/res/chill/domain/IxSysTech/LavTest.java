package ch.heigvd.res.chill.domain.IxSysTech;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LavTest {

    @Test
    void thePriceAndNameForLavShouldBeCorrect() {
        Lav beer = new Lav();
        assertEquals(beer.getName(), Lav.NAME);
        assertEquals(beer.getPrice(), Lav.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLav() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.IxSysTech.Lav";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Lav.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}