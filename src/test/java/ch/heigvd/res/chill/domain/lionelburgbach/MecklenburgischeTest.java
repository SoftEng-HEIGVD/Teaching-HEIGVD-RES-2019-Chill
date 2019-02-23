package ch.heigvd.res.chill.domain.lionelburgbach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MecklenburgischeTest {

  @Test
  void thePriceAndNameForMecklenburgischeShouldBeCorrect() {
    Mecklenburgische beer = new Mecklenburgische();
    assertEquals(beer.getName(), Mecklenburgische.NAME);
    assertEquals(beer.getPrice(), Mecklenburgische.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMecklenburgische() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lionelburgbach.Mecklenburgische";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Mecklenburgische.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}