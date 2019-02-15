package ch.heigvd.res.chill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BartenderTest {

  @Test
  void aBartenderShouldReplyToGreetings() {
    Bartender john = new Bartender();
    String response = john.greet("hello");
    assertEquals("hello, how can I help you?", response);
  }
}