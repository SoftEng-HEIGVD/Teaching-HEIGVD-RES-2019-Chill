package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuzeCoca implements IProduct {
    public final static String NAME = "Suze Coca";
    public final static BigDecimal PRICE = new BigDecimal(6.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}