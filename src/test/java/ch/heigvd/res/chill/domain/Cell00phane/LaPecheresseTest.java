package ch.heigvd.res.chill.domain.Cell00phane;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LaPecheresseTest {

    @Test
    void thePriceAndNameForDuffShouldBeCorrect() {
        LaPecheresse beer = new LaPecheresse();
        assertEquals(beer.getName(), LaPecheresse.NAME);
        assertEquals(beer.getPrice(), LaPecheresse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Cell00phane.LaPecheresse";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LaPecheresse.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}