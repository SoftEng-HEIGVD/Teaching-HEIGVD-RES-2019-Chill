package ch.heigvd.res.chill.domain.jackeri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArequipenaTest {

  @Test
  void thePriceAndNameForArequipenaShouldBeCorrect() {
    Arequipena beer = new Arequipena();
    assertEquals(beer.getName(), Arequipena.NAME);
    assertEquals(beer.getPrice(), Arequipena.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForArequipena() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jackeri.Arequipena";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Arequipena.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}