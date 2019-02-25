package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoralLagerTest {
    @Test
    void theNameAndPriceForCoralBrancaLagerShouldBeCorrect() {
        CoralLager beer = new CoralLager();
        assertEquals(beer.getPrice(), CoralLager.PRICE);
        assertEquals(beer.getName(), CoralLager.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCoralBrancaLager() {
        Bartender mikeMcMike = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MichaelDaSilva.CoralLager";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = mikeMcMike.order(request);
        BigDecimal expectedTotalPrice = CoralLager.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}