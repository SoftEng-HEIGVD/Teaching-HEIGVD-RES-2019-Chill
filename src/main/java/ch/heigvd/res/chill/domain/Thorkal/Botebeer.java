package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Botebeer implements IProduct {

    public final static String NAME = "Botebeer";
    public final static BigDecimal PRICE = new BigDecimal(9.7);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
