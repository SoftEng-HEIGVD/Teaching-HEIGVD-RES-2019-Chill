package ch.heigvd.res.chill.domain.BasileBotebol;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WestvleterenTest {

    @Test
    void thePriceAndNameForWestvleterenShouldBeCorrect() {
        Westvleteren beer = new Westvleteren();
        assertEquals(beer.getName(), Westvleteren.NAME);
        assertEquals(beer.getPrice(), Westvleteren.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWestvleteren() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.BasileBotebol.Westvleteren";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Westvleteren.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}