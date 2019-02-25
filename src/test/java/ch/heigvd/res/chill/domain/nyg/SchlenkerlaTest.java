package ch.heigvd.res.chill.domain.nyg;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SchlenkerlaTest {

    @Test
    void thePriceAndNameForSchlenkerlaShouldBeCorrect() {
        Schlenkerla beer = new Schlenkerla();
        assertEquals(beer.getName(), Schlenkerla.NAME);
        assertEquals(beer.getPrice(), Schlenkerla.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSchlenkerla() {

        Bartender melinda = new Bartender();
        String productName = Schlenkerla.class.getName();

        int beerCount = 9;
        OrderRequest request = new OrderRequest(beerCount, productName);
        OrderResponse response = melinda.order(request);

        BigDecimal expectedTotalPrice = Schlenkerla.PRICE.multiply(new BigDecimal(beerCount));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}