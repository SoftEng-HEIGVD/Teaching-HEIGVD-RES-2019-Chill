package ch.heigvd.res.chill.domain.panticne;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JojoDanceTest {

    @Test
    void thePriceAndNameForJojoDanceShouldBeCorrect() {
        JojoDance beer = new JojoDance();
        assertEquals(beer.getName(), JojoDance.NAME);
        assertEquals(beer.getPrice(), JojoDance.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJojoDance() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.panticne.JojoDance";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = JojoDance.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}