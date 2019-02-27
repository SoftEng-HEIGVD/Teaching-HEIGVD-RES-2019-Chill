package ch.heigvd.res.chill.domain.Jael24;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Hoegaarden implements IProduct {

    public final static String NAME = "Hoegaarden";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
