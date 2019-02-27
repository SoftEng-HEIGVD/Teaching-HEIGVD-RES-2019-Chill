package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NatMiz.Suntory;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuntoryTest {

  @Test
  void thePriceAndNameForSuntoryShouldBeCorrect() {
    Suntory beer = new Suntory();
    assertEquals(beer.getName(), Suntory.NAME);
    assertEquals(beer.getPrice(), Suntory.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSuntory() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NatMiz.Suntory";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Suntory.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}