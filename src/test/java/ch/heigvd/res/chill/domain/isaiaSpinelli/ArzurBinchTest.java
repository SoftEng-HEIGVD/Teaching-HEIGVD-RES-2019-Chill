package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArzurBinchTest {

    @Test
    void thePriceAndNameForArzurBinchShouldBeCorrect() {
        ArzurBinch beer = new ArzurBinch();
        assertEquals(beer.getName(), ArzurBinch.NAME);
        assertEquals(beer.getPrice(), ArzurBinch.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForArzurBinch() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.ArzurBinch";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ArzurBinch.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}