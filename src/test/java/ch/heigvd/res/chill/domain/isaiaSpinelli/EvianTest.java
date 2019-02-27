package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvianTest {

  @Test
  void thePriceAndNameForEvianShouldBeCorrect() {
    Evian beer = new Evian();
    assertEquals(beer.getName(), Evian.NAME);
    assertEquals(beer.getPrice(), Evian.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForEvian() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.Evian";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Evian.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}