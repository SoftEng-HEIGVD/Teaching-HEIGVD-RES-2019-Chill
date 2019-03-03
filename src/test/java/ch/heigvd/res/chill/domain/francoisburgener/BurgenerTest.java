package ch.heigvd.res.chill.domain.francoisburgener;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BurgenerTest {

  @Test
  void thePriceAndNameForBurgenerShouldBeCorrect() {
    Burgener beer = new Burgener();
    assertEquals(beer.getName(), Burgener.NAME);
    assertEquals(beer.getPrice(), Burgener.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.francoisburgener.Burgener";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Burgener.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}