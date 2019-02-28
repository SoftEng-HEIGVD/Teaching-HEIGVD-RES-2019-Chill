package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Crackers;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrackersTest {

    @Test
    void thePriceAndTheNameForCrackersShouldBeCorrect(){
        Crackers snack = new Crackers();
        assertEquals(snack.getName(), Crackers.NAME);
        assertEquals(snack.getPrice(), Crackers.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForArtisanale(){
        Bartender rikako = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Crackers";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = rikako.order(request);
        BigDecimal exceptedTotalPrice = Crackers.PRICE.multiply(new BigDecimal(10));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}