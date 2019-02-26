package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonFlame;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Yukimidaifuku;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YukimidaifukuTest {

    @Test
    void thePriceAndTheNameForYukimidaifukuShouldBeCorrect(){
        Yukimidaifuku snack = new Yukimidaifuku();
        assertEquals(snack.getName(), Yukimidaifuku.NAME);
        assertEquals(snack.getPrice(), Yukimidaifuku.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForYukimidaifuku(){
        Bartender nanaka = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame.Yukimidaifuku";
        OrderRequest request = new OrderRequest(12, productName);
        OrderResponse response = nanaka.order(request);
        BigDecimal exceptedTotalPrice = Yukimidaifuku.PRICE.multiply(new BigDecimal(12));
        assertEquals(exceptedTotalPrice,response.getTotalPrice());
    }

}