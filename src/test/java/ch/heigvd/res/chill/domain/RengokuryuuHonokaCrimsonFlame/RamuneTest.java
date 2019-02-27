package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Ramune;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RamuneTest {

    @Test
    void thePriceAndTheNameForRamuneShouldBeCorrect(){
        Ramune ramune = new Ramune();
        assertEquals(ramune.getName(), Ramune.NAME);
        assertEquals(ramune.getPrice(), Ramune.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForArtisanale(){
        Bartender anju = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Ramune";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = anju.order(request);
        BigDecimal exceptedTotalPrice = Ramune.PRICE.multiply(new BigDecimal(3));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}