package ch.heigvd.res.chill.domain.BasileBotebol;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourthbeerTest {

    @Test
    void thePriceAndNameForFourthbeerShouldBeCorrect() {
        Fourthbeer beer = new Fourthbeer();
        assertEquals(beer.getName(), Fourthbeer.NAME);
        assertEquals(beer.getPrice(), Fourthbeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFourthbeer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.BasileBotebol.Fourthbeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Fourthbeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}