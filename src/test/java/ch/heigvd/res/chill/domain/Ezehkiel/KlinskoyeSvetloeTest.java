package ch.heigvd.res.chill.domain.Ezehkiel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KlinskoyeSvetloeTest {

  @Test
  void thePriceAndNameForKlinskoyeSvetloeShouldBeCorrect() {
    KlinskoyeSvetloe beer = new KlinskoyeSvetloe();
    assertEquals(beer.getName(), KlinskoyeSvetloe.NAME);
    assertEquals(beer.getPrice(), KlinskoyeSvetloe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKlinskoyeSvetloe() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ezehkiel.KlinskoyeSvetloe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = KlinskoyeSvetloe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}