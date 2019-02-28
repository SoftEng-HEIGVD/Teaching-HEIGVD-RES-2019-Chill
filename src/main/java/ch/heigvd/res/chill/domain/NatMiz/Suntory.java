package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Suntory implements IProduct {
    public final static String NAME = "Suntory";
    public final static BigDecimal PRICE = new BigDecimal(2.9);

    @Override
    public String getName(){return NAME;}

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
