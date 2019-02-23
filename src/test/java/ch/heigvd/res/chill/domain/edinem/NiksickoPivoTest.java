package ch.heigvd.res.chill.domain.edinem;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.edinem.NiksickoPivo;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NiksickoPivoTest {

  @Test
  void thePriceAndNameForNiksickoPivoShouldBeCorrect() {
    NiksickoPivo beer = new NiksickoPivo();
    assertEquals(beer.getName(), NiksickoPivo.NAME);
    assertEquals(beer.getPrice(), NiksickoPivo.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForNiksickoPivo() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.edinem.NiksickoPivo";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = NiksickoPivo.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}