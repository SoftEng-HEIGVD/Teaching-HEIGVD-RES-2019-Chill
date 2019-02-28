package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.CrescenceK.Karlksrone;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarlksroneTest {

    @Test
    void thePriceAndNameForKarlksroneShouldBeCorrect() {
        Karlksrone beer = new Karlksrone();
        assertEquals(beer.getName(), Karlksrone.NAME);
        assertEquals(beer.getPrice(), Karlksrone.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKarlksrone() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CrescenceK.Karlksrone";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Karlksrone.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
