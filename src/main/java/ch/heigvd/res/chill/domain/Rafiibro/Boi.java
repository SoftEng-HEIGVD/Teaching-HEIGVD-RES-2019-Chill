package ch.heigvd.res.chill.domain.Rafiibro;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Boi implements IProduct {

    public final static String NAME = "Boi";
    public final static BigDecimal PRICE = new BigDecimal(6.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
