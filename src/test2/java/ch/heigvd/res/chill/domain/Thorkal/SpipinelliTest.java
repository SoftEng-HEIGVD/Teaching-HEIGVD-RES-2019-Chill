package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpipinelliTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Spipinelli beer = new Spipinelli();
        assertEquals(beer.getName(), Spipinelli.NAME);
        assertEquals(beer.getPrice(), Spipinelli.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Thorkal.Spipinelli";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Spipinelli.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}