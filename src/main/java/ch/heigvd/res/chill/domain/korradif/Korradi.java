package ch.heigvd.res.chill.domain.korradif;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Korradi implements IProduct {
    public final static String NAME = "Korradi";
    public final static BigDecimal PRICE = new BigDecimal(3.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
