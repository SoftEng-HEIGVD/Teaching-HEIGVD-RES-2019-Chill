package ch.heigvd.res.chill.domain.ga3tan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ga3tan.Heineken;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeinekenTest {
    @Test
    void nameAndPriceOfBeerShouldBeCorrect() {
        Heineken beer = new Heineken();
        assertEquals(beer.getName(), Heineken.NAME);
        assertEquals(beer.getPrice(), Heineken.PRICE);
    }
    @Test
    void bartenderShouldAcceptorderOfHeineken() {
        Bartender bartender = new Bartender();
        String orderName = "ch.heigvd.res.chill.domain.ga3tan.Heineken";
        OrderRequest orderRequest = new OrderRequest(2,orderName);
        OrderResponse orderResponse = bartender.order(orderRequest);
        BigDecimal expectedTotalPrice = Heineken.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, orderResponse.getTotalPrice());
    }
}
