package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Athena implements IProduct{

    public final static String NAME = "Athena";
    public final static BigDecimal PRICE = new BigDecimal(3.6);

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
