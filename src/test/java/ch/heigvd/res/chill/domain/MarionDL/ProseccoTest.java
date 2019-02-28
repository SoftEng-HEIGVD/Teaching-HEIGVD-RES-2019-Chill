package ch.heigvd.res.chill.domain.MarionDL;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProseccoTest {

  @Test
  void thePriceAndNameForProseccoShouldBeCorrect() {
    Prosecco beer = new Prosecco();
    assertEquals(beer.getName(), Prosecco.NAME);
    assertEquals(beer.getPrice(), Prosecco.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForProsecco() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MarionDL.Prosecco";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Prosecco.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}