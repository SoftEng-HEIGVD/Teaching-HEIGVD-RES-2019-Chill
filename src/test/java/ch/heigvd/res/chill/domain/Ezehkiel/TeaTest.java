package ch.heigvd.res.chill.domain.Ezehkiel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeaTest {

  @Test
  void thePriceAndNameForTeaShouldBeCorrect() {
    Tea beer = new Tea();
    assertEquals(beer.getName(), Tea.NAME);
    assertEquals(beer.getPrice(), Tea.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ezehkiel.Tea";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Tea.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}