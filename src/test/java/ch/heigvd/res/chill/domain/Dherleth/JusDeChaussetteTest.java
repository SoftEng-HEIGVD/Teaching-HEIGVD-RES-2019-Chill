package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JusDeChaussetteTest {

  @Test
  void thePriceAndNameForJusDeChaussetteShouldBeCorrect() {
    JusDeChaussette beer = new JusDeChaussette();
    assertEquals(beer.getName(), JusDeChaussette.NAME);
    assertEquals(beer.getPrice(), JusDeChaussette.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForJusDeChaussette() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Dherleth.JusDeChaussette";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = JusDeChaussette.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}