package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierFunf;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierFunfTest{

    @Test
    void thePriceAndNameForBierFunfShouldBeCorrect() {
        BierFunf beer = new BierFunf();
        assertEquals(beer.getName(), BierFunf.NAME);
        assertEquals(beer.getPrice(), BierFunf.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierFunf() {
        Bartender diana = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierFunf";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = diana.order(request);
        BigDecimal expectedTotalPrice = BierFunf.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}