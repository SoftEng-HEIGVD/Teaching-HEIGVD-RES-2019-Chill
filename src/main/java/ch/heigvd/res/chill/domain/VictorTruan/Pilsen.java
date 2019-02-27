package ch.heigvd.res.chill.domain.VictorTruan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pilsen implements IProduct {
    public final static String NAME = "Pilsen";
    public final static BigDecimal PRICE = new BigDecimal(6.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}