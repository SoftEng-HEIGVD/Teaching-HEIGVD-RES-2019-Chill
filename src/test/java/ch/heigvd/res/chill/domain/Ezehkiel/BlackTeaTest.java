package ch.heigvd.res.chill.domain.Ezehkiel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlackTeaTest {

  @Test
  void thePriceAndNameForBlackTeaShouldBeCorrect() {
    BlackTea beer = new BlackTea();
    assertEquals(beer.getName(), BlackTea.NAME);
    assertEquals(beer.getPrice(), BlackTea.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBlackTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ezehkiel.BlackTea";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BlackTea.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}