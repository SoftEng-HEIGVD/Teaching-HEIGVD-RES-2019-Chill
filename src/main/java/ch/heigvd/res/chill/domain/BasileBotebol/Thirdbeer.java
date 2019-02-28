package ch.heigvd.res.chill.domain.BasileBotebol;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Thirdbeer implements IProduct {

    public final static String NAME = "Thirdbeer";
    public final static BigDecimal PRICE = new BigDecimal(0.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
