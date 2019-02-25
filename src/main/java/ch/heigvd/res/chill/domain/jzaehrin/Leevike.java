package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Leevike implements IProduct {
    public final static String NAME = "Pohjala Leevike";
    public final static BigDecimal PRICE = new BigDecimal(4.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
