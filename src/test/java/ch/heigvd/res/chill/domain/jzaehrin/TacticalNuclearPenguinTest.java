package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TacticalNuclearPenguinTest {

    @Test
    void thePriceAndNameForTacticalNuclearPenguinShouldBeCorrect() {
        TacticalNuclearPenguin beer = new TacticalNuclearPenguin();
        assertEquals(beer.getName(), TacticalNuclearPenguin.NAME);
        assertEquals(beer.getPrice(), TacticalNuclearPenguin.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTacticalNuclearPenguin() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jzaehrin.TacticalNuclearPenguin";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = TacticalNuclearPenguin.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
