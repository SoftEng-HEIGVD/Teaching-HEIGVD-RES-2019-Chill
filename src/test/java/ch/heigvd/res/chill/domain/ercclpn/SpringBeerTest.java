package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpringBeerTest {

  @Test
  void thePriceAndNameForSpringBeerShouldBeCorrect() {
    SpringBeer beer = new SpringBeer();
    assertEquals(beer.getName(), SpringBeer.NAME);
    assertEquals(beer.getPrice(), SpringBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSpringBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.ercclpn.SpringBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SpringBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}