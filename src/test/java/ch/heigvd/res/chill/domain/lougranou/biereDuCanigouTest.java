package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class biereDuCanigouTest {

  @Test
  void thePriceAndNameForbiereDuCanigoushouldBeCorrect() {
    biereDuCanigou beer = new biereDuCanigou();
    assertEquals(beer.getName(), biereDuCanigou.NAME);
    assertEquals(beer.getPrice(), biereDuCanigou.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForbiereDuCanigou() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lougranou.biereDuCanigou";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = biereDuCanigou.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}