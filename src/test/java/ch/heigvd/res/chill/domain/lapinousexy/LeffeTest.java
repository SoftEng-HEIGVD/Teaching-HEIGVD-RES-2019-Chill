package ch.heigvd.res.chill.domain.lapinousexy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LeffeTest {
    @Test
    void anHeinekenShouldHaveACorrectPriceAndName() {
        Leffe heineken = new Leffe();
        assertEquals(heineken.getPrice(), Leffe.PRICE);
        assertEquals(heineken.getName(), Leffe.NAME);
    }

    @Test
    void aBartenderShouldAcceptHeineken() {
        Bartender bartender = new Bartender();
        String productPath = "ch.heigvd.res.chill.domain.lapinousexy.Leffe";
        OrderRequest request = new OrderRequest(6, productPath);
        OrderResponse response = bartender.order(request);
        assertEquals(Leffe.PRICE.multiply(new BigDecimal(6)), response.getTotalPrice());
    }
}