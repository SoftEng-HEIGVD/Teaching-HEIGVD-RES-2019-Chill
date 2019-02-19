package ch.heigvd.res.chill.domain.andresMoreno96;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.andresMoreno96.DragonBeer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DragonBeerTest {

  @Test
  void thePriceAndNameForDragonBeerShouldBeCorrect() {
    DragonBeer beer = new DragonBeer();
    assertEquals(beer.getName(), DragonBeer.NAME);
    assertEquals(beer.getPrice(), DragonBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDragonBeer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.andresMoreno96.DragonBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DragonBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}