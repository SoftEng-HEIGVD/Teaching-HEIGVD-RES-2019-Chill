package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MutzigTest {

  @Test
  void thePriceAndNameForMutzigShouldBeCorrect() {
    Mutzig beer = new Mutzig();
    assertEquals(beer.getName(), Mutzig.NAME);
    assertEquals(beer.getPrice(), Mutzig.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMutzig() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.Mutzig";
    OrderRequest request = new OrderRequest(7, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Mutzig.PRICE.multiply(new BigDecimal(7));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}