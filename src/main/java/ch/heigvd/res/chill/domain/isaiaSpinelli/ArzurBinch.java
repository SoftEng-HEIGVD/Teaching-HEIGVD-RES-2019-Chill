package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class ArzurBinch implements IProduct{

    public final static String NAME = "ArzurBinch";
    public final static BigDecimal PRICE = new BigDecimal(77.8);


    public String getName() {
        return NAME;
    }


    public BigDecimal getPrice() {
        return PRICE;
    }

}
