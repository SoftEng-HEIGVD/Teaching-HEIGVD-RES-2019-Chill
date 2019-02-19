package ch.heigvd.res.chill.domain.pagedidier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaBlonde implements IProduct {

    public final static String NAME = "Les trois dames : La blonde";
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
