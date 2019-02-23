package ch.heigvd.res.chill.domain.Tsimwi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.Tsimwi.VaultSweetPotatoAle;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VaultSweetPotatoAleTest {

  @Test
  void thePriceAndNameForVaultSweetPotatoAleShouldBeCorrect() {
    VaultSweetPotatoAle beer = new VaultSweetPotatoAle();
    assertEquals(beer.getName(), VaultSweetPotatoAle.NAME);
    assertEquals(beer.getPrice(), VaultSweetPotatoAle.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForVaultSweetPotatoAle() {
    int quantity = 42;
    BigDecimal quantityCalc = new BigDecimal(quantity);

    Bartender johnny = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Tsimwi.VaultSweetPotatoAle";
    OrderRequest request = new OrderRequest(quantity, productName);
    OrderResponse response = johnny.order(request);
    BigDecimal expectedTotalPrice = VaultSweetPotatoAle.PRICE.multiply(quantityCalc);
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}