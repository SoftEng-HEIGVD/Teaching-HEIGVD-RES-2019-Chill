package ch.heigvd.res.chill.domain;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TroisDameTest {
    @Test
    void thePriceAndNameForTroisDameShouldBeCorrect() {
        TroisDame troisdame = new TroisDame();
        assertEquals(troisdame.getName(), TroisDame.NAME);
        assertEquals(troisdame.getPrice(), TroisDame.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTroisDame() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.TroisDame";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = TroisDame.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}