package ch.heigvd.res.chill.domain.RobelT;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DespeTest {

  @Test
  void thePriceAndNameForDespeShouldBeCorrect() {
    Despe beer = new Despe();
    assertEquals(beer.getName(), Despe.NAME);
    assertEquals(beer.getPrice(), Despe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDespe() {
    Bartender Jeffrey = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.RobelT.Despe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = Jeffrey.order(request);
    BigDecimal expectedTotalPrice = Despe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}