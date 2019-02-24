package ch.heigvd.res.chill.domain.CosmicElodie;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.CosmicElodie.Lager;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LagerTest {

    @Test
    void PriceAndNameForLagerShouldBeCorrect() {
        Lager beer = new Lager();
        assertEquals(beer.getName(), Lager.NAME);
        assertEquals(beer.getPrice(), Lager.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLager() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.Lager";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Lager.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}