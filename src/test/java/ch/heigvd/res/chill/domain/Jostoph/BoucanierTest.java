package ch.heigvd.res.chill.domain.Jostoph;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoucanierTest {

  @Test
  void thePriceAndNameForBoucanierShouldBeCorrect() {
    Boucanier beer = new Boucanier();
    assertEquals(beer.getName(), Boucanier.NAME);
    assertEquals(beer.getPrice(), Boucanier.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoucanier() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Jostoph.Boucanier";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Boucanier.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }
}
