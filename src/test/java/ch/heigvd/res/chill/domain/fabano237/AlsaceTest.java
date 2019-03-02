package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlsaceTest {

    @Test
    void thePriceAndNameForAlsaceShouldBeCorrect() {
        Alsace beer = new Alsace();
        assertEquals(beer.getName(), Alsace.NAME);
        assertEquals(beer.getPrice(), Alsace.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.Alsace";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Alsace.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}