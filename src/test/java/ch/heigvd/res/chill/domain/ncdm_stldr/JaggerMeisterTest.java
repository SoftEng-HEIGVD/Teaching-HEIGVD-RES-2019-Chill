package ch.heigvd.res.chill.domain.ncdm_stldr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class JaggerMeisterTest {

    @Test
    void thePriceAndNameForJaggerMeisterShouldBeCorrect() {
        JaggerMeister beverage = new JaggerMeister();
        assertEquals(beverage.getName(), JaggerMeister.NAME);
        assertEquals(beverage.getPrice(), JaggerMeister.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForJaggerMeister() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ncdm_stldr.JaggerMeister";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = JaggerMeister.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}