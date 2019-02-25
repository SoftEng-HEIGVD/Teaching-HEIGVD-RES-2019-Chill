package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mullerPierrickHeig.Brakina;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrakinaTest {

  @Test
  void thePriceAndNameForBrakinaShouldBeCorrect() {
    Brakina beer = new Brakina();
    assertEquals(beer.getName(), Brakina.NAME);
    assertEquals(beer.getPrice(), Brakina.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBrakina() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mullerPierrickHeig.Brakina";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Brakina.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}