package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Yukimidaifuku implements IProduct {
    public final static String NAME = "Yukimidaifuku";
    public final static BigDecimal PRICE = new BigDecimal(1.50);

    @Override
    public String getName(){ return NAME; }

    @Override
    public BigDecimal getPrice(){ return PRICE; }
}
