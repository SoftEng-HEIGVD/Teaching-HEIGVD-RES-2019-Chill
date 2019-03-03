package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MalibuAnanasTest {

  @Test
  void thePriceAndNameForMalibuAnanasShouldBeCorrect() {
    MalibuAnanas beer = new MalibuAnanas();
    assertEquals(beer.getName(), MalibuAnanas.NAME);
    assertEquals(beer.getPrice(), MalibuAnanas.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMalibuAnanas() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.MalibuAnanas";
    OrderRequest request = new OrderRequest(6, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MalibuAnanas.PRICE.multiply(new BigDecimal(6));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}