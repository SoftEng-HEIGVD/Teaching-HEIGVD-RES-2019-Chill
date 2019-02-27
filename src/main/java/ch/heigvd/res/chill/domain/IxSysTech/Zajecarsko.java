package ch.heigvd.res.chill.domain.IxSysTech;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Zajecarsko implements IProduct{

    public final static String NAME = "Zajecarsko";
    public final static BigDecimal PRICE = new BigDecimal(8.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
