package ch.heigvd.res.chill.domain.nfluckiger;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tea implements IProduct {

    public final static String NAME = "Tea";
    public final static BigDecimal PRICE = new BigDecimal(1.1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
