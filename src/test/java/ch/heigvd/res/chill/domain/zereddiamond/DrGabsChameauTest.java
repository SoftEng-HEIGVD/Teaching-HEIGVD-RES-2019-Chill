package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

//inspired by the others tests
class DrGabsChameauTest {
    @Test
    void thePriceAndNameForDrGabsChameauShouldBeCorrect() {
        DrGabsChameau beer = new DrGabsChameau();
        assertEquals(beer.getName(), DrGabsChameau.NAME);
        assertEquals(beer.getPrice(), DrGabsChameau.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDrGabsChameau() {
        Bartender jack = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zereddiamond.DrGabsChameau";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jack.order(request);
        BigDecimal expectedTotalPrice = DrGabsChameau.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}