package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierVier;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierVierTest{

    @Test
    void thePriceAndNameForBierVierShouldBeCorrect() {
        BierVier beer = new BierVier();
        assertEquals(beer.getName(), BierVier.NAME);
        assertEquals(beer.getPrice(), BierVier.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierVier() {
        Bartender diana = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierVier";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = diana.order(request);
        BigDecimal expectedTotalPrice = BierVier.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}