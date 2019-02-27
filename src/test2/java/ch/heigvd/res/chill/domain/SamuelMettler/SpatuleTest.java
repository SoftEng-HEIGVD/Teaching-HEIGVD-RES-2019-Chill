package ch.heigvd.res.chill.domain.SamuelMettler;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpatuleTest {

  @Test
  void thePriceAndNameForSpatuleShouldBeCorrect() {
    Spatule beer = new Spatule();
    assertEquals(beer.getName(), Spatule.NAME);
    assertEquals(beer.getPrice(), Spatule.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSpatule() {
    Bartender noemie = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.SamuelMettler.Spatule";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = noemie.order(request);
    BigDecimal expectedTotalPrice = Spatule.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}