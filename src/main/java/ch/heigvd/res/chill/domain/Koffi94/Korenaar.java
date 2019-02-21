package ch.heigvd.res.chill.domain.Koffi94;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Korenaar implements IProduct{
    public final static String NAME = "Korenaar";
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
