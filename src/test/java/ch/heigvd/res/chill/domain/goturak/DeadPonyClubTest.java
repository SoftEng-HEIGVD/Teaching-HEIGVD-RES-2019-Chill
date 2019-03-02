package ch.heigvd.res.chill.domain.goturak;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeadPonyClubTest {

  @Test
  void thePriceAndNameForDeadPonyClubShouldBeCorrect() {
    DeadPonyClub beer = new DeadPonyClub();
    assertEquals(beer.getName(), DeadPonyClub.NAME);
    assertEquals(beer.getPrice(), DeadPonyClub.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDeadPonyClub() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.goturak.DeadPonyClub";
    OrderRequest request = new OrderRequest(5, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DeadPonyClub.PRICE.multiply(new BigDecimal(5));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}