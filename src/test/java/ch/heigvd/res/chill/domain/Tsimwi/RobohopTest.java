package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobohopTest {

  @Test
  void thePriceAndNameForRobohopShouldBeCorrect() {
    Robohop beer = new Robohop();
    assertEquals(beer.getName(), Robohop.NAME);
    assertEquals(beer.getPrice(), Robohop.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForRobohop() {
    Bartender robocop = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.Robohop";
    OrderRequest request = new OrderRequest(100, productName);
    OrderResponse response = robocop.order(request);
    BigDecimal expectedTotalPrice = Robohop.PRICE.multiply(new BigDecimal(100));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}