package ch.heigvd.res.chill.domain.naetheline;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

/**
 * Created by nathalie on 22/02/19.
 */
public class SaintBonChien implements IProduct {
    public final static String NAME = "Saint Bon Chien";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
