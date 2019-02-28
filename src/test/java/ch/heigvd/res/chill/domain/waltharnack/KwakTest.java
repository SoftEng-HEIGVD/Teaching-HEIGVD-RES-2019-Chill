package ch.heigvd.res.chill.domain.waltharnack;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KwakTest {

    @Test
    void thePriceAndNameForKwakShouldBeCorrect() {
        Kwak beer = new Kwak();
        assertEquals(beer.getName(), Kwak.NAME);
        assertEquals(beer.getPrice(), Kwak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKwak() {
        int beerQuantity = 4;
        Bartender jeremy = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.waltharnack.Kwak";
        OrderRequest request = new OrderRequest(beerQuantity, productName);
        OrderResponse response = jeremy.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(beerQuantity));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}