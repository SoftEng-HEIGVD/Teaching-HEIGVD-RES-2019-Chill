package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DenIsaiaTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    DenIsaia beer = new DenIsaia();
    assertEquals(beer.getName(), DenIsaia.NAME);
    assertEquals(beer.getPrice(), DenIsaia.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.DenIsaia";
    OrderRequest request = new OrderRequest(6, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DenIsaia.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}