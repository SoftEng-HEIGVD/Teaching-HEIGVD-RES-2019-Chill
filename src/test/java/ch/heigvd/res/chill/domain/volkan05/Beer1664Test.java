package ch.heigvd.res.chill.domain.volkan05;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Beer1664Test {

  @Test
  void thePriceAndNameForBeer1664ShouldBeCorrect() {
      Beer1664 beer = new Beer1664();
    assertEquals(beer.getName(), Beer1664.NAME);
    assertEquals(beer.getPrice(), Beer1664.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBeer1664() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.volkan05.Beer1664";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Beer1664.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}