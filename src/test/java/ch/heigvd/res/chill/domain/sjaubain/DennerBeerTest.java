package ch.heigvd.res.chill.domain.sjaubain;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DennerBeerTest {


    @Test
    void thePriceAndNameForPGShouldBeCorrect() {
        DennerBeer beer = new DennerBeer();
        assertEquals(beer.getName(), DennerBeer.NAME);
        assertEquals(beer.getPrice(), DennerBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPG() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sjaubain.DennerBeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = DennerBeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}