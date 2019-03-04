package ch.heigvd.res.chill.domain.RengokuryuuHonokaCrimsonflame;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ChiffonCake implements IProduct {
    public final static String NAME = "Chiffon Cake";
    public final static BigDecimal PRICE = new BigDecimal(9.50);

    @Override
    public String getName(){ return NAME; }

    @Override
    public BigDecimal getPrice(){ return PRICE; }
}
