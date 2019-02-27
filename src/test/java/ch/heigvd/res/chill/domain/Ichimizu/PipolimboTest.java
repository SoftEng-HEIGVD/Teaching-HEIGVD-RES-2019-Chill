package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PipolimboTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Pipolimbo beer = new Pipolimbo();
    assertEquals(beer.getName(), Pipolimbo.NAME);
    assertEquals(beer.getPrice(), Pipolimbo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.Pipolimbo";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pipolimbo.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}