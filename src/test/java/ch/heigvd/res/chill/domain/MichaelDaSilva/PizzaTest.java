package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {
    @Test
    void theNameAndPriceForPizzaShouldBeCorrect() {
        Pizza food = new Pizza();
        assertEquals(food.getPrice(), Pizza.PRICE);
        assertEquals(food.getName(), Pizza.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPizza() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.Pizza";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = Pizza.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}