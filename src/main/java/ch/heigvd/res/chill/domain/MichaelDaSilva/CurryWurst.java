package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CurryWurst implements IProduct{
    public final static String NAME = "Curry Wurst";
    public final static BigDecimal PRICE = new BigDecimal(7.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
