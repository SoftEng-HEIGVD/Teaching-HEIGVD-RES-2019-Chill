package ch.heigvd.res.chill.domain;

import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BartenderTest {

  @Test
  void aBartenderShouldReplyToGreetings() {
    Bartender john = new Bartender();
    GreetingsRequest request = new GreetingsRequest("Hi there");
    GreetingsResponse response = john.greet(request);
    assertEquals("hello, how can I help you?", response.getText());
  }

  @Test
  void aBartenderShouldCheckIfOlivierIsNotTooDrunk(){
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.Boxer";
    OrderRequest request = new OrderRequest(3, productName, 4);
    OrderResponse response = jane.order(request);
    // The right answer is said by the bartender
    assertEquals("Sorry Olivier you're too drunk now !", response.getText());
    // The bartender should return 0 beer so totalPrice = 0
    assertEquals(new BigDecimal(0), response.getTotalPrice());
  }
}