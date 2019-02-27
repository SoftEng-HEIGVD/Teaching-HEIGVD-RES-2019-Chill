package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HoppyRoadTest {
    @Test
    void thePriceAndNameForHoppyRoadShouldBeCorrect() {
        HoppyRoad beer = new HoppyRoad();
        assertEquals(beer.getName(), HoppyRoad.NAME);
        assertEquals(beer.getPrice(), HoppyRoad.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForHoppyRoad() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.HoppyRoad";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = jane.order(request);
        BigDecimal exceptedTotalPrice = HoppyRoad.PRICE.multiply(new BigDecimal(4));
        assertEquals(exceptedTotalPrice, response.getTotalPrice());
    }
}