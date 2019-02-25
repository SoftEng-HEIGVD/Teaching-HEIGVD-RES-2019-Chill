package ch.heigvd.res.chill.domain.RobelT;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ChickenBeer implements IProduct {

    public final static String NAME = "ChickenBeer";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
