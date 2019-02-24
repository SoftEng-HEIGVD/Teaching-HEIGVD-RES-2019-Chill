package ch.heigvd.res.chill.domain.Jael24;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoegaardenTest {
    @Test
    void thePriceAndNameForHoegaardenShouldBeCorrect() {
        Hoegaarden beer = new Hoegaarden();
        assertEquals(beer.getName(), Hoegaarden.NAME);
        assertEquals(beer.getPrice(), Hoegaarden.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHoegaarden() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Jael24.Hoegaarden";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Boxer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
