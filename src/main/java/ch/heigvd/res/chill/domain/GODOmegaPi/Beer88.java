package ch.heigvd.res.chill.domain.GODOmegaPi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Beer88 implements IProduct {

    public final static String NAME = "88";
    public final static BigDecimal PRICE = new BigDecimal(0.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
