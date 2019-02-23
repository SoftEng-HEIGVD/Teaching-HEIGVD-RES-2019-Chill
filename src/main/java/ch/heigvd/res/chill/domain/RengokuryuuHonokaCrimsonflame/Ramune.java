package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Ramune implements IProduct {
    public final static String NAME = "Ramune";
    public final static BigDecimal PRICE = new BigDecimal(1.20);

    @Override
    public String getName(){ return NAME; }

    @Override
    public BigDecimal getPrice(){ return PRICE; }
}
