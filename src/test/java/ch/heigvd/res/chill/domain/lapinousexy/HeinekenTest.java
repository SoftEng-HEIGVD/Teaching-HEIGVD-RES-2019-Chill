package ch.heigvd.res.chill.domain.lapinousexy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HeinekenTest {
    @Test
    void anHeinekenShouldHaveACorrectPriceAndName() {
        Heineken heineken = new Heineken();
        assertEquals(heineken.getPrice(), Heineken.PRICE);
        assertEquals(heineken.getName(), Heineken.NAME);
    }

    @Test
    void aBartenderShouldAcceptHeineken() {
        Bartender bartender = new Bartender();
        String productPath = "ch.heigvd.res.chill.domain.lapinousexy.Heineken";
        OrderRequest request = new OrderRequest(6, productPath);
        OrderResponse response = bartender.order(request);
        assertEquals(Heineken.PRICE.multiply(new BigDecimal(6)), response.getTotalPrice());
    }
}