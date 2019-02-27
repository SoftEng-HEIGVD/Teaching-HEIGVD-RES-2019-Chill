package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GapenoTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Gapeno beer = new Gapeno();
        assertEquals(beer.getName(), Gapeno.NAME);
        assertEquals(beer.getPrice(), Gapeno.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Thorkal.Gapeno";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Gapeno.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}