package ch.heigvd.res.chill.domain.JulienHuguet;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {
    @Test
    void thePriceAndNameForSaisonShouldBeCorrect() {
        Saison saison = new Saison();
        assertEquals(saison.getName(), Saison.NAME);
        assertEquals(saison.getPrice(), Saison.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSaison() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.JulienHuguet.Saison";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Saison.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}