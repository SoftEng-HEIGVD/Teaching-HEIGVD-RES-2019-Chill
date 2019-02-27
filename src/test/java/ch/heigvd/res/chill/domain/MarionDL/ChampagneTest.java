package ch.heigvd.res.chill.domain.MarionDL;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChampagneTest {

  @Test
  void thePriceAndNameForChampagneShouldBeCorrect() {
    Champagne beer = new Champagne();
    assertEquals(beer.getName(), Champagne.NAME);
    assertEquals(beer.getPrice(), Champagne.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForChampagne() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MarionDL.Champagne";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Champagne.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}