package ch.heigvd.res.chill.domain.zoubaidas;



import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class EL33 implements IProduct {

    public final static String NAME = "EL33";
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
