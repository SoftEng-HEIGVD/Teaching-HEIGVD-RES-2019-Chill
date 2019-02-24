package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SinkTheBismarck implements IProduct {
    public final static String NAME = "Brewdog Sink the Bismarck";
    public final static BigDecimal PRICE = new BigDecimal(81);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
