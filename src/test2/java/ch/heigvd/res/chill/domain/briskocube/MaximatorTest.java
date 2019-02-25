package ch.heigvd.res.chill.domain.briskocube;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximatorTest {
    @Test
    void thePriceAndNameForMaximatorShouldBeCorrect() {
        Maximator beer = new Maximator();
        assertEquals(beer.getName(), Maximator.NAME);
        assertEquals(beer.getPrice(), Maximator.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMaximator() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.briskocube.Maximator";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Maximator.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
