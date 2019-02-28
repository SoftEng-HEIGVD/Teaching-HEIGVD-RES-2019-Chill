package ch.heigvd.res.chill.domain.capito27;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.capito27.BlueAle;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlueAleTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        BlueAle beer = new BlueAle();
        assertEquals(beer.getName(), BlueAle.NAME);
        assertEquals(beer.getPrice(), BlueAle.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.capito27.BlueAle";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BlueAle.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}