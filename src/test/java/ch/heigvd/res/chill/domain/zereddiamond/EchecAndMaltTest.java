package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EchecAndMaltTest {
    @Test
    void thePriceAndNameForEchecAndMaltShouldBeCorrect() {
        EchecAndMalt beer = new EchecAndMalt();
        assertEquals(beer.getName(), EchecAndMalt.NAME);
        assertEquals(beer.getPrice(), EchecAndMalt.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEchecAndMalt() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.EchecAndMalt";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = jane.order(request);
        BigDecimal exceptedTotalPrice = EchecAndMalt.PRICE.multiply(new BigDecimal(1));
        assertEquals(exceptedTotalPrice, response.getTotalPrice());
    }
}