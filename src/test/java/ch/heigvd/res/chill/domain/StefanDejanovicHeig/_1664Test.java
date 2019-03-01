package ch.heigvd.res.chill.domain.StefanDejanovicHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1664Test {

  @Test
  void thePriceAndNameFor_1664ShouldBeCorrect() {
    _1664 beer = new _1664();
    assertEquals(beer.getName(), _1664.NAME);
    assertEquals(beer.getPrice(), _1664.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderFor_1664() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.StefanDejanovicHeig._1664";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = _1664.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}