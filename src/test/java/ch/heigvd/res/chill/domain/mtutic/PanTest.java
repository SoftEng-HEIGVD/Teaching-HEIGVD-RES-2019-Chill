package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PanTest {

  @Test
  void thePriceAndNameForPanShouldBeCorrect() {
    Pan beer = new Pan();
    assertEquals(beer.getName(), Pan.NAME);
    assertEquals(beer.getPrice(), Pan.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPan() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mtutic.Pan";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pan.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}