package ch.heigvd.res.chill.domain.joshuaGomesDaCosta;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardinalTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Cardinal product = new Cardinal();
        assertEquals(product.getName(), Cardinal.NAME);
        assertEquals(product.getPrice(), Cardinal.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.joshuaGomesDaCosta.Cardinal";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Cardinal.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}