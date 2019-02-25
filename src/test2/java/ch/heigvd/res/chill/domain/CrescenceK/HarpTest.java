package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HarpTest {

  @Test
  void thePriceAndNameForHarpShouldBeCorrect() {
    Harp beer = new Harp();
    assertEquals(beer.getName(), Harp.NAME);
    assertEquals(beer.getPrice(), Harp.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHarp() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.Harp";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Harp.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}