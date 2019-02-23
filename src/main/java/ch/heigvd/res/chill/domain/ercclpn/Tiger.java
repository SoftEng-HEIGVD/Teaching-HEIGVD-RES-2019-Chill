package ch.heigvd.res.chill.domain.ercclpn;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tiger implements IProduct {

  public final static String NAME = "Tiger";
  public final static BigDecimal PRICE = new BigDecimal(2.701);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
