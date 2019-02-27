package ch.heigvd.res.chill.domain.Cell00phane;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Apollonia implements IProduct {

    public final static String NAME = "Apollonia";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
