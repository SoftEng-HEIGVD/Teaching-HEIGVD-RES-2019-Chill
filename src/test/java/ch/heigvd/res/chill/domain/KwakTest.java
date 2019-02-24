package ch.heigvd.res.chill.domain;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class KwakTest {
    @Test
    void thePriceAndNameForKwakShouldBeCorrect() {
        Kwak kwak = new Kwak();
        assertEquals(kwak.getName(), Kwak.NAME);
        assertEquals(kwak.getPrice(), Kwak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKwak() {
        Bartender jake = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Kwak";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jake.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}