package ch.heigvd.res.chill.domain.panticne;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImaginaryBeer {

    @Test
    void thePriceAndNameForImaginaryBeerShouldBeCorrect() {
        ImaginaryBeer beer = new ImaginaryBeer();
        assertEquals(beer.getName(), ImaginaryBeer.NAME);
        assertEquals(beer.getPrice(), ImaginaryBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForImaginaryBeer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.panticne.ImaginaryBeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ImaginaryBeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
