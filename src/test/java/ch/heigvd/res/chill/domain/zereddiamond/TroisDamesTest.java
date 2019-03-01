package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TroisDamesTest {
    @Test
    void thePriceAndNameForTroisDamesShouldBeCorrect() {
        TroisDames beer = new TroisDames();
        assertEquals(beer.getName(), TroisDames.NAME);
        assertEquals(beer.getPrice(), TroisDames.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTroisDames() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.TroisDames";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal exceptedTotalPrice = TroisDames.PRICE.multiply(new BigDecimal(2));
        assertEquals(exceptedTotalPrice, response.getTotalPrice());
    }
}