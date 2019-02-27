package ch.heigvd.res.chill.domain.edinem;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.edinem.Grimbergen;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrimbergenTest {

  @Test
  void thePriceAndNameForGrimbergenShouldBeCorrect() {
    Grimbergen beer = new Grimbergen();
    assertEquals(beer.getName(), Grimbergen.NAME);
    assertEquals(beer.getPrice(), Grimbergen.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.edinem.Grimbergen";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Grimbergen.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}