package ch.heigvd.res.chill.domain.lapinousexy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class Beer1664Test {
    @Test
    void anHeinekenShouldHaveACorrectPriceAndName() {
        Beer1664 heineken = new Beer1664();
        assertEquals(heineken.getPrice(), Beer1664.PRICE);
        assertEquals(heineken.getName(), Beer1664.NAME);
    }

    @Test
    void aBartenderShouldAcceptHeineken() {
        Bartender bartender = new Bartender();
        String productPath = "ch.heigvd.res.chill.domain.lapinousexy.Beer1664";
        OrderRequest request = new OrderRequest(6, productPath);
        OrderResponse response = bartender.order(request);
        assertEquals(Beer1664.PRICE.multiply(new BigDecimal(6)), response.getTotalPrice());
    }
}