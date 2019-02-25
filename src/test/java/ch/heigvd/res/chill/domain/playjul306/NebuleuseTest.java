package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NebuleuseTest {
  public final static int NUMBER = 8;

  @Test
  void thePriceAndNameForNebuleuseShouldBeCorrect() {
    Nebuleuse beer = new Nebuleuse();
    assertEquals(beer.getName(), Nebuleuse.NAME);
    assertEquals(beer.getPrice(), Nebuleuse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNebuleuse() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.playjul306.Nebuleuse";
    OrderRequest request = new OrderRequest(NUMBER, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Nebuleuse.PRICE.multiply(new BigDecimal(NUMBER));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}