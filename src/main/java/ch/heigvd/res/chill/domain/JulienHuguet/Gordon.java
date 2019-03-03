package ch.heigvd.res.chill.domain.JulienHuguet;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;
public class Gordon implements IProduct {
    public final static String NAME = "Gordon";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName(){
        return NAME;
    }
    @Override
    public BigDecimal getPrice(){
        return PRICE;
    }

}
