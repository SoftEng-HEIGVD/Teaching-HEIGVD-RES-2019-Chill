package ch.heigvd.res.chill.domain.mbonjour;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class EndOfTheWorld implements IProduct {
    public final static String NAME = "La Fin Du Monde";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
