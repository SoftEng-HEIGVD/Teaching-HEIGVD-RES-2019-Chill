package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GiletJauneTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    GiletJaune beer = new GiletJaune();

    assertEquals(beer.getName(), GiletJaune.NAME);
    assertEquals(beer.getPrice(), GiletJaune.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.GiletJaune";
    OrderRequest request = new OrderRequest(1, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GiletJaune.PRICE.multiply(new BigDecimal(1));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}