package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class IceTeaMigrosTest {

    @Test
    void PriceAndNameForIceTeaMigrosShouldBeCorrect() {
        IceTeaMigros beer = new IceTeaMigros();
        assertEquals(beer.getName(), IceTeaMigros.NAME);
        assertEquals(beer.getPrice(), IceTeaMigros.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTeaMigros() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.IceTeaMigros";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = IceTeaMigros.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}