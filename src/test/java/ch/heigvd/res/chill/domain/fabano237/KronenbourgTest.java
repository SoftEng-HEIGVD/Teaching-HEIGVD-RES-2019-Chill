package ch.heigvd.res.chill.domain.fabano237;



import ch.heigvd.res.chill.domain.Bartender;

import ch.heigvd.res.chill.protocol.OrderRequest;

import ch.heigvd.res.chill.protocol.OrderResponse;

import org.junit.jupiter.api.Test;



import java.math.BigDecimal;



import static org.junit.jupiter.api.Assertions.assertEquals;



public class KronenbourgTest {



    @Test

    void thePriceAndNameForKronenbourgShouldBeCorrect() {

        Kronenbourg beer = new Kronenbourg();

        assertEquals(beer.getName(), Kronenbourg.NAME);

        assertEquals(beer.getPrice(), Kronenbourg.PRICE);

    }



    @Test

    void aBartenderShouldAcceptAnOrderForHeineken() {

        Bartender jane = new Bartender();

        String productName = "ch.heigvd.res.chill.domain.fabano237.Kronenbourg";

        OrderRequest request = new OrderRequest(3, productName);

        OrderResponse response = jane.order(request);

        BigDecimal expectedTotalPrice = Kronenbourg.PRICE.multiply(new BigDecimal(3));

        assertEquals(expectedTotalPrice, response.getTotalPrice());

    }



}