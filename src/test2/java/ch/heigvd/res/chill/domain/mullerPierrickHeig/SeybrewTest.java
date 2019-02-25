package ch.heigvd.res.chill.domain.mullerPierrickHeig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.mullerPierrickHeig.Seybrew;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeybrewTest {

  @Test
  void thePriceAndNameForSeybrewShouldBeCorrect() {
    Seybrew beer = new Seybrew();
    assertEquals(beer.getName(), Seybrew.NAME);
    assertEquals(beer.getPrice(), Seybrew.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSeybrew() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mullerPierrickHeig.Seybrew";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Seybrew.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}