package ch.heigvd.res.chill.domain.scout407;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

//new
public class MarsBlast implements IProduct {

    public final static String NAME = "Marsblast";
    public final static BigDecimal PRICE = new BigDecimal(13.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
