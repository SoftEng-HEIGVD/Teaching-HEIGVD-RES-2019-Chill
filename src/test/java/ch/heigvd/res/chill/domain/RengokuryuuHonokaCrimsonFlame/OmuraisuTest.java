package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Omuraisu;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OmuraisuTest {

    @Test
    void thePriceAndTheNameForOmuraisuShouldBeCorrect(){
        Omuraisu snack = new Omuraisu();
        assertEquals(snack.getName(), Omuraisu.NAME);
        assertEquals(snack.getPrice(), Omuraisu.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForArtisanale(){
        Bartender aika = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Omuraisu";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = aika.order(request);
        BigDecimal exceptedTotalPrice = Omuraisu.PRICE.multiply(new BigDecimal(5));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}