package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CurryWurstTest {
    @Test
    void theNameAndPriceForCurryWurstShouldBeCorrect() {
        CurryWurst food = new CurryWurst();
        assertEquals(food.getPrice(), CurryWurst.PRICE);
        assertEquals(food.getName(), CurryWurst.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCurryWurst() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.CurryWurst";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = CurryWurst.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}