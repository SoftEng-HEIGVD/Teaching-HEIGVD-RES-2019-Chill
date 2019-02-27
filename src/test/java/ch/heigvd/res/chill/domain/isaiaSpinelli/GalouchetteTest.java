package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GalouchetteTest {

  @Test
  void thePriceAndNameForGalouchetteShouldBeCorrect() {
    Galouchette beer = new Galouchette();
    assertEquals(beer.getName(), Galouchette.NAME);
    assertEquals(beer.getPrice(), Galouchette.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGalouchette() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.Galouchette";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Galouchette.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}