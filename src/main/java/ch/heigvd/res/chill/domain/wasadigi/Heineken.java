package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Heineken implements IProduct {
    public static final String NAME = "Heineken";
    public static final BigDecimal PRICE = new BigDecimal(2.5);

    @Override
    public String getName() { return NAME; }

    @Override
    public BigDecimal getPrice() { return PRICE; }
}
