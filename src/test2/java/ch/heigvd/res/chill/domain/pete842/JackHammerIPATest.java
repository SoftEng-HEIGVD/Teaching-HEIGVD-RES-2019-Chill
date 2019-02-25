package ch.heigvd.res.chill.domain.pete842;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JackHammerIPATest {

  @Test
  void thePriceAndNameForJackHammerIPAShouldBeCorrect() {
    JackHammerIPA beer = new JackHammerIPA();
    assertEquals(beer.getName(), JackHammerIPA.NAME);
    assertEquals(beer.getPrice(), JackHammerIPA.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForJackHammerIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.pete842.JackHammerIPA";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = JackHammerIPA.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}