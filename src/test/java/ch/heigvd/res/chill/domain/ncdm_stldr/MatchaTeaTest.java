package ch.heigvd.res.chill.domain.ncdm_stldr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MatchaTeaTest {


    @Test
    void thePriceAndNameForMatchaTeaShouldBeCorrect() {
        MatchaTea matchaTea = new MatchaTea();
        assertEquals(MatchaTea.NAME, matchaTea.getName());
        assertEquals(MatchaTea.PRICE, matchaTea.getPrice());
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMatchaTea() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ncdm_stldr.MatchaTea";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = MatchaTea.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}