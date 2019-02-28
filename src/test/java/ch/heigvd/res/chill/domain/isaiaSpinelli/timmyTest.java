package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class timmyTest {

  @Test
  void thePriceAndNameFortimmyShouldBeCorrect() {
    timmy beer = new timmy();
    assertEquals(beer.getName(), timmy.NAME);
    assertEquals(beer.getPrice(), timmy.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderFortimmy() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.timmy";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = timmy.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}