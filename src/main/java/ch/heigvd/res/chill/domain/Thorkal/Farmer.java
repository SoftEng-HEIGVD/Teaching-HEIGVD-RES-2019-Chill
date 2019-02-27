package ch.heigvd.res.chill.domain.Thorkal;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Farmer implements IProduct {

    public final static String NAME = "Farmer";
    public final static BigDecimal PRICE = new BigDecimal(1.0);

    public BigDecimal getPrice() {
        return PRICE;
    }

    public String getName() {
        return NAME;
    }
}
