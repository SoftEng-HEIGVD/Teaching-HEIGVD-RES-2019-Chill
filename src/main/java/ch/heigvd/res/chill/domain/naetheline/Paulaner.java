package ch.heigvd.res.chill.domain.naetheline;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

/**
 * Created by nathalie on 25/02/19.
 */
public class Paulaner implements IProduct {

    public final static String NAME = "Paulaner";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
