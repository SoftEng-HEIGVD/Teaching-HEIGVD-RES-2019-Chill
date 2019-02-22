package ch.heigvd.res.chill.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BartenderTest {

    @Test
    void aBartenderShouldReplyToGreetings() {
        Bartender jhon = new Bartender();
        String response = jhon.great("hello");
        assertEquals("hello, how can help you?", response);
    }
}