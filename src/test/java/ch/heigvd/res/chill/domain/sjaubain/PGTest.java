package ch.heigvd.res.chill.domain.sjaubain;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PGTest {

    @Test
    void thePriceAndNameForPGShouldBeCorrect() {
        PG beer = new PG();
        assertEquals(beer.getName(), PG.NAME);
        assertEquals(beer.getPrice(), PG.PRICE);
    }


    @Test
    void aBartenderShouldAcceptAnOrderForPG() {

        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sjaubain.PG";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PG.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}