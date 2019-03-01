package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mullerPierrickHeig.Singha;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinghaTest {

  @Test
  void thePriceAndNameForSinghaShouldBeCorrect() {
    Singha beer = new Singha();
    assertEquals(beer.getName(), Singha.NAME);
    assertEquals(beer.getPrice(), Singha.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSingha() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mullerPierrickHeig.Singha";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Singha.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}