package ch.heigvd.res.chill.domain.ncdm_stldr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ClubMateTest {

    @Test
    void thePriceAndNameForClubMateShouldBeCorrect() {
        ClubMate clubMate = new ClubMate();
        assertEquals(clubMate.NAME, clubMate.getName());
        assertEquals(clubMate.PRICE, clubMate.getPrice());
    }

    @Test
    void aBartenderShouldAcceptAnOrderForClubMate() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.ncdm_stldr.ClubMate";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ClubMate.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}