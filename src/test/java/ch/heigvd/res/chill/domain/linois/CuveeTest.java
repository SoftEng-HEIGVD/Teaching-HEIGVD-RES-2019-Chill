package ch.heigvd.res.chill.domain.linois;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.linois.Cuvee;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuveeTest {

    @Test
    void thePriceAndNameForCuveeShouldBeCorrect() {
        Cuvee beer = new Cuvee();
        assertEquals(beer.getName(), Cuvee.NAME);
        assertEquals(beer.getPrice(), Cuvee.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCuvee() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.linois.Cuvee";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Cuvee.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}