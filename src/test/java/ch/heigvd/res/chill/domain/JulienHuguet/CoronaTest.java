package ch.heigvd.res.chill.domain.JulienHuguet;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CoronaTest {
    @Test
    void thePriceAndNameForCoronaShouldBeCorrect() {
        Corona corona = new Corona();
        assertEquals(corona.getName(), Corona.NAME);
        assertEquals(corona.getPrice(), Corona.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCorona() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.JulienHuguet.Corona";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Corona.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}