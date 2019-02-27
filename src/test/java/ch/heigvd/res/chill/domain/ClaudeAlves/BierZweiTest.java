package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierZwei;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierZweiTest{

    @Test
    void thePriceAndNameForBierHeinzShouldBeCorrect() {
        BierZwei beer = new BierZwei();
        assertEquals(beer.getName(), BierZwei.NAME);
        assertEquals(beer.getPrice(), BierZwei.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierHeinz() {
        Bartender sonya = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierZwei";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = sonya.order(request);
        BigDecimal expectedTotalPrice = BierZwei.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}