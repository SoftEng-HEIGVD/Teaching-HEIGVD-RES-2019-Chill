package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.Eric_Noel.Wubba_Lubba_Dub_Dub;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Wubba_Lubba_Dub_DubTest {

  @Test
  void thePriceAndNameForWubba_Lubba_Dub_DubShouldBeCorrect() {
    Wubba_Lubba_Dub_Dub beer = new Wubba_Lubba_Dub_Dub();
    assertEquals(beer.getName(), Wubba_Lubba_Dub_Dub.NAME);
    assertEquals(beer.getPrice(), Wubba_Lubba_Dub_Dub.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWubba_Lubba_Dub_Dub() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Eric_Noel.Wubba_Lubba_Dub_Dub";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Wubba_Lubba_Dub_Dub.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}