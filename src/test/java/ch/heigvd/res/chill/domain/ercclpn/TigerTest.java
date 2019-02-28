package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TigerTest {

  @Test
  void thePriceAndNameForTigerShouldBeCorrect() {
    Tiger beer = new Tiger();
    assertEquals(beer.getName(), Tiger.NAME);
    assertEquals(beer.getPrice(), Tiger.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTiger() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.ercclpn.Tiger";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Tiger.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}