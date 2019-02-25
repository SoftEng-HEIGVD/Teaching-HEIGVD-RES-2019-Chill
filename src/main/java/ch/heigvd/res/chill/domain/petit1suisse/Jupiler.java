package ch.heigvd.res.chill.domain.petit1suisse;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Jupiler implements IProduct {
    public final static String NAME = "Jupiler";
    public final static BigDecimal PRICE = new BigDecimal(1.20);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
