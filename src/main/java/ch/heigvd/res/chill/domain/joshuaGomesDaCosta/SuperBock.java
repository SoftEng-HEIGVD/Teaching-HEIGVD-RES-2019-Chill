package ch.heigvd.res.chill.domain.joshuaGomesDaCosta;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuperBock implements IProduct {

    public final static String NAME = "SuperBock";
    public final static BigDecimal PRICE = new BigDecimal(1.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}


