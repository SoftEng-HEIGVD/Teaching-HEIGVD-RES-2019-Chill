package ch.heigvd.res.chill.domain.briskocube;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KwakTest {
    @Test
    void thePriceAndNameForKwakShouldBeCorrect() {
        Kwak beer = new Kwak();
        assertEquals(beer.getName(), Kwak.NAME);
        assertEquals(beer.getPrice(), Kwak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKwak() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.briskocube.Kwak";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}