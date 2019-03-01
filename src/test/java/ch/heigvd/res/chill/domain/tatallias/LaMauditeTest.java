package ch.heigvd.res.chill.domain.tatallias;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaMauditeTest {

  @Test
  void thePriceAndNameForLaMauditeShouldBeCorrect() {
    LaMaudite beer = new LaMaudite();
    assertEquals(beer.getName(), LaMaudite.NAME);
    assertEquals(beer.getPrice(), LaMaudite.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaMaudite() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.tatallias.LaMaudite";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaMaudite.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}