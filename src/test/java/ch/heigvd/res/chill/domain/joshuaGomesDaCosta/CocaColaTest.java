package ch.heigvd.res.chill.domain.joshuaGomesDaCosta;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CocaColaTest {

    @Test
    void thePriceAndNameForCocaColaShouldBeCorrect() {
        CocaCola beer = new CocaCola();
        assertEquals(beer.getName(), CocaCola.NAME);
        assertEquals(beer.getPrice(), CocaCola.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCocaCola() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.joshuaGomesDaCosta.CocaCola";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CocaCola.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}