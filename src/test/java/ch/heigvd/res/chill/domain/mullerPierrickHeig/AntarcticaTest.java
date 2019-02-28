package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntarcticaTest {

  @Test
  void thePriceAndNameForAntarcticaShouldBeCorrect() {
    Antarctica beer = new Antarctica();
    assertEquals(beer.getName(), Antarctica.NAME);
    assertEquals(beer.getPrice(), Antarctica.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAntarctica() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mullerPierrickHeig.Antarctica";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Antarctica.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}