package ch.heigvd.res.chill.domain.mtutic;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Lasko implements IProduct {

  public final static String NAME = "Lasko";
  public final static BigDecimal PRICE = new BigDecimal(1.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
