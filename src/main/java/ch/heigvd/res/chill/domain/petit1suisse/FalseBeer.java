package ch.heigvd.res.chill.domain.petit1suisse;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class FalseBeer implements IProduct {
    public final static String NAME = "FalseBeer";
    public final static BigDecimal PRICE = new BigDecimal(10000000.20);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
