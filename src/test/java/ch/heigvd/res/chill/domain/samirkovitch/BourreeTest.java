package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BourreeTest {

  @Test
  void thePriceAndNameForBourreeShouldBeCorrect() {
    Bourree beer = new Bourree();
    assertEquals(beer.getName(), Bourree.NAME);
    assertEquals(beer.getPrice(), Bourree.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBourree() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.samirkovitch.Bourree";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Bourree.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}