package ch.heigvd.res.chill.domain.zoubaidas;



import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BarbourMonAmour implements IProduct {

    public final static String NAME = "BarbourMonAmour";
    public final static BigDecimal PRICE = new BigDecimal(666);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
