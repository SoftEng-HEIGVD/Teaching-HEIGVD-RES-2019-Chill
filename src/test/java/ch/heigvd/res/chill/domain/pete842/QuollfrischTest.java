package ch.heigvd.res.chill.domain.pete842;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuollfrischTest {

  @Test
  void thePriceAndNameForQuollfrischShouldBeCorrect() {
    Quollfrisch beer = new Quollfrisch();
    assertEquals(beer.getName(), Quollfrisch.NAME);
    assertEquals(beer.getPrice(), Quollfrisch.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForQuollfrisch() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.pete842.Quollfrisch";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Quollfrisch.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}