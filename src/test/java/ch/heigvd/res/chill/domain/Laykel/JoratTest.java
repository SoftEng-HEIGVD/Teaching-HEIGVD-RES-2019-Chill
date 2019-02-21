package ch.heigvd.res.chill.domain.Laykel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoratTest {

  @Test
  void thePriceAndNameForJoratShouldBeCorrect() {
    Jorat beer = new Jorat();
    assertEquals(beer.getName(), Jorat.NAME);
    assertEquals(beer.getPrice(), Jorat.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForJorat() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Laykel.Jorat";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Jorat.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}