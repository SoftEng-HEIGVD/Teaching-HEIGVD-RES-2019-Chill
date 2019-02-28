package ch.heigvd.res.chill.domain.batach31;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LesMuraillesTest {

    @Test
    void thePriceAndNameForKarmelietShouldBeCorrect() {
        LesMurailles beer = new LesMurailles();
        assertEquals(beer.getName(), LesMurailles.NAME);
        assertEquals(beer.getPrice(), LesMurailles.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKarmeliet() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.batach31.LesMurailles";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LesMurailles.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
