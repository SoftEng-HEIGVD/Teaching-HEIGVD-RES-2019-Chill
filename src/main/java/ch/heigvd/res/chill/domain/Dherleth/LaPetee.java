package ch.heigvd.res.chill.domain.Dherleth;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaPetee implements IProduct {

  public final static String NAME = "LaPetee";
  public final static BigDecimal PRICE = new BigDecimal(1.89);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
