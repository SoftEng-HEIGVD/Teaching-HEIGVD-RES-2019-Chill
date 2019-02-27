package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummersbyTest {
  public final static int NUMBER = 26;

  @Test
  void thePriceAndNameForSummersbyShouldBeCorrect() {
    Summersby beer = new Summersby();
    assertEquals(beer.getName(), Summersby.NAME);
    assertEquals(beer.getPrice(), Summersby.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSummersby() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.playjul306.Summersby";
    OrderRequest request = new OrderRequest(NUMBER, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Summersby.PRICE.multiply(new BigDecimal(NUMBER));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}