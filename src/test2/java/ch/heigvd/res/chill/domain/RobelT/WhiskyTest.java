package ch.heigvd.res.chill.domain.RobelT;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhiskyTest {

    @Test
    void thePriceAndNameForWhiskyShouldBeCorrect() {
        Whisky beer = new Whisky();
        assertEquals(beer.getName(), Whisky.NAME);
        assertEquals(beer.getPrice(), Whisky.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWhisky() {
        Bartender Jeffrey = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RobelT.Whisky";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = Jeffrey.order(request);
        BigDecimal expectedTotalPrice = Whisky.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}