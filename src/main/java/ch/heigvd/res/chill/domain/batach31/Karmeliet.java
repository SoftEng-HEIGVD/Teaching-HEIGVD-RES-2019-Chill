package ch.heigvd.res.chill.domain.batach31;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Karmeliet implements IProduct{
    public final static String NAME = "Karmeliet";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
