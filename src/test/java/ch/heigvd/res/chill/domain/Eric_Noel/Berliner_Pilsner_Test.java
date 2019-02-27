package ch.heigvd.res.chill.domain.Eric_Noel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Berliner_Pilsner_Test {

  @Test
  void thePriceAndNameForBerliner_PilsnerShouldBeCorrect() {
    Berliner_Pilsner beer = new Berliner_Pilsner();
    assertEquals(beer.getName(), Berliner_Pilsner.NAME);
    assertEquals(beer.getPrice(), Berliner_Pilsner.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBerliner_Pilsner() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Eric_Noel.Berliner_Pilsner";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Berliner_Pilsner.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}