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
        CocaCola product = new CocaCola();
        assertEquals(product.getName(), CocaCola.NAME);
        assertEquals(product.getPrice(), CocaCola.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCocaCola() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.joshuaGomesDaCosta.CocaCola";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = CocaCola.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
