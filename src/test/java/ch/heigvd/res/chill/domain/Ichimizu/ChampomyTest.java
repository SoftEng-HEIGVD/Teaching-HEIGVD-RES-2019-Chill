package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChampomyTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Champomy beer = new Champomy();
    assertEquals(beer.getName(), Champomy.NAME);
    assertEquals(beer.getPrice(), Champomy.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.Champomy";
    OrderRequest request = new OrderRequest(1, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Champomy.PRICE.multiply(new BigDecimal(1));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}