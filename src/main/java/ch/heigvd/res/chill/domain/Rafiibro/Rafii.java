package ch.heigvd.res.chill.domain.Rafiibro;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Rafii implements IProduct {

    public final static String NAME = "Rafii";
    public final static BigDecimal PRICE = new BigDecimal(14);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
