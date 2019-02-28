package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WestIndiesPorterGuinnessTest {

  @Test
  void thePriceAndNameForWestIndiesPorterGuinnessshouldBeCorrect() {
    WestIndiesPorterGuinness beer = new WestIndiesPorterGuinness();
    assertEquals(beer.getName(), WestIndiesPorterGuinness.NAME);
    assertEquals(beer.getPrice(), WestIndiesPorterGuinness.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWestIndiesPorterGuinness() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lougranou.WestIndiesPorterGuinness";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = WestIndiesPorterGuinness.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}