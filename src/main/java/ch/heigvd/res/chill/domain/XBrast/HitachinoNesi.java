package ch.heigvd.res.chill.domain.XBrast;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class HitachinoNesi implements IProduct{

    public final static String NAME = "Hitachino Nesi";
    public final static BigDecimal PRICE = new BigDecimal(5.95);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
