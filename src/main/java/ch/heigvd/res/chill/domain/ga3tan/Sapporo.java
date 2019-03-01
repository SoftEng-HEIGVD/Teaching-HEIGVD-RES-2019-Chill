package ch.heigvd.res.chill.domain.ga3tan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sapporo implements IProduct {
    public final static String NAME = "Sapporo";
    public final static BigDecimal PRICE = new BigDecimal(4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
