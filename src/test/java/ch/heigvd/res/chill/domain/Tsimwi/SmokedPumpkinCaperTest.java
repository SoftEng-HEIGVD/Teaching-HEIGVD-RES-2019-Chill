package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmokedPumpkinCaperTest {

  @Test
  void thePriceAndNameForSmokedPumpkinCaperShouldBeCorrect() {
    SmokedPumpkinCaper beer = new SmokedPumpkinCaper();
    assertEquals(beer.getName(), SmokedPumpkinCaper.NAME);
    assertEquals(beer.getPrice(), SmokedPumpkinCaper.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSmokedPumpkinCaper() {
    Bartender bobafett = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.SmokedPumpkinCaper";
    OrderRequest request = new OrderRequest(4, productName);
    OrderResponse response = bobafett.order(request);
    BigDecimal expectedTotalPrice = SmokedPumpkinCaper.PRICE.multiply(new BigDecimal(4));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}