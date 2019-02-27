package ch.heigvd.res.chill.domain.gvetter;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.gvetter.HoppyPeople;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HoppyPeopleTest {

  @Test
  void thePriceAndNameForHoppyPeopleShouldBeCorrect() {
    HoppyPeople beer = new HoppyPeople();
    assertEquals(beer.getName(), HoppyPeople.NAME);
    assertEquals(beer.getPrice(), HoppyPeople.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHoppyPeople() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.gvetter.HoppyPeople";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = HoppyPeople.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}