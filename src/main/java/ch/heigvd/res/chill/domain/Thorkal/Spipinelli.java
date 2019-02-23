package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Spipinelli implements IProduct {

    public final static String NAME = "Spipinelli";
    public final static BigDecimal PRICE = new BigDecimal(6.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
