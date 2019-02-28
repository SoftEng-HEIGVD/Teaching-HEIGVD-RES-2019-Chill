package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Narke implements IProduct{
    public final static String NAME = "Närke Kaggen Stormaktsporter";
    public final static BigDecimal PRICE = new BigDecimal(6.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
