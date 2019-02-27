package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeinekenTest {

    @Test
    void thePriceAndNameForHeinekenShouldBeCorrect() {
        Heineken beer = new Heineken();
        assertEquals(beer.getName(), Heineken.NAME);
        assertEquals(beer.getPrice(), Heineken.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHeineken() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.Heineken";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Heineken.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}