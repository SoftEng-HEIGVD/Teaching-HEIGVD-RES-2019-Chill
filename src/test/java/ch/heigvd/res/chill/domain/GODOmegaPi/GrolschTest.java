package ch.heigvd.res.chill.domain.gaeba95;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrolschTest {

  @Test
  void thePriceAndNameForGrolschShouldBeCorrect() {
    Grolsch beer = new Grolsch();
    assertEquals(beer.getName(), Grolsch.NAME);
    assertEquals(beer.getPrice(), Grolsch.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGrolsch() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gaeba95.Grolsch";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Grolsch.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}