package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BlueMoon implements IProduct {
    public final static String NAME = "Blue Moon";
    public final static BigDecimal PRICE = new BigDecimal(4.4);

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public BigDecimal getPrice()
    {
        return PRICE;
    }
}

