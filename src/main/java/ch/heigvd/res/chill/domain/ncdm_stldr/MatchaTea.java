package ch.heigvd.res.chill.domain.ncdm_stldr;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class MatchaTea  implements IProduct {

    public final static String NAME = "Matcha Tea";
    public final static BigDecimal PRICE = new BigDecimal(1.9);

    @Override
    public String getName() { return NAME; }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}
