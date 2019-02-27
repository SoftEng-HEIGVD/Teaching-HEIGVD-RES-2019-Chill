package ch.heigvd.res.chill.domain.Ezehkiel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NevskoeTest {

  @Test
  void thePriceAndNameForNevskoeShouldBeCorrect() {
    Nevskoe beer = new Nevskoe();
    assertEquals(beer.getName(), Nevskoe.NAME);
    assertEquals(beer.getPrice(), Nevskoe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNevskoe() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ezehkiel.Nevskoe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Nevskoe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}