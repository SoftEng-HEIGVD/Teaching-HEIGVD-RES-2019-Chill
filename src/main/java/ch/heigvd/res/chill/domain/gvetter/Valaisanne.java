package ch.heigvd.res.chill.domain.gvetter;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Valaisanne implements IProduct {

    public final static String NAME = "Valaisanne";
    public final static BigDecimal PRICE = new BigDecimal(2.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
