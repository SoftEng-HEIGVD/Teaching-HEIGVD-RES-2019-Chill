package ch.heigvd.res.chill.domain.VictorTruan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;


public class Bintang implements IProduct{
    public final static String NAME = "Bintang";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}