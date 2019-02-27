package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierHeinz;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierHeinzTest{

    @Test
    void thePriceAndNameForBierHeinzShouldBeCorrect() {
        BierHeinz beer = new BierHeinz();
        assertEquals(beer.getName(), BierHeinz.NAME);
        assertEquals(beer.getPrice(), BierHeinz.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierHeinz() {
        Bartender melinda = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierHeinz";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = melinda.order(request);
        BigDecimal expectedTotalPrice = BierHeinz.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
