package ch.heigvd.res.chill.domain.nyg;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Fix implements IProduct {

  public final static String NAME = "Fix";
  public final static BigDecimal PRICE = new BigDecimal(3.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
