package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerlimpimpinTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Perlimpimpin beer = new Perlimpimpin();
    assertEquals(beer.getName(), Perlimpimpin.NAME);
    assertEquals(beer.getPrice(), Perlimpimpin.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.Perlimpimpin";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Perlimpimpin.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}