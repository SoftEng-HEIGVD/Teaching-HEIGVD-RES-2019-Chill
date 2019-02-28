package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Gerardi implements IProduct{

    public final static String NAME = "Gerardi";
    public final static BigDecimal PRICE = new BigDecimal(2);


    public String getName() {
        return NAME;
    }


    public BigDecimal getPrice() {
        return PRICE;
    }

}
