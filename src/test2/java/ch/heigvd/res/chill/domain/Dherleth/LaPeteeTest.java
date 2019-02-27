package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.Dherleth.LaPetee;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaPeteeTest {

  @Test
  void thePriceAndNameForLaPeteeShouldBeCorrect() {
    LaPetee beer = new LaPetee();
    assertEquals(beer.getName(), LaPetee.NAME);
    assertEquals(beer.getPrice(), LaPetee.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaPetee() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Dherleth.LaPetee";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaPetee.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}