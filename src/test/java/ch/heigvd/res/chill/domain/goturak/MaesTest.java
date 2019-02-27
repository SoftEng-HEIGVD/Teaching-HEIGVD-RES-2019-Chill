package ch.heigvd.res.chill.domain.goturak;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaesTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Maes beer = new Maes();
    assertEquals(beer.getName(), Maes.NAME);
    assertEquals(beer.getPrice(), Maes.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.goturak.Maes";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Maes.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}