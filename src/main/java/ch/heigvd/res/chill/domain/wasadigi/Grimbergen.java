package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.IProduct;

import javax.naming.Name;
import java.math.BigDecimal;

public class Grimbergen implements IProduct {
    public final static String NAME = "Grimbergen";
    public final static BigDecimal PRICE = new BigDecimal(3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
