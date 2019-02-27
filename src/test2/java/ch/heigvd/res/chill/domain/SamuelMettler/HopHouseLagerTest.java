package ch.heigvd.res.chill.domain.SamuelMettler;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HopHouseLagerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    HopHouseLager beer = new HopHouseLager();
    assertEquals(beer.getName(), HopHouseLager.NAME);
    assertEquals(beer.getPrice(), HopHouseLager.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.SamuelMettler.HopHouseLager";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = HopHouseLager.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}