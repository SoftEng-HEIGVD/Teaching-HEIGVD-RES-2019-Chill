package ch.heigvd.res.chill.domain.korradif;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KorradiTest {
        @Test
        void thePriceAndNameForPunkIPAShouldBeCorrect() {
            Korradi beer = new Korradi();
            assertEquals(beer.getName(), Korradi.NAME);
            assertEquals(beer.getPrice(), Korradi.PRICE);
        }

        @Test
        void aBartenderShouldAcceptAnOrderForPunkIPA() {
            Bartender jane = new Bartender();
            String productName = "ch.heigvd.res.chill.domain.korradif.Korradi";
            OrderRequest request = new OrderRequest(3, productName);
            OrderResponse response = jane.order(request);
            BigDecimal expectedTotalPrice = Korradi.PRICE.multiply(new BigDecimal(3));
            assertEquals(expectedTotalPrice, response.getTotalPrice());
        }

}
