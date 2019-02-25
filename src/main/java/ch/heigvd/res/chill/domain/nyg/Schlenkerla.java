package ch.heigvd.res.chill.domain.nyg;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Schlenkerla implements IProduct {

  public final static String NAME = "Schlenkerla";
  public final static BigDecimal PRICE = new BigDecimal(7.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
