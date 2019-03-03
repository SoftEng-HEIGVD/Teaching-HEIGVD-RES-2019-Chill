package ch.heigvd.res.chill.domain;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GrimbergenTest {
    @Test
    void thePriceAndNameForGrimbergenShouldBeCorrect() {
        Grimbergen grimbergen = new Grimbergen();
        assertEquals(grimbergen.getName(), Grimbergen.NAME);
        assertEquals(grimbergen.getPrice(), Grimbergen.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGrimbergen() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Grimbergen";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Grimbergen.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}