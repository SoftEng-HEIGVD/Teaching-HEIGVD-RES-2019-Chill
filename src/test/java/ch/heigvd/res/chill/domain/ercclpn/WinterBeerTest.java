package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WinterBeerTest {

  @Test
  void thePriceAndNameForWinterBeerShouldBeCorrect() {
    WinterBeer beer = new WinterBeer();
    assertEquals(beer.getName(), WinterBeer.NAME);
    assertEquals(beer.getPrice(), WinterBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWinterBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.ercclpn.WinterBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = WinterBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}