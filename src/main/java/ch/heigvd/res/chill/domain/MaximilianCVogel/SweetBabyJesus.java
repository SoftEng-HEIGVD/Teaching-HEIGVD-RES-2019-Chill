package ch.heigvd.res.chill.domain.MaximilianCVogel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SweetBabyJesus implements IProduct {

  public final static String NAME = "Sweet Baby Jesus";
  public final static BigDecimal PRICE = new BigDecimal(4.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
