package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Artisanale;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtisanaleTest {

    @Test
    void thePriceAndTheNameForArtisanaleShouldBeCorrect(){
        Artisanale beer = new Artisanale();
        assertEquals(beer.getName(), Artisanale.NAME);
        assertEquals(beer.getPrice(), Artisanale.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForArtisanale(){
        Bartender kokui = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Artisanale";
        OrderRequest request = new OrderRequest(42, productName);
        OrderResponse response = kokui.order(request);
        BigDecimal exceptedTotalPrice = Artisanale.PRICE.multiply(new BigDecimal(42));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}