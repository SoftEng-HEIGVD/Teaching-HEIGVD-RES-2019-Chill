package ch.heigvd.res.chill.domain.korradif;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KrusoviceTest {
        @Test
        void thePriceAndNameForPunkIPAShouldBeCorrect() {
            Krusovice beer = new Krusovice();
            assertEquals(beer.getName(), Krusovice.NAME);
            assertEquals(beer.getPrice(), Krusovice.PRICE);
        }

        @Test
        void aBartenderShouldAcceptAnOrderForPunkIPA() {
            Bartender jane = new Bartender();
            String productName = "ch.heigvd.res.chill.domain.korradif.Krusovice";
            OrderRequest request = new OrderRequest(3, productName);
            OrderResponse response = jane.order(request);
            BigDecimal expectedTotalPrice = Krusovice.PRICE.multiply(new BigDecimal(3));
            assertEquals(expectedTotalPrice, response.getTotalPrice());
        }

}
