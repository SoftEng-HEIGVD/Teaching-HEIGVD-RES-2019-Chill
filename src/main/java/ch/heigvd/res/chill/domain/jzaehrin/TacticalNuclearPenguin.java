package ch.heigvd.res.chill.domain.jzaehrin;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class TacticalNuclearPenguin implements IProduct {
    public final static String NAME = "Brewdog Tactical Nuclear Penguin";
    public final static BigDecimal PRICE = new BigDecimal(40);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
