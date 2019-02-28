package ch.heigvd.res.chill.domain.yoannsim;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class YanusTest {
    @Test
    void thePriceAndNameForYanusShouldBeCorrect() {
        Yanus beer = new Yanus();
        assertEquals(beer.getName(), Yanus.NAME);
        assertEquals(beer.getPrice(), Yanus.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForYanus() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.yoannsim.Yanus";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Yanus.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
