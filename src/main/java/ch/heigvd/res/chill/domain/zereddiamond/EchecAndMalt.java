package ch.heigvd.res.chill.domain.zereddiamond;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class EchecAndMalt implements IProduct {
    public static final String NAME = "Echec And Malt";
    public static final BigDecimal PRICE = new BigDecimal(4.5);


    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
