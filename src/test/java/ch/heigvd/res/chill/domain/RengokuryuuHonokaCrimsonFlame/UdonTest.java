package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Udon;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UdonTest {

    @Test
    void thePriceAndTheNameForUdonShouldBeCorrect(){
        Udon snack = new Udon();
        assertEquals(snack.getName(), Udon.NAME);
        assertEquals(snack.getPrice(), Udon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForUdon(){
        Bartender ai = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Udon";
        OrderRequest request = new OrderRequest(7, productName);
        OrderResponse response = ai.order(request);
        BigDecimal exceptedTotalPrice = Udon.PRICE.multiply(new BigDecimal(7));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}