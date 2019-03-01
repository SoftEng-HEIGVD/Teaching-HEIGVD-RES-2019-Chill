package ch.heigvd.res.chill.domain.Obyka;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PirateTest {

  @Test
  void thePriceAndNameForPirateShouldBeCorrect() {
    Pirate beer = new Pirate();
    assertEquals(beer.getName(), Pirate.NAME);
    assertEquals(beer.getPrice(), Pirate.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPirate() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Obyka.Pirate";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pirate.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}