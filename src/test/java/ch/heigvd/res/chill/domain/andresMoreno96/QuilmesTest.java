package ch.heigvd.res.chill.domain.andresMoreno96;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.andresMoreno96.Quilmes;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuilmesTest {

  @Test
  void thePriceAndNameForQuilmesShouldBeCorrect() {
    Quilmes beer = new Quilmes();
    assertEquals(beer.getName(), Quilmes.NAME);
    assertEquals(beer.getPrice(), Quilmes.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForQuilmes() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.andresMoreno96.Quilmes";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Quilmes.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}