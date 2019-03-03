package ch.heigvd.res.chill.domain.gvetter;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarlsbergTest {

  @Test
  void thePriceAndNameForCarlsbergShouldBeCorrect() {
    Carlsberg beer = new Carlsberg();
    assertEquals(beer.getName(), Carlsberg.NAME);
    assertEquals(beer.getPrice(), Carlsberg.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCarlsberg() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gvetter.Carlsberg";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Carlsberg.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}