package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SantaMariaTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    SantaMaria beer = new SantaMaria();
    assertEquals(beer.getName(), SantaMaria.NAME);
    assertEquals(beer.getPrice(), SantaMaria.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSantaMaria() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.samirkovitch.SantaMaria";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SantaMaria.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}