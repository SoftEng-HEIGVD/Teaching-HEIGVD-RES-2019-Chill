package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Celtia implements IProduct {
    public final static String NAME = "Celtia";
    public final static BigDecimal PRICE = new BigDecimal(2.5);

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


