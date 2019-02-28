package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NatMiz.UrBock;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UrBockTest {

  @Test
  void thePriceAndNameForUrBockShouldBeCorrect() {
    UrBock beer = new UrBock();
    assertEquals(beer.getName(), UrBock.NAME);
    assertEquals(beer.getPrice(), UrBock.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForUrBock() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NatMiz.UrBock";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = UrBock.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}