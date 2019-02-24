package ch.heigvd.res.chill.domain.oTwoWin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagnesTest {
    @Test
    void thePriceAndNameForMagnesShouldBeCorrect() {
        Magnes beer = new Magnes();
        assertEquals(beer.getName(), Magnes.NAME);
        assertEquals(beer.getPrice(), Magnes.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMagnes() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.oTwoWin.Magnes";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Magnes.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
