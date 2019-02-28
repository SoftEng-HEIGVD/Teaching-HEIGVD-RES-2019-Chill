package ch.heigvd.res.chill.domain.CosmicElodie;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;


public class IceTeaMigros implements IProduct
{
    public final static String NAME = "Ice Tea migros";
    public final static BigDecimal PRICE = new BigDecimal(2.6);

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
