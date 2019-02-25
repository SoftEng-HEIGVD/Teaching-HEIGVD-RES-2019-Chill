package ch.heigvd.res.chill.domain.zereddiamond;


import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

//inspired by the other classes for others beers
public class DrGabsChameau implements IProduct {
    public static final String NAME = "Dr Gab's Chameau";
    public static final BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
