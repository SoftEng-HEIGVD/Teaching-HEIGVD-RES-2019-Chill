package ch.heigvd.res.chill.domain.capito27;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.capito27.RedStout;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedStoutTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        RedStout beer = new RedStout();
        assertEquals(beer.getName(), RedStout.NAME);
        assertEquals(beer.getPrice(), RedStout.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.capito27.RedStout";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = RedStout.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}