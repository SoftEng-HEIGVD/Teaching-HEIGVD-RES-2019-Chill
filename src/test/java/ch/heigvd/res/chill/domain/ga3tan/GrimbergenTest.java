package ch.heigvd.res.chill.domain.ga3tan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ga3tan.Grimbergen;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GrimbergenTest {

    @Test
    void nameAndPriceOfGrimbergenShouldBeCorrect() {
        Grimbergen beer = new Grimbergen();
        assertEquals(Grimbergen.NAME, beer.getName());
        assertEquals(Grimbergen.PRICE, beer.getPrice());
    }

    @Test
    void bartenderShouldAcceptOrderOfGrimbergen() {
        Bartender bartender = new Bartender();
        String beerName = "ch.heigvd.res.chill.domain.ga3tan.Grimbergen";
        OrderRequest request = new OrderRequest(3, beerName);
        OrderResponse response = bartender.order(request);
        BigDecimal expectedTotalPrice = Grimbergen.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
