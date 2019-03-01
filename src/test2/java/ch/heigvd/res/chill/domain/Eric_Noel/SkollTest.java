package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SkollTest {

  @Test
  void thePriceAndNameForSkollShouldBeCorrect() {
    Skoll beer = new Skoll();
    assertEquals(beer.getName(), Skoll.NAME);
    assertEquals(beer.getPrice(), Skoll.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSkoll() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Eric_Noel.Skoll";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Skoll.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}