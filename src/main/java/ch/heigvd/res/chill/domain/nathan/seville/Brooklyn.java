package ch.heigvd.res.chill.domain.nathan.seville;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Brooklyn implements IProduct {

  public final static String NAME = "Brooklyn";
  public final static BigDecimal PRICE = new BigDecimal(5.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
