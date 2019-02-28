package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KarlovackoTest {

  @Test
  void thePriceAndNameForKarlovackoShouldBeCorrect() {
    Karlovacko beer = new Karlovacko();
    assertEquals(beer.getName(), Karlovacko.NAME);
    assertEquals(beer.getPrice(), Karlovacko.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKarlovacko() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mtutic.Karlovacko";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Karlovacko.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}