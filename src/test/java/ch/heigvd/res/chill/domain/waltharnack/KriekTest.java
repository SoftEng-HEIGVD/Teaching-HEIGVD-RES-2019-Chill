package ch.heigvd.res.chill.domain.waltharnack;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KriekTest {

    @Test
    void thePriceAndNameForKriekShouldBeCorrect() {
        Kriek beer = new Kriek();
        assertEquals(beer.getName(), Kriek.NAME);
        assertEquals(beer.getPrice(), Kriek.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKriek() {
        int beerQuantity = 3;
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.waltharnack.Kriek";
        OrderRequest request = new OrderRequest(beerQuantity, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kriek.PRICE.multiply(new BigDecimal(beerQuantity));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
