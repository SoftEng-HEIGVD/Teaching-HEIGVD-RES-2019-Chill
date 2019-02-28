package ch.heigvd.res.chill.domain.batach31;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuldendraakTest {

    @Test
    void thePriceAndNameForGuldendraakShouldBeCorrect() {
        Guldendraak beer = new Guldendraak();
        assertEquals(beer.getName(), Guldendraak.NAME);
        assertEquals(beer.getPrice(), Guldendraak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGuldendraak() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.batach31.Guldendraak";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Guldendraak.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
