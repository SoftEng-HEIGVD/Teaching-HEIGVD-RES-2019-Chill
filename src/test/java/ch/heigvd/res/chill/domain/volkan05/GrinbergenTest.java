package ch.heigvd.res.chill.domain.volkan05;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrinbergenTest {

  @Test
  void thePriceAndNameForGrinbergenShouldBeCorrect() {
    Grinbergen beer = new Grinbergen();
    assertEquals(beer.getName(), Grinbergen.NAME);
    assertEquals(beer.getPrice(), Grinbergen.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGrinbergen() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.volkan05.Grinbergen";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Grinbergen.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}