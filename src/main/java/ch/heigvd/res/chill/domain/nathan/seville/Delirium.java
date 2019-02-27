package ch.heigvd.res.chill.domain.nathan.seville;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Delirium implements IProduct {

  public final static String NAME = "Delirium";
  public final static BigDecimal PRICE = new BigDecimal(8.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
