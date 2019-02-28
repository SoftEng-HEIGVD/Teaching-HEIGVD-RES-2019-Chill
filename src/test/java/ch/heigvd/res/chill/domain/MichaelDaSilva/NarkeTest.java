package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NarkeTest {
    @Test
    void theNameAndPriceForNarkeKaggenStormaktsporterShouldBeCorrect() {
        Narke beer = new Narke();
        assertEquals(beer.getPrice(), Narke.PRICE);
        assertEquals(beer.getName(), Narke.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForNarkeKaggenStormaktsporter() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.Narke";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = Narke.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}