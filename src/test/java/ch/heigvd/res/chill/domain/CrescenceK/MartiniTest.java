package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MartiniTest {

  @Test
  void thePriceAndNameForMartiniShouldBeCorrect() {
    Martini beer = new Martini();
    assertEquals(beer.getName(), Martini.NAME);
    assertEquals(beer.getPrice(), Martini.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMartini() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.Martini";
    OrderRequest request = new OrderRequest(1, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Martini.PRICE.multiply(new BigDecimal(1));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}