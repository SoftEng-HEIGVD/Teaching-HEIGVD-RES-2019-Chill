package ch.heigvd.res.chill.domain.samirkovitch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Truan implements IProduct {

  public final static String NAME = "Truan";
  public final static BigDecimal PRICE = new BigDecimal(20.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
