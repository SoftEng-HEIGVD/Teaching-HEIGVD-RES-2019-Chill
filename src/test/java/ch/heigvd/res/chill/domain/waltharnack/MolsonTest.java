package ch.heigvd.res.chill.domain.waltharnack;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.waltharnack.Molson;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MolsonTest {

  @Test
  void thePriceAndNameForMolsonShouldBeCorrect() {
    Molson beer = new Molson();
    assertEquals(beer.getName(), Molson.NAME);
    assertEquals(beer.getPrice(), Molson.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMolson() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.waltharnack.Molson";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Molson.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}