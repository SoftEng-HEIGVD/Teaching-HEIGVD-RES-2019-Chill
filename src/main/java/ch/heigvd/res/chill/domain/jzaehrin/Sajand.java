package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sajand implements IProduct {
    public final static String NAME = "Sajand";
    public final static BigDecimal PRICE = new BigDecimal(7);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
