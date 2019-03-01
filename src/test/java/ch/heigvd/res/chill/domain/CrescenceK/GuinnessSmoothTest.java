package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuinnessSmoothTest {

  @Test
  void thePriceAndNameForGuinnessSmoothShouldBeCorrect() {
    GuinnessSmooth beer = new GuinnessSmooth();
    assertEquals(beer.getName(), GuinnessSmooth.NAME);
    assertEquals(beer.getPrice(), GuinnessSmooth.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuinnessSmooth() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.GuinnessSmooth";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GuinnessSmooth.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}