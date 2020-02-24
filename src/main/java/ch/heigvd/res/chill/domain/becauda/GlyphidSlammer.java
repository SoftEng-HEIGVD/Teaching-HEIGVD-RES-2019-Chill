package ch.heigvd.res.chill.domain.becauda;

import ch.heigvd.res.chill.domain.IProduct;
import lombok.Getter;

import java.math.BigDecimal;

public class GlyphidSlammer implements IProduct {
    public final static String     NAME = "Glyphid Slammer";
    public final static BigDecimal PRICE = new BigDecimal(35.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
