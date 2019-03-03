package ch.heigvd.res.chill.domain;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SalamandreTest extends groovy.util.GroovyTestCase {
    @Test
    void thePriceAndNameForSalamandreShouldBeCorrect() {
        Salamandre salamandre = new Salamandre();
        assertEquals(salamandre.getName(), Salamandre.NAME);
        assertEquals(salamandre.getPrice(), Salamandre.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSalamandre() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Salamandre";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = Salamandre.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
