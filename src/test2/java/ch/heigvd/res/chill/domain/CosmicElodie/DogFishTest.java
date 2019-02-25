package ch.heigvd.res.chill.domain.CosmicElodie;
import static org.junit.jupiter.api.Assertions.*;

import ch.heigvd.res.chill.domain.Bartender;
import org.junit.jupiter.api.Test;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;



class DogFishTest
{
    @Test
    void PriceAndNameForDogFishShouldBeCorrect() {
        DogFish beer = new DogFish();
        assertEquals(beer.getName(), DogFish.NAME);
        assertEquals(beer.getPrice(), DogFish.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDogFish() {
        Bartender john = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CosmicElodie.DogFish";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = john.order(request);
        BigDecimal expectedTotalPrice = DogFish.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}