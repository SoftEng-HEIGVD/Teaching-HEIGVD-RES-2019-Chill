package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class horriblePiquetteTest {

  @Test
  void thePriceAndNameForhorriblePiquetteShouldBeCorrect() {
    horriblePiquette beer = new horriblePiquette();
    assertEquals(beer.getName(), horriblePiquette.NAME);
    assertEquals(beer.getPrice(), horriblePiquette.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForhorriblePiquette() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Dherleth.horriblePiquette";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = horriblePiquette.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}