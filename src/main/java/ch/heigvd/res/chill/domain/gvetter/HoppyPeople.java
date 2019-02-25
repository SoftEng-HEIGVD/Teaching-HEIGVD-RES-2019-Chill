package ch.heigvd.res.chill.domain.gvetter;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class HoppyPeople implements IProduct {

    public final static String NAME = "HoppyPeople";
    public final static BigDecimal PRICE = new BigDecimal(5.3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
