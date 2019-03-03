package ch.heigvd.res.chill.domain.JulienHuguet;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GordonTest {
    @Test
    void thePriceAndNameForGordonShouldBeCorrect() {
        Gordon gordon = new Gordon();
        assertEquals(gordon.getName(), Gordon.NAME);
        assertEquals(gordon.getPrice(), Gordon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGordon() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.JulienHuguet.Gordon";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Gordon.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}