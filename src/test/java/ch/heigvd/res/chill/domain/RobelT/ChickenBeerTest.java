package ch.heigvd.res.chill.domain.RobelT;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChickenBeerTest{

    @Test
    void thePriceAndNameForChickenBeerShouldBeCorrect() {
        ChickenBeer beer = new ChickenBeer();
        assertEquals(beer.getName(), ChickenBeer.NAME);
        assertEquals(beer.getPrice(), ChickenBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChickenBeer() {
        Bartender Jeffrey = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RobelT.ChickenBeer";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = Jeffrey.order(request);
        BigDecimal expectedTotalPrice = ChickenBeer.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}