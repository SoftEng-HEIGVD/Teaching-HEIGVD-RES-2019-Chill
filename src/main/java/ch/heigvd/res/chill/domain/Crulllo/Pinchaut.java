package ch.heigvd.res.chill.domain.Crulllo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pinchaut implements IProduct {

    public final static String NAME = "Pinchaut";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
