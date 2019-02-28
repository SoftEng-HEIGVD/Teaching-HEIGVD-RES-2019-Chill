package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Muse_beerTest {

  @Test
  void thePriceAndNameForMuse_beerShouldBeCorrect() {
    Muse_beer beer = new Muse_beer();
    assertEquals(beer.getName(), Muse_beer.NAME);
    assertEquals(beer.getPrice(), Muse_beer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMuse_beer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.Muse_beer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Muse_beer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}