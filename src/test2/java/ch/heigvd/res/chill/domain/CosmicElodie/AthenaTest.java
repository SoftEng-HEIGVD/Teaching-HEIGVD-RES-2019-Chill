package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class AthenaTest {


    @Test
    void PriceAndNameForAthenaShouldBeCorrect() {
        Athena beer = new Athena();
        assertEquals(beer.getName(), Athena.NAME);
        assertEquals(beer.getPrice(), Athena.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAthena() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Athena";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Athena.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}