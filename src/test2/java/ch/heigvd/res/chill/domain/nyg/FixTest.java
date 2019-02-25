package ch.heigvd.res.chill.domain.nyg;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FixTest {

    @Test
    void thePriceAndNameForFixShouldBeCorrect() {
        Fix beer = new Fix();
        assertEquals(beer.getName(), Fix.NAME);
        assertEquals(beer.getPrice(), Fix.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFix() {

        Bartender alexandros = new Bartender();
        String productName = Fix.class.getName();

        int beerCount = 8;
        OrderRequest request = new OrderRequest(beerCount, productName);
        OrderResponse response = alexandros.order(request);

        BigDecimal expectedTotalPrice = Fix.PRICE.multiply(new BigDecimal(beerCount));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}