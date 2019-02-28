package ch.heigvd.res.chill.domain.UncleBen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LEANTest {

  @Test
  void thePriceAndNameForLEANShouldBeCorrect() {
	  LEAN lean = new LEAN();
    assertEquals(lean.getName(), LEAN.NAME);
    assertEquals(lean.getPrice(), LEAN.PRICE);
  }
  
  

  @Test
  void aBartenderShouldAcceptAnOrderForLEAN() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.UncleBen.LEAN";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LEAN.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}