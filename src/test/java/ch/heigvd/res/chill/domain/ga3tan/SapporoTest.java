package ch.heigvd.res.chill.domain.ga3tan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SapporoTest {

    @Test
    void nameAndPriceOfSapporoShouldBeCorrect() {
        Sapporo beer = new Sapporo();
        assertEquals(Sapporo.NAME, beer.getName());
        assertEquals(Sapporo.PRICE, beer.getPrice());
    }

    @Test
    void bartenderShouldAcceptOrderOfSapporo() {
        Bartender bartender = new Bartender();
        String beerName = "ch.heigvd.res.chill.domain.ga3tan.Sapporo";
        OrderRequest request = new OrderRequest(2, beerName);
        OrderResponse response = bartender.order(request);
        BigDecimal expectedTotalPrice = Sapporo.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
