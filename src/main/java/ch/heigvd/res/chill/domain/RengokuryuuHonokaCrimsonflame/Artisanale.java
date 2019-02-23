package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Artisanale implements IProduct {
    public final static String NAME = "Bière artisanale";
    public final static BigDecimal PRICE = new BigDecimal(3.50);

    @Override
    public String getName(){ return NAME; }

    @Override
    public BigDecimal getPrice(){ return PRICE; }
}
