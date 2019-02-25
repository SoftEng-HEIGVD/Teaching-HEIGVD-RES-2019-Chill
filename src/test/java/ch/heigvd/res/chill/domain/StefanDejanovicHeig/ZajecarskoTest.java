package ch.heigvd.res.chill.domain.StefanDejanovicHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZajecarskoTest {

  @Test
  void thePriceAndNameForZajecarskoShouldBeCorrect() {
    Zajecarsko beer = new Zajecarsko();
    assertEquals(beer.getName(), Zajecarsko.NAME);
    assertEquals(beer.getPrice(), Zajecarsko.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForZajecarsko() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.StefanDejanovicHeig.Zajecarsko";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Zajecarsko.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}