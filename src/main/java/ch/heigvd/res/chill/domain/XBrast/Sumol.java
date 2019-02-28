package ch.heigvd.res.chill.domain.XBrast;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sumol implements IProduct {

    public final static String NAME = "Sumol";
    public final static BigDecimal PRICE = new BigDecimal(1.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}