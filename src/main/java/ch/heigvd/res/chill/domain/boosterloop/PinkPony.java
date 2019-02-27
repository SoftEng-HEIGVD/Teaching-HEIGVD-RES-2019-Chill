package ch.heigvd.res.chill.domain.boosterloop;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class PinkPony implements IProduct {
    public final static String NAME = "Pink Pony Reloaded";
    public final static BigDecimal PRICE = new BigDecimal(3.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
