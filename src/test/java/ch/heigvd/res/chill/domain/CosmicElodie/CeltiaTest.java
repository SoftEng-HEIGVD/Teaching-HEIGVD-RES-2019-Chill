package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CeltiaTest {
    @Test
    void PriceAndNameForCeltiaShouldBeCorrect() {
        Celtia beer = new Celtia();
        assertEquals(beer.getName(), Celtia.NAME);
        assertEquals(beer.getPrice(), Celtia.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCeltia() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Celtia";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Celtia.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}