package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mullerPierrickHeig.Adler;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdlerTest {

  @Test
  void thePriceAndNameForAdlerShouldBeCorrect() {
    Adler beer = new Adler();
    assertEquals(beer.getName(), Adler.NAME);
    assertEquals(beer.getPrice(), Adler.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAdler() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mullerPierrickHeig.Adler";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Adler.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}