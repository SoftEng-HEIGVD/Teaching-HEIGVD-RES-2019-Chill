package ch.heigvd.res.chill.domain.NatMiz;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sapporo implements IProduct {
    public final static String NAME = "Sapporo";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName(){return NAME;}

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
