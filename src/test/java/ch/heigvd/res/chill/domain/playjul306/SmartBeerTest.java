package ch.heigvd.res.chill.domain.playjul306;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartBeerTest {
  public final static int NUMBER = 5;

  @Test
  void thePriceAndNameForSmartBeerShouldBeCorrect() {
    SmartBeer beer = new SmartBeer();
    assertEquals(beer.getName(), SmartBeer.NAME);
    assertEquals(beer.getPrice(), SmartBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSmartBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.playjul306.SmartBeer";
    OrderRequest request = new OrderRequest(NUMBER, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SmartBeer.PRICE.multiply(new BigDecimal(NUMBER));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}