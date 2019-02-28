package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class FriMousse implements IProduct {
    public static final String NAME = "Fri-Mousse";
    public static final BigDecimal PRICE = new BigDecimal(2.5);


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
