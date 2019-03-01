package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerardiTest {

    @Test
    void thePriceAndNameForGerardiShouldBeCorrect() {
        Gerardi beer = new Gerardi();
        assertEquals(beer.getName(), Gerardi.NAME);
        assertEquals(beer.getPrice(), Gerardi.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGerardi() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.Gerardi";
        OrderRequest request = new OrderRequest(100, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Gerardi.PRICE.multiply(new BigDecimal(100));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
