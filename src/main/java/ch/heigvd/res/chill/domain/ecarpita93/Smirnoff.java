package ch.heigvd.res.chill.domain.ecarpita93;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Smirnoff implements IProduct {

    public final static String NAME = "Smirnoff";
    public final static BigDecimal PRICE = new BigDecimal(3.3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
