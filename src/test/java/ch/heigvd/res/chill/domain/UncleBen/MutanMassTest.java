package ch.heigvd.res.chill.domain.UncleBen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MutanMassTest {

  @Test
  void thePriceAndNameForRivellaShouldBeCorrect() {
	  MutanMass beer = new MutanMass();
    assertEquals(beer.getName(), MutanMass.NAME);
    assertEquals(beer.getPrice(), MutanMass.PRICE);
  }
  
  

  @Test
  void aBartenderShouldAcceptAnOrderForMutanMass() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.UncleBen.MutanMass";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MutanMass.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}