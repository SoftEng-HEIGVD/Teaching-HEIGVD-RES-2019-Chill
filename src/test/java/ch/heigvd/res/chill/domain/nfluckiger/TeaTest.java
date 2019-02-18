package ch.heigvd.res.chill.domain.nfluckiger;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeaTest {

    @Test
    void thePriceAndNameForTeaShouldBeCorrect() {
        Tea tea = new Tea();
        assertEquals(tea.getName(), Tea.NAME);
        assertEquals(tea.getPrice(), Tea.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTea() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.nfluckiger.Tea";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Tea.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}