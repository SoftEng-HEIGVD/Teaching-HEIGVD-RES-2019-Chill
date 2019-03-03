package ch.heigvd.res.chill.domain.petit1suisse;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Wasagidi implements IProduct {
    public final static String NAME = "Wasagidi";
    public final static BigDecimal PRICE = new BigDecimal(999999.99);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
