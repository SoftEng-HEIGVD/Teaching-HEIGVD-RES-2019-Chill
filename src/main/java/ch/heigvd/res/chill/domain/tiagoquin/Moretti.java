package ch.heigvd.res.chill.domain.tiagoquin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;


public class Moretti implements IProduct {
    public final static String NAME = "Moretti";
    public final static BigDecimal PRICE = new BigDecimal(4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }



}
