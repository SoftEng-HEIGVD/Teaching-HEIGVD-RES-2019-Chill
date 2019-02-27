package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierDrei;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierDreiTest{

    @Test
    void thePriceAndNameForBierDreiShouldBeCorrect() {
        BierDrei beer = new BierDrei();
        assertEquals(beer.getName(), BierDrei.NAME);
        assertEquals(beer.getPrice(), BierDrei.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierHeinz() {
        Bartender sonya = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierDrei";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = sonya.order(request);
        BigDecimal expectedTotalPrice = BierDrei.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}