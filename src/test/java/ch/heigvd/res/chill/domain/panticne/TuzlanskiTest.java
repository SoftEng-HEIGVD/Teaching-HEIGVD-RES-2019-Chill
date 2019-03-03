package ch.heigvd.res.chill.domain.panticne;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TuzlanskiTest {

    @Test
    void thePriceAndNameForTuzlanskiShouldBeCorrect() {
        Tuzlanski beer = new Tuzlanski();
        assertEquals(beer.getName(), Tuzlanski.NAME);
        assertEquals(beer.getPrice(), Tuzlanski.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTuzlanski() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.panticne.Tuzlanski";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Tuzlanski.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}