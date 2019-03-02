package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaileysTest {

  @Test
  void thePriceAndNameForBaileysShouldBeCorrect() {
    Baileys beer = new Baileys();
    assertEquals(beer.getName(), Baileys.NAME);
    assertEquals(beer.getPrice(), Baileys.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBaileys() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CrescenceK.Baileys";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Baileys.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}