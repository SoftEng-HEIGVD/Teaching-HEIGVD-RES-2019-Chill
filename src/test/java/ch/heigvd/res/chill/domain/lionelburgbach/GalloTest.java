package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GalloTest {

  @Test
  void thePriceAndNameForGalloShouldBeCorrect() {
    Gallo beer = new Gallo();
    assertEquals(beer.getName(), Gallo.NAME);
    assertEquals(beer.getPrice(), Gallo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGallo() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lionelburgbach.Gallo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Gallo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}