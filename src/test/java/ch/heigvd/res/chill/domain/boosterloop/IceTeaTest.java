package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IceTeaTest {

    @Test
    void thePriceAndNameForIceTeaShouldBeCorrect() {
        IceTea tea = new IceTea();
        assertEquals(tea.getName(), IceTea.NAME);
        assertEquals(tea.getPrice(), IceTea.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTea() {
        Bartender loris = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.boosterloop.IceTea";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = loris.order(request);
        BigDecimal expectedTotalPrice = IceTea.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
