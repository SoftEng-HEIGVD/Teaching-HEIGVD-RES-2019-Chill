package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.ChiffonCake;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChiffonCakeTest {

    @Test
    void thePriceAndTheNameForChiffonCakeShouldBeCorrect(){
        ChiffonCake snack = new ChiffonCake();
        assertEquals(snack.getName(), ChiffonCake.NAME);
        assertEquals(snack.getPrice(), ChiffonCake.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChiffonCake(){
        Bartender arisa = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.ChiffonCake";
        OrderRequest request = new OrderRequest(13, productName);
        OrderResponse response = arisa.order(request);
        BigDecimal exceptedTotalPrice = ChiffonCake.PRICE.multiply(new BigDecimal(13));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}