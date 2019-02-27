package ch.heigvd.res.chill.domain.tranqui793;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GarlicBeerTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    GarlicBeer beer = new GarlicBeer();
    assertEquals(beer.getName(), GarlicBeer.NAME);
    assertEquals(beer.getPrice(), GarlicBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.tranqui793.GarlicBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GarlicBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}