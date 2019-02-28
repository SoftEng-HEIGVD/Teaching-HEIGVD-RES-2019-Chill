package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NatMiz.Fleurac;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FleuracTest {

  @Test
  void thePriceAndNameForFleuracShouldBeCorrect() {
    Fleurac beer = new Fleurac();
    assertEquals(beer.getName(), Fleurac.NAME);
    assertEquals(beer.getPrice(), Fleurac.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFleurac() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NatMiz.Fleurac";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Fleurac.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}