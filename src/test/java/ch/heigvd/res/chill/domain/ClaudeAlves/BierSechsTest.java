package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.ClaudeAlves.BierSechs;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BierSechsTest{

    @Test
    void thePriceAndNameForBierSechsShouldBeCorrect() {
        BierSechs beer = new BierSechs();
        assertEquals(beer.getName(), BierSechs.NAME);
        assertEquals(beer.getPrice(), BierSechs.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBierHeinz() {
        Bartender sonya = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ClaudeAlves.BierSechs";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = sonya.order(request);
        BigDecimal expectedTotalPrice = BierSechs.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}