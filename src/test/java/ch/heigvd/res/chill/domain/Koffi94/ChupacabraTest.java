package ch.heigvd.res.chill.domain.Koffi94;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChupacabraTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Chupacabra beer = new Chupacabra();
        assertEquals(beer.getName(), Chupacabra.NAME);
        assertEquals(beer.getPrice(), Chupacabra.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Koffi94.Chupacabra";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Chupacabra.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}