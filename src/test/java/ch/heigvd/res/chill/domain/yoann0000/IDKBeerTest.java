package ch.heigvd.res.chill.domain.yoann0000;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IDKBeerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    IDKBeer beer = new IDKBeer();
    assertEquals(beer.getName(), IDKBeer.NAME);
    assertEquals(beer.getPrice(), IDKBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.yoann0000.IDKBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = IDKBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}