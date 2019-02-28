package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Calvinus implements IProduct {
    public static final String NAME = "Calvinus";
    public static final BigDecimal PRICE = new BigDecimal(1.5);


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
