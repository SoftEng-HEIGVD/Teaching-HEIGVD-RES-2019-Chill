package ch.heigvd.res.chill.domain.jackeri;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GoldenSirup implements IProduct {

    public final static String NAME = "Golden Sirup";
    public final static BigDecimal PRICE = new BigDecimal(72.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
