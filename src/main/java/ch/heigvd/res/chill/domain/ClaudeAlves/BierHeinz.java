package ch.heigvd.res.chill.domain.ClaudeAlves;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BierHeinz implements IProduct{
    public final static String NAME = "BierHeinz";
    public final static BigDecimal PRICE = new BigDecimal(9.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
