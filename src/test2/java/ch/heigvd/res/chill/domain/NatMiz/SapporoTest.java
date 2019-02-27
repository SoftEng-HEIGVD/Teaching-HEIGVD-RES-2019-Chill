package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.NatMiz.Sapporo;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SapporoTest {

  @Test
  void thePriceAndNameForSapporoShouldBeCorrect() {
    Sapporo beer = new Sapporo();
    assertEquals(beer.getName(), Sapporo.NAME);
    assertEquals(beer.getPrice(), Sapporo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSapporo() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NatMiz.Sapporo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sapporo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}