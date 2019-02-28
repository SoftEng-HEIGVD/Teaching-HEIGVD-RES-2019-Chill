package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiguelTest {

  @Test
  void thePriceAndNameForMiguelShouldBeCorrect() {
    Miguel beer = new Miguel();
    assertEquals(beer.getName(), Miguel.NAME);
    assertEquals(beer.getPrice(), Miguel.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMiguel() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.isaiaSpinelli.Miguel";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Miguel.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}