package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EveTest {

  @Test
  void thePriceAndNameForEveShouldBeCorrect() {
    Eve beer = new Eve();
    assertEquals(beer.getName(), Eve.NAME);
    assertEquals(beer.getPrice(), Eve.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForEve() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lionelburgbach.Eve";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Eve.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}