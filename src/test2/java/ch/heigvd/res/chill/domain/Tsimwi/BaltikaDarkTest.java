package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaltikaDarkTest {

  @Test
  void thePriceAndNameForBaltikaDarkShouldBeCorrect() {
    BaltikaDark beer = new BaltikaDark();
    assertEquals(beer.getName(), BaltikaDark.NAME);
    assertEquals(beer.getPrice(), BaltikaDark.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBaltikaDark() {
    Bartender vladimir = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.BaltikaDark";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = vladimir.order(request);
    BigDecimal expectedTotalPrice = BaltikaDark.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}