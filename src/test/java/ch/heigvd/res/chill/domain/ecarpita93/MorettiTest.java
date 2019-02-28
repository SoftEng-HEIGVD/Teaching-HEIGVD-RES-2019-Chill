package ch.heigvd.res.chill.domain.ecarpita93;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorettiTest {

    @Test
    void thePriceAndNameForMorettiShouldBeCorrect() {
        Moretti beer = new Moretti();
        assertEquals(beer.getName(), Moretti.NAME);
        assertEquals(beer.getPrice(), Moretti.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMoretti() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ecarpita93.Moretti";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Moretti.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}

