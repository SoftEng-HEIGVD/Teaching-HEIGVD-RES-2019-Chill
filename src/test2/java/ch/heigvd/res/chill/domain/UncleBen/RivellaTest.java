package ch.heigvd.res.chill.domain.UncleBen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RivellaTest {

  @Test
  void thePriceAndNameForRivellaShouldBeCorrect() {
	  Rivella beer = new Rivella();
    assertEquals(beer.getName(), Rivella.NAME);
    assertEquals(beer.getPrice(), Rivella.PRICE);
  }
  
  

  @Test
  void aBartenderShouldAcceptAnOrderForRivella() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.UncleBen.Rivella";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Rivella.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}