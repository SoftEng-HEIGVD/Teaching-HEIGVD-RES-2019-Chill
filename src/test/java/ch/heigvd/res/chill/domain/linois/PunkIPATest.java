package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PunkIPATest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    PunkIPA beer = new PunkIPA();
    assertEquals(beer.getName(), PunkIPA.NAME);
    assertEquals(beer.getPrice(), PunkIPA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.PunkIPA";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PunkIPA.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}