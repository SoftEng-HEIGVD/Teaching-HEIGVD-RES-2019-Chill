package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Fleurac implements IProduct {
    public final static String NAME = "Fleurac";
    public final static BigDecimal PRICE = new BigDecimal(2.5);

    @Override
    public String getName(){return NAME;}

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
