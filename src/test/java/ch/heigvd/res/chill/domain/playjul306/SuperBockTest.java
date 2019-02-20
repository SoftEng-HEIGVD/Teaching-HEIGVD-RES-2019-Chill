package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperBockTest {
  public final static int NUMBER = 5;

  @Test
  void thePriceAndNameForSuperBockShouldBeCorrect() {
    SuperBock beer = new SuperBock();
    assertEquals(beer.getName(), SuperBock.NAME);
    assertEquals(beer.getPrice(), SuperBock.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSuperBock() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.playjul306.SuperBock";
    OrderRequest request = new OrderRequest(NUMBER, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SuperBock.PRICE.multiply(new BigDecimal(NUMBER));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}