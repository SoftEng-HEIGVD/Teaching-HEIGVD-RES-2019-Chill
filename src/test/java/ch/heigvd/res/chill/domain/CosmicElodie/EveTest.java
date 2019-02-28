package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class EveTest {


    @Test
    void PriceAndNameForEveShouldBeCorrect() {
        Eve beer = new Eve();
        assertEquals(beer.getName(), Eve.NAME);
        assertEquals(beer.getPrice(), Eve.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEve() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Eve";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Eve.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}