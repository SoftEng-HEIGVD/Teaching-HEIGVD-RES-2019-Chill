package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeLaFontaineTest {

  @Test
  void thePriceAndNameForDeLaFontaineShouldBeCorrect() {
    DeLaFontaine beer = new DeLaFontaine();
    assertEquals(beer.getName(), DeLaFontaine.NAME);
    assertEquals(beer.getPrice(), DeLaFontaine.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDeLaFontaine() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.samirkovitch.DeLaFontaine";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DeLaFontaine.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}