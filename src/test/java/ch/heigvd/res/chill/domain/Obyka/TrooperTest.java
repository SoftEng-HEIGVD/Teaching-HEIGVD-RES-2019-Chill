package ch.heigvd.res.chill.domain.Obyka;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrooperTest {

  @Test
  void thePriceAndNameForTrooperShouldBeCorrect() {
    Trooper beer = new Trooper();
    assertEquals(beer.getName(), Trooper.NAME);
    assertEquals(beer.getPrice(), Trooper.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForTrooper() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Obyka.Trooper";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Trooper.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}