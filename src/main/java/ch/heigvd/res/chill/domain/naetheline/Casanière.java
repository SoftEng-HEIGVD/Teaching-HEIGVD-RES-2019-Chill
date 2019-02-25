package ch.heigvd.res.chill.domain.naetheline;

/**
 * Created by nathalie on 18/02/19.
 */
import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Casanière implements IProduct {

    public final static String NAME = "Casanière";
    public final static BigDecimal PRICE = new BigDecimal(4.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
