package ch.heigvd.res.chill.domain.goturak;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarapilsTest {

  @Test
  void thePriceAndNameForCarapilsShouldBeCorrect() {
    Carapils beer = new Carapils();
    assertEquals(beer.getName(), Carapils.NAME);
    assertEquals(beer.getPrice(), Carapils.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCarapils() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.goturak.Carapils";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Carapils.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}