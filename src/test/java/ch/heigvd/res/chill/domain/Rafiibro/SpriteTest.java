package ch.heigvd.res.chill.domain.Rafiibro;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpriteTest {

    @Test
    void thePriceAndNameForSpriteShouldBeCorrect() {
        Sprite sprite = new Sprite();
        assertEquals(sprite.getName(), Sprite.NAME);
        assertEquals(sprite.getPrice(), Sprite.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSprite() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Rafiibro.Sprite";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sprite.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}