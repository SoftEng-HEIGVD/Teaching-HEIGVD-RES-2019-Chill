package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HorriblePiquetteTest {

  @Test
  void thePriceAndNameForHorriblePiquetteShouldBeCorrect() {
    HorriblePiquette beer = new HorriblePiquette();
    assertEquals(beer.getName(), HorriblePiquette.NAME);
    assertEquals(beer.getPrice(), HorriblePiquette.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHorriblePiquette() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Dherleth.HorriblePiquette";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = HorriblePiquette.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}