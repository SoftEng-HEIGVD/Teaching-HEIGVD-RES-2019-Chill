package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KirTest {

  @Test
  void thePriceAndNameForKirShouldBeCorrect() {
    Kir beer = new Kir();
    assertEquals(beer.getName(), Kir.NAME);
    assertEquals(beer.getPrice(), Kir.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKir() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.Kir";
    OrderRequest request = new OrderRequest(4, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kir.PRICE.multiply(new BigDecimal(4));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}