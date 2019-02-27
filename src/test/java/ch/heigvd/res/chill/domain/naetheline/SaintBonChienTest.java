package ch.heigvd.res.chill.domain.naetheline;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by nathalie on 122/02/19.
 */
public class SaintBonChienTest {

    @Test
    void thePriceAndNameForSaintBonChienShouldBeCorrect() {
        SaintBonChien beer = new SaintBonChien();
        assertEquals(beer.getName(), SaintBonChien.NAME);
        assertEquals(beer.getPrice(), SaintBonChien.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCasanière() {
        Bartender Ellie = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.naetheline.SaintBonChien";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = Ellie.order(request);
        BigDecimal expectedTotalPrice = SaintBonChien.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }


}
