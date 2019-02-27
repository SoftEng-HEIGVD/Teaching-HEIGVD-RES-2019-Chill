package ch.heigvd.res.chill.domain.gaeba95;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FantaRoseTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    FantaRose beer = new FantaRose();
    assertEquals(beer.getName(), FantaRose.NAME);
    assertEquals(beer.getPrice(), FantaRose.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFantaRose() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gaeba95.FantaRose";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = FantaRose.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}