package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Omuraisu implements IProduct {
    public final static String NAME = "Omuraisu";
    public final static BigDecimal PRICE = new BigDecimal(10.00);

    @Override
    public String getName(){ return NAME; }

    @Override
    public BigDecimal getPrice(){ return PRICE; }
}
