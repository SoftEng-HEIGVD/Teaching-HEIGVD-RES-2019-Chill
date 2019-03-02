package ch.heigvd.res.chill.domain.VictorTruan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BintangTest {
    @Test
    void thePriceAndNameForBintangShouldBeCorrect() {
        Bintang beer = new Bintang();
        assertEquals(beer.getName(), Bintang.NAME);
        assertEquals(beer.getPrice(), Bintang.PRICE);
    }


    @Test
    void aBartenderShouldAcceptAnOrderForBintang() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.VictorTruan.Bintang";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Bintang.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
