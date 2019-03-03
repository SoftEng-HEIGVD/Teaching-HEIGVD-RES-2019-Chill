package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FallBeerTest {

  @Test
  void thePriceAndNameForFallBeerShouldBeCorrect() {
    FallBeer beer = new FallBeer();
    assertEquals(beer.getName(), FallBeer.NAME);
    assertEquals(beer.getPrice(), FallBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFallBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.ercclpn.FallBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = FallBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}