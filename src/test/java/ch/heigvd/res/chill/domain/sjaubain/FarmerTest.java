package ch.heigvd.res.chill.domain.sjaubain;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void thePriceAndNameForFarmerShouldBeCorrect() {
        Farmer beer = new Farmer();
        assertEquals(beer.getName(), Farmer.NAME);
        assertEquals(beer.getPrice(), Farmer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFarmer() {

        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.sjaubain.Farmer";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Farmer.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}