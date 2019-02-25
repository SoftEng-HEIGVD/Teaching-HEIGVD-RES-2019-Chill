package ch.heigvd.res.chill.domain.volkan05;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.volkan05.Boxer2;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Boxer2Test {

  @Test
  void thePriceAndNameForBoxer2ShouldBeCorrect() {
    Boxer2 beer = new Boxer2();
    assertEquals(beer.getName(), Boxer2.NAME);
    assertEquals(beer.getPrice(), Boxer2.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer2() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.volkan05.Boxer2";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Boxer2.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}