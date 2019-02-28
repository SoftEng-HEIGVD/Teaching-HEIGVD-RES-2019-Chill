package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FriMousseTest {
    @Test
    void thePriceAndNameForFriMousseShouldBeCorrect() {
        FriMousse beer = new FriMousse();
        assertEquals(beer.getName(), FriMousse.NAME);
        assertEquals(beer.getPrice(), FriMousse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFriMousse() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.FriMousse";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jane.order(request);
        BigDecimal exceptedTotalPrice = FriMousse.PRICE.multiply(new BigDecimal(2));
        assertEquals(exceptedTotalPrice, response.getTotalPrice());
    }
}