package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeuzellerKartoffelBierTest {

  @Test
  void thePriceAndNameForNeuzellerKartoffelBierShouldBeCorrect() {
    NeuzellerKartoffelBier beer = new NeuzellerKartoffelBier();
    assertEquals(beer.getName(), NeuzellerKartoffelBier.NAME);
    assertEquals(beer.getPrice(), NeuzellerKartoffelBier.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNeuzellerKartoffelBier() {
    Bartender spock = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.NeuzellerKartoffelBier";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = spock.order(request);
    BigDecimal expectedTotalPrice = NeuzellerKartoffelBier.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}