package ch.heigvd.res.chill.domain.naetheline;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

/**
 * Created by nathalie on 18/02/19.
 */
public class CasanièreTest {

    @Test
    void thePriceAndNameForCasanièreShouldBeCorrect() {
        Casanière beer = new Casanière();
        assertEquals(beer.getName(), Casanière.NAME);
        assertEquals(beer.getPrice(), Casanière.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCasanière() {
        Bartender Ellie = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.naetheline.Casanière";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = Ellie.order(request);
        BigDecimal expectedTotalPrice = Casanière.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}
