package ch.heigvd.res.chill.domain.tranqui793;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeinekenTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Heineken beer = new Heineken();
    assertEquals(beer.getName(), Heineken.NAME);
    assertEquals(beer.getPrice(), Heineken.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.tranqui793.Heineken";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Heineken.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}