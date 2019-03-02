package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaskoTest {

  @Test
  void thePriceAndNameForLaskoShouldBeCorrect() {
    Lasko beer = new Lasko();
    assertEquals(beer.getName(), Lasko.NAME);
    assertEquals(beer.getPrice(), Lasko.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLasko() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mtutic.Lasko";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Lasko.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}