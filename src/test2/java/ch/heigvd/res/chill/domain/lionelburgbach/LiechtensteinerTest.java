package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiechtensteinerTest {

  @Test
  void thePriceAndNameForLiechtensteinerShouldBeCorrect() {
    Liechtensteiner beer = new Liechtensteiner();
    assertEquals(beer.getName(), Liechtensteiner.NAME);
    assertEquals(beer.getPrice(), Liechtensteiner.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLiechtensteiner() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lionelburgbach.Liechtensteiner";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Liechtensteiner.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}