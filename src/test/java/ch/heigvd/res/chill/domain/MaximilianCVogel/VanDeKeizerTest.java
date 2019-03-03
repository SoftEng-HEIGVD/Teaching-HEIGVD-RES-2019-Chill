package ch.heigvd.res.chill.domain.MaximilianCVogel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VanDeKeizerTest {

  @Test
  void thePriceAndNameForVanDeKeizerShouldBeCorrect() {
    VanDeKeizer beer = new VanDeKeizer();
    assertEquals(beer.getName(), VanDeKeizer.NAME);
    assertEquals(beer.getPrice(), VanDeKeizer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForVanDeKeizer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MaximilianCVogel.VanDeKeizer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = VanDeKeizer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}