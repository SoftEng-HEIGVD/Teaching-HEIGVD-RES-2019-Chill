package ch.heigvd.res.chill.domain.gaeba95;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FantaVioletTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
	FantaViolet beer = new FantaViolet();
    assertEquals(beer.getName(), FantaViolet.NAME);
    assertEquals(beer.getPrice(), FantaViolet.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gaeba95.FantaViolet";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = FantaViolet.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}