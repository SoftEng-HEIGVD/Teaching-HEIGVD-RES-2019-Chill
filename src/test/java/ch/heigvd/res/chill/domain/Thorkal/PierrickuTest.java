package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PierrickuTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Pierricku beer = new Pierricku();
        assertEquals(beer.getName(), Pierricku.NAME);
        assertEquals(beer.getPrice(), Pierricku.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Thorkal.Pierricku";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Pierricku.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}