package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NatMiz.Asahi;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsahiTest {

  @Test
  void thePriceAndNameForAsahiShouldBeCorrect() {
    Asahi beer = new Asahi();
    assertEquals(beer.getName(), Asahi.NAME);
    assertEquals(beer.getPrice(), Asahi.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAsahi() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NatMiz.Asahi";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Asahi.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}