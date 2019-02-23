package ch.heigvd.res.chill.domain.scout407;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Brandini implements IProduct {

    public final static String NAME = "Brandini";
    public final static BigDecimal PRICE = new BigDecimal(10.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
