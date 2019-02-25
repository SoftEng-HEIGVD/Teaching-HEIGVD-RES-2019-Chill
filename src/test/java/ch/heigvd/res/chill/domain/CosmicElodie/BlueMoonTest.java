package ch.heigvd.res.chill.domain.CosmicElodie;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

class BlueMoonTest
{
    @Test
    void PriceAndNameForLagerShouldBeCorrect() {
        BlueMoon beer = new BlueMoon();
        assertEquals(beer.getName(), BlueMoon.NAME);
        assertEquals(beer.getPrice(), BlueMoon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBlueMoon() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.BlueMoon";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = BlueMoon.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}