package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocteurGabsTest {
    @Test
    void thePriceAndNameForDocteurGapsTestShouldBeCorrect() {
        DocteurGabs beer = new DocteurGabs();
        assertEquals(beer.getName(), DocteurGabs.NAME);
        assertEquals(beer.getPrice(), DocteurGabs.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDocteurGapsTest() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.yoannsim.DocteurGabs";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = DocteurGabs.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
