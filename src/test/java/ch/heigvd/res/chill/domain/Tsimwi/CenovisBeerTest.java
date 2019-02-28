package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CenovisBeerTest {

  @Test
  void thePriceAndNameForCenovisBeerShouldBeCorrect() {
    CenovisBeer beer = new CenovisBeer();
    assertEquals(beer.getName(), CenovisBeer.NAME);
    assertEquals(beer.getPrice(), CenovisBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCenovisBeer() {
    Bartender doris = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.CenovisBeer";
    OrderRequest request = new OrderRequest(4, productName);
    OrderResponse response = doris.order(request);
    BigDecimal expectedTotalPrice = CenovisBeer.PRICE.multiply(new BigDecimal(4));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}