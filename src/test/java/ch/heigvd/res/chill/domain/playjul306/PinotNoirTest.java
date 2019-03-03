package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PinotNoirTest {
  public final static int NUMBER = 12;

  @Test
  void thePriceAndNameForPinotNoirShouldBeCorrect() {
      PinotNoir beer = new PinotNoir();
    assertEquals(beer.getName(), PinotNoir.NAME);
    assertEquals(beer.getPrice(), PinotNoir.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPinotNoir() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.playjul306.PinotNoir";
    OrderRequest request = new OrderRequest(NUMBER, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PinotNoir.PRICE.multiply(new BigDecimal(NUMBER));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}