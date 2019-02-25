package ch.heigvd.res.chill.domain.MaximilianCVogel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SweetBabyJesusTest {

  @Test
  void thePriceAndNameForSweetBabyJesusShouldBeCorrect() {
    SweetBabyJesus beer = new SweetBabyJesus();
    assertEquals(beer.getName(), SweetBabyJesus.NAME);
    assertEquals(beer.getPrice(), SweetBabyJesus.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSweetBabyJesus() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MaximilianCVogel.SweetBabyJesus";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SweetBabyJesus.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}