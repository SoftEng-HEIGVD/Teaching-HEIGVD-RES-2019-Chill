package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CineyTest {

  @Test
  void thePriceAndNameForCineyShouldBeCorrect() {
    Ciney beer = new Ciney();
    assertEquals(beer.getName(), Ciney.NAME);
    assertEquals(beer.getPrice(), Ciney.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCiney() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lougranou.Ciney";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Ciney.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}