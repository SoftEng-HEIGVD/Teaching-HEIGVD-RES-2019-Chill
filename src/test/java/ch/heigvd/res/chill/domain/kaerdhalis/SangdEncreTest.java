package ch.heigvd.res.chill.domain.kaerdhalis;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class SangdEncreTest {

    @Test
    void thePriceAndNameForSangdEncreTestShouldBeCorrect() {
        SangdEncre beer = new SangdEncre();
        assertEquals(beer.getName(), SangdEncre.NAME);
        assertEquals(beer.getPrice(), SangdEncre.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSangdEncreTest() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.kaerdhalis.SangdEncre";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SangdEncre.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}