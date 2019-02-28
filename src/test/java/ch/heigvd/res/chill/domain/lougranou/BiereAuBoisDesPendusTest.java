package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiereAuBoisDesPendusTest {

  @Test
  void thePriceAndNameForBiereAuBoisDesPendusshouldBeCorrect() {
    BiereAuBoisDesPendus beer = new BiereAuBoisDesPendus();
    assertEquals(beer.getName(), BiereAuBoisDesPendus.NAME);
    assertEquals(beer.getPrice(), BiereAuBoisDesPendus.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBiereAuBoisDesPendus() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lougranou.BiereAuBoisDesPendus";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BiereAuBoisDesPendus.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}