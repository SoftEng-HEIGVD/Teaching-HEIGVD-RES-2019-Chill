package ch.heigvd.res.chill.domain.kaerdhalis;

import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class SaisonDuTracteurTest {

    @Test
    void thePriceAndNameForSangdEncreTestShouldBeCorrect() {
        SaisonDuTracteur beer = new SaisonDuTracteur();
        assertEquals(beer.getName(), SaisonDuTracteur.NAME);
        assertEquals(beer.getPrice(), SaisonDuTracteur.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSangdEncreTest() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.kaerdhalis.SaisonDuTracteur";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SaisonDuTracteur.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}