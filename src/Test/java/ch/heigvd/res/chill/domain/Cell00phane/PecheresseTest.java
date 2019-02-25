package ch.heigvd.res.chill.domain.Cell00phane;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PecheresseTest {

    @Test
    void thePriceAndNameForDuffShouldBeCorrect() {
        Pecheresse beer = new Pecheresse();
        assertEquals(beer.getName(), Pecheresse.NAME);
        assertEquals(beer.getPrice(), Pecheresse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Cell00phane.Pecheresse";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Pecheresse.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}