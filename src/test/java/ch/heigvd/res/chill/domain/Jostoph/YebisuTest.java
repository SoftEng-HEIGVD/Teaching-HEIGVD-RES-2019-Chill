package ch.heigvd.res.chill.domain.Jostoph;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YebisuTest {

  @Test
  void thePriceAndNameForYebisuShouldBeCorrect() {
    Yebisu beer = new Yebisu();
    assertEquals(beer.getName(), Yebisu.NAME);
    assertEquals(beer.getPrice(), Yebisu.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForYebisu() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Jostoph.Yebisu";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Yebisu.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}
