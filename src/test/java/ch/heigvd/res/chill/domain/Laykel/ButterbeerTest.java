package ch.heigvd.res.chill.domain.Laykel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ButterbeerTest {

  @Test
  void thePriceAndNameForButterbeerShouldBeCorrect() {
    Butterbeer beer = new Butterbeer();
    assertEquals(beer.getName(), Butterbeer.NAME);
    assertEquals(beer.getPrice(), Butterbeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForButterbeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Laykel.Butterbeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Butterbeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}