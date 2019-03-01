package ch.heigvd.res.chill.domain.Laykel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaterTest {

  @Test
  void thePriceAndNameForWaterShouldBeCorrect() {
    Water glass = new Water();
    assertEquals(glass.getName(), Water.NAME);
    assertEquals(glass.getPrice(), Water.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWater() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Laykel.Water";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Water.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}