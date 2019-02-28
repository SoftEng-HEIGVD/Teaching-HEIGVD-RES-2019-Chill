package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruanTest {

  @Test
  void thePriceAndNameForTruanShouldBeCorrect() {
    Truan beer = new Truan();
    assertEquals(beer.getName(), Truan.NAME);
    assertEquals(beer.getPrice(), Truan.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTruan() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.samirkovitch.Truan";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Truan.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}