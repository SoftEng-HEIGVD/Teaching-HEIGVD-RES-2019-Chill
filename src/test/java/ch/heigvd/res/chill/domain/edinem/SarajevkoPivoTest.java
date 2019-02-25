package ch.heigvd.res.chill.domain.edinem;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.edinem.SarajevskoPivo;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SarajevkoPivoTest {

  @Test
  void thePriceAndNameForSarajevskoPivoShouldBeCorrect() {
    SarajevskoPivo beer = new SarajevskoPivo();
    assertEquals(beer.getName(), SarajevskoPivo.NAME);
    assertEquals(beer.getPrice(), SarajevskoPivo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSarajevskoPivo() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.edinem.SarajevskoPivo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SarajevskoPivo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}