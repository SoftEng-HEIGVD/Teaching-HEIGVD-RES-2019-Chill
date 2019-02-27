package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NickelTest {

  @Test
  void thePriceAndNameForNickelShouldBeCorrect() {
    Nickel beer = new Nickel();
    assertEquals(beer.getName(), Nickel.NAME);
    assertEquals(beer.getPrice(), Nickel.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNickel() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.samirkovitch.Nickel";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Nickel.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}