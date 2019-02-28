package ch.heigvd.res.chill.domain.tatallias;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnakeBiteTest {

  @Test
  void thePriceAndNameForSnakeBiteShouldBeCorrect() {
    SnakeBite beer = new SnakeBite();
    assertEquals(beer.getName(), SnakeBite.NAME);
    assertEquals(beer.getPrice(), SnakeBite.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSnakeBite() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.tatallias.SnakeBite";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SnakeBite.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}