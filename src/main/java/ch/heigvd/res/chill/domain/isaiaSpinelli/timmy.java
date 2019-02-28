package ch.heigvd.res.chill.domain.isaiaSpinelli;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class timmy implements IProduct {

  public final static String NAME = "timmy";
  public final static BigDecimal PRICE = new BigDecimal(0.05);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
