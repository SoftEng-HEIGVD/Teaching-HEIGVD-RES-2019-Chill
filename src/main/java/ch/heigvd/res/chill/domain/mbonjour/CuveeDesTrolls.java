package ch.heigvd.res.chill.domain.mbonjour;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CuveeDesTrolls implements IProduct {
    public final static String NAME = "Cuvée des Trolls";
    public final static BigDecimal PRICE = new BigDecimal(6.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
