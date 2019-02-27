package ch.heigvd.res.chill.domain.oTwoWin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Grolsch implements IProduct {
    public final static String NAME = "Grolsch";
    public final static BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
