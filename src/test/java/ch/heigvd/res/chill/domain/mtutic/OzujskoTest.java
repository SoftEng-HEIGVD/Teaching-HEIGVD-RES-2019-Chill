package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OzujskoTest {

  @Test
  void thePriceAndNameForOzujskoShouldBeCorrect() {
    Ozujsko beer = new Ozujsko();
    assertEquals(beer.getName(), Ozujsko.NAME);
    assertEquals(beer.getPrice(), Ozujsko.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForOzujsko() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mtutic.Ozujsko";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Ozujsko.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}