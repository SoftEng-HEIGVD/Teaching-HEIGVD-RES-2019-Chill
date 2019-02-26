package ch.heigvd.res.chill.domain.Koffi94;

import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class Chupacabra implements IProduct{
    public final static String NAME = "Chupacabra";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
