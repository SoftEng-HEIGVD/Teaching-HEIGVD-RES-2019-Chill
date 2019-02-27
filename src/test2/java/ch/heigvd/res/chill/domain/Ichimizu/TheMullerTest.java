package ch.heigvd.res.chill.domain.Ichimizu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheMullerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    TheMuller beer = new TheMuller();
    assertEquals(beer.getName(), TheMuller.NAME);
    assertEquals(beer.getPrice(), TheMuller.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ichimizu.TheMuller";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = TheMuller.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}