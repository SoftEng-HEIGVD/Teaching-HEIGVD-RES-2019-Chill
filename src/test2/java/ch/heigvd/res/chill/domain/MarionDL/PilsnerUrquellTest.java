package ch.heigvd.res.chill.domain.MarionDL;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.MarionDL.PilsnerUrquell;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilsnerUrquellTest {

  @Test
  void thePriceAndNameForPilsnerUrquellShouldBeCorrect() {
    PilsnerUrquell beer = new PilsnerUrquell();
    assertEquals(beer.getName(), PilsnerUrquell.NAME);
    assertEquals(beer.getPrice(), PilsnerUrquell.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPilsnerUrquell() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MarionDL.PilsnerUrquell";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PilsnerUrquell.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}