package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MilwaukeeBrewingSasquashTest {

  @Test
  void thePriceAndNameForMilwaukeeBrewingSasquashShouldBeCorrect() {
    MilwaukeeBrewingSasquash beer = new MilwaukeeBrewingSasquash();
    assertEquals(beer.getName(), MilwaukeeBrewingSasquash.NAME);
    assertEquals(beer.getPrice(), MilwaukeeBrewingSasquash.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMilwaukeeBrewingSasquash() {
    Bartender elonmusk = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.MilwaukeeBrewingSasquash";
    OrderRequest request = new OrderRequest(17, productName);
    OrderResponse response = elonmusk.order(request);
    BigDecimal expectedTotalPrice = MilwaukeeBrewingSasquash.PRICE.multiply(new BigDecimal(17));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}