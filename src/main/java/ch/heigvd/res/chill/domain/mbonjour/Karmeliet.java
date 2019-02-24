package ch.heigvd.res.chill.domain.mbonjour;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Karmeliet implements IProduct {

    public static final String NAME = "Triple Karmeliet";
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
