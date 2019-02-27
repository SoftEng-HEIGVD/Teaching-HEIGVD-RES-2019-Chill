package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Gapeno implements IProduct {

    public final static String NAME = "Gapeno";
    public final static BigDecimal PRICE = new BigDecimal(10.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
