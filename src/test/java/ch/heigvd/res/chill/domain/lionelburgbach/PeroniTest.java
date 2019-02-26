package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeroniTest {

  @Test
  void thePriceAndNameForPeroniShouldBeCorrect() {
    Peroni beer = new Peroni();
    assertEquals(beer.getName(), Peroni.NAME);
    assertEquals(beer.getPrice(), Peroni.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPeroni() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lionelburgbach.Peroni";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Peroni.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}