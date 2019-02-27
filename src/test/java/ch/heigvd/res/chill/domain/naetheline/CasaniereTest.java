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
public class CasaniereTest {

    @Test
    void thePriceAndNameForCasanièreShouldBeCorrect() {
        Casaniere beer = new Casaniere();
        assertEquals(beer.getName(), Casaniere.NAME);
        assertEquals(beer.getPrice(), Casaniere.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCasanière() {
        Bartender Ellie = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.naetheline.Casaniere";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = Ellie.order(request);
        BigDecimal expectedTotalPrice = Casaniere.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}
