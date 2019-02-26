package ch.heigvd.res.chill.domain.lougranou;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class biereDuCanigou implements IProduct {

  public final static String NAME = "biereDuCanigou";
  public final static BigDecimal PRICE = new BigDecimal(6.75);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
